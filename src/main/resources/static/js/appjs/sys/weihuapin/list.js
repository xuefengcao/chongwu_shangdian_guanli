var prefix = "/sys/weihuapin"
$(function() {
    var deptId = '';
    load(deptId);
});

function load(deptId) {
    $('#exampleTable')
        .bootstrapTable(
            {
                method : 'get', // 服务器数据的请求方式 get or post
                url : prefix + "/list", // 服务器数据的加载地址
                // showRefresh : true,
                // showToggle : true,
                // showColumns : true,
                iconSize : 'outline',
                toolbar : '#exampleToolbar',
                striped : true, // 设置为true会有隔行变色效果
                dataType : "json", // 服务器返回的数据类型
                pagination : true, // 设置为true会在底部显示分页条
                // queryParamsType : "limit",
                // //设置为limit则会发送符合RESTFull格式的参数
                singleSelect : false, // 设置为true将禁止多选
                // contentType : "application/x-www-form-urlencoded",
                // //发送到服务器的数据编码类型
                pageSize : 10, // 如果设置了分页，每页数据条数
                pageNumber : 1, // 如果设置了分布，首页页码
                // search : true, // 是否显示搜索框
                showColumns : false, // 是否显示内容下拉框（选择显示的列）
                sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者
                // "server"
                queryParams : function(params) {
                    return {
                        // 说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
                        limit : params.limit,
                        offset : params.offset,
                        name : $('#searchName').val(),
                        deptId : deptId,
                        status : "1"
                    };
                },
                // //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
                // queryParamsType = 'limit' ,返回参数必须包含
                // limit, offset, search, sort, order 否则, 需要包含:
                // pageSize, pageNumber, searchText, sortName,
                // sortOrder.
                // 返回false将会终止请求
                columns : [
                    {
                        field : 'id', // 列字段名
                        title : '危化品编号' // 列标题
                    },
                    {
                        field : 'type',
                        title : '出入库标识',
                        align : 'center',
                        formatter : function(value, row, index) {
                            if (value == '1') {
                                return '<span class="label label-primary">入库</span>';
                            } else if (value == '2') {
                                return '<span class="label label-danger">出库</span>';
                            }
                        }
                    },
                    {
                        field : 'name', // 列字段名
                        title : '名称' // 列标题
                    },
                    {
                        field : 'num',
                        title : '数量'
                    },
                    {
                        field : 'danwei',
                        title : '单位'
                    },
                    {
                        field : 'startTimeStr',
                        title : '入库/出库时间'
                    },

                    {
                        field : 'saveMethod',
                        title : '保存方法'
                    },
                    {
                        field : 'userName',
                        title : '负责人名称'
                    },
                    {
                        field : 'shiyongUserName',
                        title : '使用人名称'
                    },
                    {
                        field : 'chuzhi',
                        title : '处置方法'
                    },
                    {
                        title : '操作',
                        field : 'id',
                        align : 'center',
                        formatter : function(value, row, index) {
                            var e = '<a  class="btn btn-primary btn-sm ' + s_edit_h + '" href="#" mce_href="#" title="编辑" onclick="edit(\''
                                + row.id
                                + '\')">编辑</a> ';
                            var d = '<a class="btn btn-warning btn-sm ' + s_remove_h + '" href="#" title="删除"  mce_href="#" onclick="remove(\''
                                + row.id
                                + '\')">删除</a> ';

                            return e + d;
                        }
                    } ]
            });
}
function reLoad() {
    $('#exampleTable').bootstrapTable('refresh');
}
function add() {
    // iframe层
    layer.open({
        type : 2,
        title : '新增',
        maxmin : true,
        shadeClose : false, // 点击遮罩关闭层
        area : [ '800px', '520px' ],
        content : prefix + '/add'
    });
}
function remove(id) {
    layer.confirm('确定要删除选中的记录？', {
        btn : [ '确定', '取消' ]
    }, function() {
        $.ajax({
            url : prefix + "/remove",
            type : "post",
            data : {
                'id' : id
            },
            success : function(r) {
                if (r.code == 0) {
                    layer.msg(r.msg);
                    reLoad();
                } else {
                    layer.msg(r.msg);
                }
            }
        });
    })
}
function edit(id) {
    layer.open({
        type : 2,
        title : '编辑',
        maxmin : true,
        shadeClose : false,
        area : [ '800px', '520px' ],
        content : prefix + '/edit/' + id // iframe的url
    });
}
