// 以下为官方示例
$().ready(function() {
    var leibieId1= $('#leibieId1').val();
    $('#leibieId').val(leibieId1);

    var userId1= $('#userId1').val();
    $('#userId').val(userId1);
});

var prefix = "/sys/shebei"
function update() {
    var shebeiId= $('#shebeiId').val();
    if(shebeiId==null || shebeiId == ''){
        layer.msg("设备编号不能为空");
        return false;
    }

    var goumaiTime= $('#goumaiTime').val();
    if(goumaiTime==null || goumaiTime == ''){
        layer.msg("使用开始时间不能为空");
        return false;
    }

    var endTime= $('#endTime').val();
    if(endTime==null || endTime == ''){
        layer.msg("使用结束时间不能为空");
        return false;
    }

    var userId= $('#userId').val();
    if(userId==null || userId == ''){
        layer.msg("使用员工不能为空");
        return false;
    }

    var shebeizhuangkuang= $('#shebeizhuangkuang').val();
    if(shebeizhuangkuang==null || shebeizhuangkuang == ''){
        layer.msg("描述不能为空");
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
