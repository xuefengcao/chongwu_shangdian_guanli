$().ready(function() {

});

var prefix = "/sys/gongshang"

function save() {
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

