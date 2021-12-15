// 以下为官方示例
function updatepassword() {

	var password = $("#password").val();
	if(password=='' || password==null){
        layer.msg("新密码不能为空！");
        return false;
	}
    var newpassword = $("#newpassword").val();
    if(password != newpassword){
        layer.msg("新密码与确认密码不相等！");
        return false;
	}
	$.ajax({
		cache : true,
		type : "POST",
		url : "/sys/user/updatePwd",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				layer.msg(data.msg);

			} else {
				layer.msg(data.msg);
			}
		}
	});

}
