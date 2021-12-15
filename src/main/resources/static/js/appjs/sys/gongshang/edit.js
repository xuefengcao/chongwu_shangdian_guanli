// 以下为官方示例
$().ready(function() {
    var userId1= $('#userId1').val();
    $('#userId').val(userId1);
    var shiguTypeId1= $('#shiguTypeId1').val();
    $('#shiguTypeId').val(shiguTypeId1);
    var serialNumber1= $('#serialNumber1').val();
    $('#serialNumber').val(serialNumber1);
    var canjiLevelId1= $('#canjiLevelId1').val();
    $('#canjiLevelId').val(canjiLevelId1);

});

var prefix = "/sys/gongshang"
function update() {
    var remark= $('#remark').val();
    if(remark==null || remark == ''){
        layer.msg("事故经过不能为空");
        return false;
    }
    var details= $('#details').val();
    if(details==null || details == ''){
        layer.msg("受伤部位不能为空");
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
