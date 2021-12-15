$().ready(function() {

});

var prefix = "/sys/weihuapin"

function save() {
    var name= $('#name').val();
    if(name==null || name == ''){
        layer.msg("名称不能为空");
        return false;
    }
    var userId= $('#userId').val();
    if(userId==null || userId == ''){
        layer.msg("负责人不能为空");
        return false;
    }

    var comInTime= $('#comInTime').val();
    if(comInTime==null || comInTime == ''){
        layer.msg("出入库时间时间不能为空");
        return false;
    }
    var shiyongUserId= $('#shiyongUserId').val();
    if(shiyongUserId==null || shiyongUserId == ''){
        layer.msg("使用人不能为空");
        return false;
    }
    var chuzhi= $('#chuzhi').val();
    if(chuzhi==null || chuzhi == ''){
        layer.msg("使用人不能为空");
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

