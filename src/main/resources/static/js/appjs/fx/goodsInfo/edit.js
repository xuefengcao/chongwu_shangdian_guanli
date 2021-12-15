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
    var goodsDesc = $("#goodsDesc").val();
    $('#goodsDescInput').summernote('code', goodsDesc);

    validateRule();

    layui.use('upload', function () {
        var upload = layui.upload;

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
    });

});

$.validator.setDefaults({

	submitHandler : function() {
		update();
	}
});
function update() {
    var goodsDesc = $(".summernote").summernote('code');
    $("#goodsDesc").val(goodsDesc);
	$.ajax({
		cache : true,
		type : "POST",
		url : "/fx/goodsInfo/update",
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
				required : icon + "请输入名字"
			}
		}
	});
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