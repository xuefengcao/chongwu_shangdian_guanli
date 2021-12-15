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

var prefix = "/sys/jiaoyu"
function update() {
    var jianchaStartTime= $('#jianchaStartTime').val();
    if(jianchaStartTime==null || jianchaStartTime == ''){
        layer.msg("教育时间不能为空");
        return false;
    }
    var jiaoyuTypeId= $('#jiaoyuTypeId').val();
    if(jiaoyuTypeId==null || jiaoyuTypeId == ''){
        layer.msg("教育类型不能为空");
        return false;
    }
    var remark= $('#remark').val();
    if(remark==null || remark == ''){
        layer.msg("教育内容不能为空");
        return false;
    }
    var bumen= $('#bumen').val();
    if(bumen==null || bumen == ''){
        layer.msg("教育部门不能为空");
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
