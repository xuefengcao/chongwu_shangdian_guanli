$().ready(function() {

});

var prefix = "/sys/shigu"

function save() {
    var title= $('#title').val();
	if(title==null || title == ''){
        layer.msg("标题不能为空");
        return false;
	}
    var addr= $('#addr').val();
    if(addr==null || addr == ''){
        layer.msg("发生地点不能为空");
        return false;
    }
    var remark= $('#remark').val();
    if(remark==null || remark == ''){
        layer.msg("原因描述不能为空");
        return false;
    }
    var results= $('#results').val();
    if(results==null || results == ''){
        layer.msg("处理结果不能为空");
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

