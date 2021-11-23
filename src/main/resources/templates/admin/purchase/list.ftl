<#include "admin/common/_head.ftl">
<#include "admin/common/_left.ftl">
<div class="main-content">
    <div class="row">
        <div class="col-sm-12">
            <div class="main-content-header">
                <div class="pull-left header-title">
                    <h4>采购订单管理</h4>
                    <div class="small-title">采购订单列表</div>
                </div>
            </div>
        </div>
    </div>
    <div style="padding: 20px 30px 10px;">
        <form id="member_list_searchForm" name="member_list_searchForm" class="searchForm" onsubmit="return false"
              role="form">
            <table>
                <tbody>
                <tr align="left">
                    <td align="right"><span>申购日期&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"> 至 <input type="text" placeholder="" class="searchInput"></td>
                    <td align="right"><span>供应商名称&nbsp;&nbsp;&nbsp;</span></td>
                    <td>
                        <select placeholder="" class="searchInput">
                            <option value="0">-</option>
                            <option value="1">供应商1</option>
                            <option value="2">供应商2</option>
                            <option value="3">供应商3</option>
                        </select>
                    </td>
                    <td align="right"><span>采购订单状态&nbsp;&nbsp;&nbsp;</span></td>
                    <td>
                        <select placeholder="" class="searchInput">
                            <option value="0">-</option>
                            <option value="1">未付款</option>
                            <option value="2">部分付款</option>
                            <option value="3">已付款</option>
                        </select>
                    </td>
                </tr>
                <tr align="left">
                    <td align="right"><span>订单金额&nbsp;&nbsp;&nbsp;</span></td>
                    <td><input type="text" placeholder="" class="searchInput"> 至 <input type="text" placeholder="" class="searchInput"></td>
                    <td align="right"><span>采购负责人&nbsp;&nbsp;&nbsp;</span></td>
                    <td>
                        <select placeholder="" class="searchInput">
                            <option value="0">-</option>
                            <option value="1">采购负责人1</option>
                            <option value="2">采购负责人2</option>
                            <option value="3">采购负责人3</option>
                        </select>
                    </td>
                    <td align="right"><span>资金类型&nbsp;&nbsp;&nbsp;</span></td>
                    <td>
                        <select placeholder="" class="searchInput">
                            <option value="0">-</option>
                            <option value="1">资金类型1</option>
                            <option value="2">资金类型2</option>
                            <option value="3">资金类型3</option>
                        </select>
                    </td>
                </tr>
                <tr align="left">
                    <td align="right"><span>采购物资&nbsp;&nbsp;&nbsp;</span></td>
                    <td>
                        <select placeholder="" class="searchInput">
                            <option value="0">-</option>
                            <option value="1">采购物资1</option>
                            <option value="2">采购物资2</option>
                            <option value="3">采购物资3</option>
                        </select>
                    </td>
                    <td align="right"><span>采购依据&nbsp;&nbsp;&nbsp;</span></td>
                    <td>
                        <select placeholder="" class="searchInput">
                            <option value="0">-</option>
                            <option value="1">采购依据1</option>
                            <option value="2">采购依据2</option>
                            <option value="3">采购依据3</option>
                        </select>
                    </td>
                </tr>

                </tbody>
            </table>
        </form>
    </div>
       <div class="col-sm-12" style = "margin-left: 1041px;">
            <div class="pull-left">
                <button class="btn list-btn btn-danger " type="button"
                        onclick="deleteBatch(menu_list_delete_url,  menu_list_table_id )">
                    筛选
                </button>
                <button class="btn list-btn btn-danger " type="button"
                        onclick="deleteBatch(menu_list_delete_url,  menu_list_table_id )">
                    重置
                </button>
            </div>
        </div>
    <div class="row">
        <div class="col-sm-12">
            <table class="table table-striped table-hover table-no-bordered " id="menu_list_table"></table>
        </div>
    </div>
    <!-- 注册modal -->
    <div class="modal modal-top fade" id="menu_create_modal" tabindex="-1">
        <div class="modal-dialog modal-primary" style="width: 70%">
            <div class="modal-content"></div>
        </div>
    </div>

    <!-- 修改查看modal -->
    <div id="menu_listUpdateModal" class="modal modal-top fade" tabindex="1">
        <div class="modal-dialog modal-primary" style="width: 70%">
            <div class="modal-content"></div>
        </div>
    </div>

</div>
</div>
<!-- /#wrapper -->
<#include "admin/common/_js.ftl">
<script>
    $("#search_type").change(function () {
        var searchType = $(this);
        var selectedOption = searchType.find('option:selected');
        selectedOption.siblings().removeAttr('selected');
        selectedOption.attr('selected', true);
        var searchTypeVal = $(this).val();
        if (searchTypeVal === "status") {
            $("#cn_name").hide();
            $("#status").show();
            $("#cn_name").removeAttr('name')
            $("#status").attr("name", "search_value");
        } else if (searchTypeVal === "cn_name") {
            $("#status").hide();
            $("#cn_name").show();
            $("#status").removeAttr("name")
            $("#cn_name").attr("name", "search_value");
        }
    });

    var menu_insert_modal_url = '/purchase/add/'; //新增注册url
    var menu_list_use_url = '/purchase/use/';
    var menu_list_update_url = '/purchase/update/'; //更新信息URL
    var menu_list_view_url = '/purchase/view/'; //更新信息URL
    var menu_list_delete_url = '/purchase/delete/'; //删除URL

    var menu_list_table; //用户表对象
    var menu_list_table_id = 'menu_list_table'; //用户表id

    $(function () {
        selectMenuByID("admin_purchase");
        menu_list_loadData();
    });
    //显示列
    var menu_list_table_columns = [
        {
            field: 'checkbox',
            title: 'check',
            checkbox: true,
            hidden: true,
            align: "center",//水平
            valign: "middle"//垂直
        },
        {
            field: 'purchaseNum',
            title: '采购编号',
            align: "center",//水平
            valign: "middle",//垂直
        },
        {
            field: 'purchaseDate',
            title: '采购日期'
        },
        {
            field: 'supplierName',
            title: '供应商名称'
        },
        {
            field: 'orderAmount',
            title: '订单总金额'
        },
        {
            field: 'capitalTypeName',
            title: '资金类型'
        },
        {
            field: 'purchasePaymentStatus',
            title: '采购订单状态',
            formatter: function (value, row, index) {
                var content = "未付款";
                if (row.status === 1) {
                    content = "停用";
                }
                return content;
            }
        },
        {
            field: 'purchasePerson',
            width: 150,//宽度
            title: '采购负责人'
        },
        {
            field: 'purchasePurpose',
            title: '采购目的'
        },
        {
            field: 'purchaseBasis',
            title: '采购依据'
        },
        {
            field: 'purchaseCreateDate',
            title: '采购订单建立时间'
        },
        {
            field: 'purchaseCompleteDate',
            title: '采购订单完成时间'
        },
        {
            field: 'action',
            title: '操作',
            formatter: function (value, row, index) {
                var result = '';
                result += '<button class="btn btn-xs btn-primary" onclick="openModal(\''
                    + menu_list_view_url
                    + index
                    + '\', \'menu_listUpdateModal\', \''
                    + menu_list_view_url
                    + '\');">查看</button>&nbsp;';
                result += '<button class="btn btn-xs btn-primary" onclick="openModal(\''
                    + menu_list_update_url
                    + row.id
                    + '\', \'menu_listUpdateModal\', \''
                    + menu_list_update_url
                    + '\');">修改</button>&nbsp;';
                result += '<button class="btn btn-xs btn-primary" onclick="openModal(\''
                    + menu_list_update_url
                    + row.id
                    + '\', \'menu_listUpdateModal\', \''
                    + menu_insert_modal_url
                    + '\');">删除</button>&nbsp;';
                return result;
            }
            //格式化
        }];

    function menu_list_loadData() {
        menu_list_table = $('#' + menu_list_table_id).bootstrapTable({
            method: 'post',
            columns: menu_list_table_columns,
            url: "/purchase/findList",
            pagination: true,
            search: false,
            showRefresh: false,
            showToggle: false,
            showColumns: false,
            paginationLoop: false,
            paginationPreText: '上一页',
            paginationNextText: '下一页',
            queryParams: queryParams,
            sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）
            pageNumber: 1, //初始化加载第一页，默认第一页
            pageSize: 10, //每页的记录行数（*）
            pageList: [10, 20, 50], //可供选择的每页的行数（*）
            uniqueId: "id", //每一行的唯一标识，一般为主键列
            onLoadSuccess: function (data) { //加载成功时执行
                $(".purchase-top").click(function () {
                    var msg = '';
                    var id = $(this).attr("dataid");
                    var istop = $(this).attr("istop");
                    if (istop == 1) {
                        msg = '确定取消推荐本条采购订单吗?';
                    } else {
                        msg = '确定推荐本条采购订单吗?';
                    }
                    layer.confirm(msg, {
                        title: '推荐操作',
                        icon: 3
                    }, function (index) {
                        layer.close(index);
                        $.ajax({
                            url: '/admin/purchase/top',
                            type: 'post',
                            data: {id: id, istop: istop},
                            dataType: 'json',
                            success: function (data) {
                                menu_list_table.bootstrapTable('refresh');
                                layer.msg(data.message, {time: 2000});
                            }
                        });
                    })
                    return false;
                });
            }
        });
    }

    //刷新查询
    function menu_list_search() {
        menu_list_table.bootstrapTable('refreshOptions', {
            pageNumber: 1
        });
        return false;
    }

    //查询参数
    function queryParams(params) {
        params.search = searchDataInit("menu_list_searchForm");
        return params;
    }
</script>
</body>
</html>
