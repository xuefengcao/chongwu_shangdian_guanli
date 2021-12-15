// 以下为官方示例
$().ready(function() {
    var peixunTypeId1= $('#peixunTypeId1').val();
    $('#peixunTypeId').val(peixunTypeId1);


});

var prefix = "/sys/jiaoyupeixun"
function update() {
    var title= $('#title').val();
    if(title==null || title == ''){
        layer.msg("培训主题不能为空");
        return false;
    }
    var addr= $('#addr').val();
    if(addr==null || addr == ''){
        layer.msg("培训地点不能为空");
        return false;
    }

    var peixunTime= $('#jianchaStartTime').val();
    if(peixunTime==null || peixunTime == ''){
        layer.msg("培训时间不能为空");
        return false;
    }
    var peixunTypeId= $('#peixunTypeId').val();
    if(peixunTypeId==null || peixunTypeId == ''){
        layer.msg("培训类型不能为空");
        return false;
    }
    var remark= $('#remark').val();
    if(remark==null || remark == ''){
        layer.msg("培训对象不能为空");
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
