<#include "admin/common/_head.ftl">
<#include "admin/common/_left.ftl">
<div class="main-content">
    <div class="row">
        <div class="col-sm-12">
            <div class="main-content-header">
                <div class="pull-left header-title">
                    <h4>供应商管理</h4>
                    <div class="small-title">供应商列表</div>
                </div>
            </div>
        </div>
    </div>
    <div class="row list-search-row">
        <div class="col-sm-12">
            <div class="pull-left">
                <button class="btn list-btn btn-primary " type="button" onclick="openModal(user_insert_modal_url, 'user_create_modal', user_list_table_id )">
                    <i class="fa fa-fw fa-plus"></i>新增
                </button>
                <button class="btn list-btn btn-primary " type="button" onclick="openModal(user_insert_modal_url, 'user_create_modal', user_list_table_id )">
                    <i class="fa fa-fw fa-plus"></i>导出
                </button>
            </div>
            <div class="pull-right">
                <form id="comment_list_searchForm" name="comment_list_searchForm" class="form-inline list-search" onsubmit="return false">
                    <div class="form-group">
                        <select class="form-control" name="search_type">
                            <option value="articletitle" >文章标题</option>
                            <option value="membername" >供应商用户</option>
                            <option value="content" >供应商内容</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="search_value" placeholder="搜索相关数据" />
                    </div>
                    <div class="form-group">
                        <a class="btn list-btn btn-info " onClick="comment_list_search();"><i class="fa fa-search fa-fw"></i>查询</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <table class="table table-striped table-hover table-no-bordered " id="comment_list_table"></table>
        </div>
    </div>
    <!-- 注册modal -->
    <div class="modal modal-top fade" id="comment_create_modal" tabindex="-1">
        <div class="modal-dialog modal-primary">
            <div class="modal-content"></div>
        </div>
    </div>

    <!-- 修改查看modal -->
    <div id="comment_listUpdateModal" class="modal modal-top fade" tabindex="1">
        <div class="modal-dialog modal-primary">
            <div class="modal-content"></div>
        </div>
    </div>

</div>
</div>
<!-- /#wrapper -->
<#include "admin/common/_js.ftl">
<script>
    var comment_insert_modal_url = '/sys/supplier/add'; //新增注册url
    var comment_list_view_url = '/sys/supplier/view/'; //查看信息URL
    var comment_list_update_url = '/sys/supplier/update/'; //更新信息URL
    var comment_list_delete_url = '/sys/supplier/delete'; //删除URL

    var comment_list_table; //用户表对象
    var comment_list_table_id = 'comment_list_table'; //用户表id

    $(function () {
        selectMenuByID("admin_supplier");
        comment_list_loadData();
    });
    //显示列
    var comment_list_table_columns = [
        {
            field : 'checkbox',
            title : 'check',
            checkbox : true,
            hidden : true,
            align : "center",//水平
            valign : "middle"//垂直
        },
        {
            field : 'supNum',
            title : '供应商编号'
        },
        {
            field : 'supName',
            title : '供应商名称'
        },
        {
            field : 'supContacts',
            title : '联系人'
        },
        {
            field : 'supAddress',
            title : '联系地址'
        },
        {
            field : 'supTeleno',
            title : '联系电话'
        },
        {
            field : 'updateTime',
            width:150,
            title : '更新时间'
        },
        {
            field : 'supRemark',
            title : '备注'
        },
        {
            field : 'action',
            title : '操作',
            formatter : function(value, row, index) {
                var result = '';
                result += '<button class="btn btn-xs btn-success user-status" dataid="'+row.id+'" status="'+row.status+'">详情</button>&nbsp';
                result += '<button class="btn btn-xs btn-success user-status" dataid="'+row.id+'" status="'+row.status+'">修改</button>&nbsp';
                // if (row.status === 1) {
                return result;
            }
            //格式化
        } ];
    function comment_list_loadData() {
        comment_list_table = $('#' + comment_list_table_id).bootstrapTable({
            method : 'post',
            columns : comment_list_table_columns,
            url : "/sys/supplier/findList",
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
                $("input[name='comment_sort']").change(function () {
                    var id = $(this).attr("dataid");
                    var sort = $(this).val();
                    if(isDigits(sort)) {
                        $.ajax({
                            url:'/sys/supplier/sort',
                            type:'post',
                            data:{id:id,sort:sort},
                            dataType:'json',
                            success:function (data) {
                                layer.msg(data.message,{
                                    time:2000
                                });
                                comment_list_table.bootstrapTable('refresh');
                            }
                        });
                    } else {
                        layer.msg('排序请输入正整数',{
                            time:2000
                        });
                        $(this)[0].focus();
                    }

                });
            }
        });
    }
    //刷新查询
    function comment_list_search() {

        comment_list_table.bootstrapTable('refreshOptions', {
            pageNumber : 1
        });
        return false;
    }

    //查询参数
    function queryParams(params) {
        params.search = searchDataInit("comment_list_searchForm");
        return params;
    }
</script>
</body>
</html>
