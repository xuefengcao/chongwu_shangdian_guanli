// 以下为官方示例
$().ready(function() {
    var userId1= $('#userId1').val();
    $('#userId').val(userId1);
    var ifYinhuan= $('#ifYinhuan1').val();
    $('#ifYinhuan').val(ifYinhuan);
    var yinhuanTypeId1= $('#yinhuanTypeId1').val();
    $('#yinhuanTypeId').val(yinhuanTypeId1);
    var yinhuanYanzhongId1= $('#yinhuanYanzhongId1').val();
    $('#yinhuanYanzhongId').val(yinhuanYanzhongId1);

});

var prefix = "/sys/anquanyinhuan"
function update() {
    var jianchaStartTime= $('#jianchaStartTime').val();
    if(jianchaStartTime==null || jianchaStartTime == ''){
        layer.msg("检查起始时间不能为空");
        return false;
    }
    var jianchaEndTime= $('#jianchaEndTime').val();
    if(jianchaEndTime==null || jianchaEndTime == ''){
        layer.msg("检查结束时间不能为空");
        return false;
    }
    var yinhuanRemark= $('#yinhuanRemark').val();
    if(yinhuanRemark==null || yinhuanRemark == ''){
        layer.msg("隐患描述不能为空");
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
