// 以下为官方示例
$().ready(function() {
    var jiluUserId1= $('#jiluUserId1').val();
    $('#jiluUserId').val(jiluUserId1);
    var zhuchiUserId1= $('#zhuchiUserId1').val();
    $('#zhuchiUserId').val(zhuchiUserId1);
    var serialNumber1= $('#serialNumber1').val();
    $('#serialNumber').val(serialNumber);

});

var prefix = "/sys/shigulog"
function update() {
    var title= $('#title').val();
    if(title==null || title == ''){
        layer.msg("会议标题不能为空");
        return false;
    }
    var addr= $('#addr').val();
    if(addr==null || addr == ''){
        layer.msg("会议地点不能为空");
        return false;
    }
    var remark= $('#remark').val();
    if(remark==null || remark == ''){
        layer.msg("会议内容不能为空");
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
