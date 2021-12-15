$().ready(function() {

});

var prefix = "/sys/anquanyinhuan"

function save() {
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

