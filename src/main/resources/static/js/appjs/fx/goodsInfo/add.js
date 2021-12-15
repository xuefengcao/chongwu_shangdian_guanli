$().ready(function() {
    $('.summernote').summernote({
        height: '380px',
        lang: 'zh-CN',
        callbacks: {
            onImageUpload: function (files, editor, $editable) {
                sendFile(files);
            }
        }
    });
    layui.use('upload','form', function () {
        var upload = layui.upload;
        var form = layui.form;
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#goodsPic'
            , url: '/common/sysFile/upload'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#picShow').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
                $('#picShow').attr('src', res.fileName); //图片链接（base64）
                $("#goodsPicUrl").val(res.fileName);
            }
        });

        //监听指定开关
        form.on('switch(isHot)', function(data){
            console.log(data);
            console.log(this);
            layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });
            layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });

        //监听指定开关
        form.on('switch(isShelves)', function(data){
            console.log(data);
            console.log(this);
            layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });
            layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });
    });
    validateRule();

});

$.validator.setDefaults({
	submitHandler : function() {
		save();
	}
});
function save() {
    var goodsDesc = $(".summernote").summernote('code');
    $("#goodsDesc").val(goodsDesc);
	$.ajax({
		cache : true,
		type : "POST",
		url : "/fx/goodsInfo/save",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg("操作成功");
				parent.reLoad();
				var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
				parent.layer.close(index);

			} else {
				parent.layer.alert(data.msg)
			}

		}
	});

}
function validateRule() {
	var icon = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			name : {
				required : true
			}
		},
		messages : {
			name : {
				required : icon + "请输入姓名"
			}
		}
	})
}

var openCategory = function(){
    layer.open({
        type:2,
        title:"选择分类",
        area : [ '300px', '450px' ],
        content:"/fx/goodsCategory/treeView"
})
};
function loadCategory( deptId,deptName){
    $("#goodsCategoryId").val(deptId);
    $("#goodsCategoryName").val(deptName);
}