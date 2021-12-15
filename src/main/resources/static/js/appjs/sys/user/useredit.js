// 以下为官方示例
$().ready(function() {
	// $("#signupForm").validate();
});

function update() {

	$.ajax({
		cache : true,
		type : "POST",
		url : "/sys/user/updateuser",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg(data.msg);
			} else {
				parent.layer.msg(data.msg);
			}

		}
	});

}
