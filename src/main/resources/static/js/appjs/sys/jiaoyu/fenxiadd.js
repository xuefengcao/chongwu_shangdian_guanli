$().ready(function() {

});

var prefix = "/sys/jiaoyu"

function save() {

    var jiaoyuTypeId= $('#jiaoyuTypeId').val();
    if(jiaoyuTypeId==null || jiaoyuTypeId == ''){
        layer.msg("培训标题不能为空");
        return false;
    }
    var remark= $('#remark').val();
    if(remark==null || remark == ''){
        layer.msg("总结培训效果不能为空");
        return false;
    }
    var bumen= $('#bumen').val();
    if(bumen==null || bumen == ''){
        layer.msg("分析此次培训不能为空");
        return false;
    }

	$.ajax({
		cache : true,
		type : "POST",
		url : prefix+"/save",
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

