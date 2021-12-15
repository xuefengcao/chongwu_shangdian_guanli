// 以下为官方示例
$().ready(function() {
    var leibieId1= $('#leibieId1').val();
    $('#leibieId').val(leibieId1);


});

var prefix = "/sys/shebei"
function update() {
    var leibieId= $('#leibieId').val();
    if(leibieId==null || leibieId == ''){
        layer.msg("设备类型不能为空");
        return false;
    }
    var goumaiTime= $('#goumaiTime').val();
    if(goumaiTime==null || goumaiTime == ''){
        layer.msg("购置日期不能为空");
        return false;
    }

    var xinghao= $('#xinghao').val();
    if(xinghao==null || xinghao == ''){
        layer.msg("型号不能为空");
        return false;
    }
    var zhizaoshang= $('#zhizaoshang').val();
    if(zhizaoshang==null || zhizaoshang == ''){
        layer.msg("制造商不能为空");
        return false;
    }
    var num= $('#num').val();
    if(num==null || num == ''){
        layer.msg("数量不能为空");
        return false;
    }
    var bumenName= $('#bumenName').val();
    if(bumenName==null || bumenName == ''){
        layer.msg("使用部门不能为空");
        return false;
    }
    var shebeizhuangkuang= $('#shebeizhuangkuang').val();
    if(shebeizhuangkuang==null || shebeizhuangkuang == ''){
        layer.msg("设备状况不能为空");
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
