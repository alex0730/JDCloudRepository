<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">×</span>
    </button>
    <div class="modal-title">采购订单及合同详细信息</div>
</div>
<div class="modal-body">
    <div>
        <form id="menu_update_form" role="form" class="viewForm" action="/admin/menu/update" method="post">
            <input name="id" type="text" style="display: none" value="${purchaseOrderInfoModel.id}">
            <table>
                <tbody>
                <tr align="left">
                    <td align="right"><span>采购编号&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                    <td align="right"><span>申购日期&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                </tr>
                <tr align="left">
                    <td align="right"><span>供应商名称&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                    <td align="right"><span>订单总金额&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                </tr>
                <tr align="left">
                    <td align="right"><span>采购订单状态&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                    <td align="right"><span>采购负责人&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                </tr>
                <tr align="left">
                    <td align="right"><span>采购目的&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                    <td align="right"><span>合同签订时间&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                </tr>
                <tr align="left">
                    <td align="right"><span>资金类型&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                    <td align="right"><span>采购依据&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                </tr>
                </tbody>
            </table>
            <table>
                <tbody>
                <tr align="left">
                    <td align="right"><span>物资信息</span></td>
                </tr>
                <tr align="left">
                    <td>
                        <div class="row">
                            <div class="col-sm-12">
                                <table id="article_list_table"></table>
                            </div>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
            <table>
                <tbody>
                <tr align="left">
                    <td align="right"><span>付款信息</span></td>
                </tr>
                <tr align="left">
                    <td>
                        <div class="row">
                            <div class="col-sm-12">
                                <table id="payment_list_table"></table>
                            </div>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
            <table>
                <tbody>
                <tr align="left">
                    <td align="right"><span>合同签订时间&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                    <td align="right"><span>资金类型&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                </tr>
                <tr align="left">
                    <td align="right"><span>当前付款状态&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                    <td align="right"><span>当前付款比例&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                </tr>
                <tr align="left">
                    <td align="right"><span>合同总金额&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"></td>
                </tr>
                </tbody>
            </table>
            <table>
                <tbody>
                <tr align="left">
                    <td align="right"><span>合同附件&nbsp;&nbsp;&nbsp;</span></td>
                </tr>
                <tr align="left">
                    <td align="right"><span>其他流程文件&nbsp;&nbsp;&nbsp;</span></td>
                </tr>
                </tbody>
            </table>
        </form>
    </div>
</div>
<div class="modal-footer">
    <div class="pull-right">
        <button class="btn btn-primary " onclick="validateAndSubmitForm('menu_update_form', this);">保存</button>
        <button class="btn btn-default" type="button" data-dismiss="modal">取消</button>
    </div>
</div>
<#include "admin/common/_js.ftl">
<script src="/static/lib/wangeditor/wangEditor.js"></script>
<script type="text/javascript">
    $(function () {
        article_list_loadData();
    });
    $(function () {
        payment_list_loadData();
    });
    $("#parentId").change(function () {
        var parentIdName = $("#parentId").find("option:selected").text();
        console.info("parentIdName" + parentIdName)
        $("#parentName").attr("value", parentIdName);
    });

    var article_list_table_id = 'article_list_table'; //用户表id
    var article_list_table_columns = [
        {
            field : 'matPurchaseNum',
            title : '物资编号',
            width : 50,//宽度
        },
        {
            field : 'matName',
            title : '物资名称',
            width : 50,//宽度
        },
        {
            field : 'matSpecs',
            title : '物资规格',
            width : 50,//宽度
        },
        {
            field : 'matTypeName',
            title : '物资类别',
            width : 50,//宽度
        },
        {
            field : 'matUnit',
            title : '物资单位',
            width : 50,//宽度
        },
        {
            field : 'unitPrice',
            title : '单价',
            width : 50,//宽度
        },
        {
            field : 'matCount',
            title : '数量',
            width : 50,//宽度
        },
        {
            field : 'totalAmount',
            title : '金额',
            width : 50,//宽度
        },
        {
            field : 'matStatus',
            title : '物资状态',
            width : 50,//宽度
        }];

    function article_list_loadData() {
        article_list_table = $('#' + article_list_table_id).bootstrapTable({
            method : 'post',
            columns : article_list_table_columns,
            url : "/sys/material/findList ",
            pagination : true,
            search : false,
            showRefresh : false,
            showToggle : false,
            showColumns : false,
            paginationLoop : false,
            paginationPreText : '上一页',
            paginationNextText : '下一页',
            queryParams : queryParams,
            sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
            pageNumber : 1, //初始化加载第一页，默认第一页
            pageSize : 10, //每页的记录行数（*）
            pageList : [ 10, 20, 50 ], //可供选择的每页的行数（*）
            uniqueId : "id", //每一行的唯一标识，一般为主键列
            onLoadSuccess : function(data) { //加载成功时执行
                $(".material-top").click(function () {
                    var msg =  '';
                    var id = $(this).attr("dataid");
                    var istop = $(this).attr("istop");
                    if(istop == 1) {
                        msg = '确定取消推荐本条物资吗?';
                    } else {
                        msg = '确定推荐本条物资吗?';
                    }
                    layer.confirm(msg,{
                        title:'推荐操作',
                        icon:3
                    },function (index) {
                        layer.close(index);
                        $.ajax({
                            url:'/sys/material/top',
                            type:'post',
                            data:{id:id,istop:istop},
                            dataType:'json',
                            success:function (data) {
                                article_list_table.bootstrapTable('refresh');
                                layer.msg(data.message,{time:2000});
                            }
                        });
                    })
                    return false;
                });
            }
        });
    }

    var payment_list_table = 'payment_list_table'; //用户表id

    var payment_list_table_columns = [
        {
            field : 'id',
            title : '序号',
            width : 50,//宽度
        },
        {
            field : 'purchasePaymentDate',
            title : '付款时间',
            width : 50,//宽度
        },
        {
            field : 'purchasePaymentAmount',
            title : '付款金额',
            width : 50,//宽度
        },
        {
            field : 'purchasePaymentRatio',
            title : '本次付款比例',
            width : 50,//宽度
        }];

    function payment_list_loadData() {
        payment_list_table = $('#' + payment_list_table).bootstrapTable({
            method : 'post',
            columns : payment_list_table_columns,
            url : "/purchase/paymentInfo",
            pagination : true,
            search : false,
            showRefresh : false,
            showToggle : false,
            showColumns : false,
            paginationLoop : false,
            paginationPreText : '上一页',
            paginationNextText : '下一页',
            queryParams : queryParams,
            sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
            pageNumber : 1, //初始化加载第一页，默认第一页
            pageSize : 10, //每页的记录行数（*）
            pageList : [ 10, 20, 50 ], //可供选择的每页的行数（*）
            uniqueId : "id", //每一行的唯一标识，一般为主键列
            onLoadSuccess : function(data) { //加载成功时执行
                $(".material-top").click(function () {
                    var msg =  '';
                    var id = $(this).attr("dataid");
                    var istop = $(this).attr("istop");
                    if(istop == 1) {
                        msg = '确定取消推荐本条物资吗?';
                    } else {
                        msg = '确定推荐本条物资吗?';
                    }
                    layer.confirm(msg,{
                        title:'推荐操作',
                        icon:3
                    },function (index) {
                        layer.close(index);
                        $.ajax({
                            url:'/sys/material/top',
                            type:'post',
                            data:{id:id,istop:istop},
                            dataType:'json',
                            success:function (data) {
                                article_list_table.bootstrapTable('refresh');
                                layer.msg(data.message,{time:2000});
                            }
                        });
                    })
                    return false;
                });
            }
        });
    }


</script>
