// 以下为官方示例
$().ready(function() {
    var userId1= $('#userId1').val();
    $('#userId').val(userId1);
    var shiguTypeId1= $('#shiguTypeId1').val();
    $('#shiguTypeId').val(shiguTypeId1);
});

var prefix = "/sys/shigu"
function update() {
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
		url : prefix+"/update",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg(data.msg);
				parent.reLoad();
				var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
				parent.layer.close(index);

			} else {
				parent.layer.msg(data.msg);
			}

		}
	});

}
