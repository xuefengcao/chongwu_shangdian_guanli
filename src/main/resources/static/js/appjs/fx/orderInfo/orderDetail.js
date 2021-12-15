/**
 * 发货
 * @param orderId
 */
function ship(orderId) {
    layer.open({
        type: 2,
        title: '发货',
        maxmin: true,
        shadeClose: false, // 点击遮罩关闭层
        area: ['800px', '520px'],
        content: prefix + '/shipView/' + orderId // iframe的url
    });
}