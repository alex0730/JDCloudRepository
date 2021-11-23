<#include "admin/common/_head.ftl">
<#include "admin/common/_left.ftl">
<div class="main-content">
    <div class="row">
        <div class="col-sm-12">
            <div class="main-content-header">
                <div class="pull-left header-title">
                    <h4>大区设置</h4>
                    <div class="small-title">大区列表</div>
                </div>
            </div>
        </div>
    </div>
    <div class="row list-search-row">
        <div class="col-sm-12">
            <div class="pull-left">
                <button class="btn list-btn btn-primary " type="button" onclick="openModal(member_insert_modal_url, 'member_create_modal', member_list_table_id )">
                    <i class="fa fa-fw fa-plus"></i>新增大区
                </button>
                <button class="btn list-btn btn-danger " type="button" onclick="deleteBatch(member_list_delete_url,  member_list_table_id )">
                    <i class="fa fa-fw fa-times"></i>删除大区
                </button>
            </div>
            <div class="pull-right">
                <form id="member_list_searchForm" name="member_list_searchForm" class="form-inline list-search" onsubmit="return false">
                    <div class="form-group">
                        <select class="form-control" name="search_type">
                            <option value="username" >大区名</option>
                            <option value="nickname" >昵称</option>
                            <option value="email" >邮箱</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="search_value" placeholder="搜索相关数据" />
                    </div>
                    <div class="form-group">
                        <a class="btn list-btn btn-info " onClick="member_list_search();"><i class="fa fa-search fa-fw"></i>查询</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <table class="table table-striped table-hover table-no-bordered " id="member_list_table"></table>
        </div>
    </div>
    <!-- 注册modal -->
    <div class="modal modal-top fade" id="member_create_modal" tabindex="-1">
        <div class="modal-dialog modal-primary">
            <div class="modal-content"></div>
        </div>
    </div>

    <!-- 修改查看modal -->
    <div id="member_listUpdateModal" class="modal modal-top fade" tabindex="1">
        <div class="modal-dialog modal-primary">
            <div class="modal-content"></div>
        </div>
    </div>

</div>
</div>
<!-- /#wrapper -->
<#include "admin/common/_js.ftl">
<script>
    var member_insert_modal_url = '/base/storage/barea/add'; //新增注册url
    var member_list_view_url = '/base/storage/barea/view/'; //查看信息URL
    var member_list_update_url = '/base/storage/barea/update/'; //更新信息URL
    var member_list_delete_url = '/base/storage/barea/delete'; //删除URL

    var member_list_table; //用户表对象
    var member_list_table_id = 'member_list_table'; //用户表id

    $(function () {
        selectMenuByID("admin_barea");
        member_list_loadData();
    });
    //显示列
    var member_list_table_columns = [
        {
            field : 'checkbox',
            title : 'check',
            checkbox : true,
            hidden : true,
            align : "center",//水平
            valign : "middle"//垂直
        },
        {
            field : 'id',
            title : '序号',
            width : 50,//宽度
            align : "center",//水平
            valign : "middle",//垂直
            // formatter : function(value, row, index) {
            //     return index + 1;
            // }
        },
        {
            field : 'depositoryName',
            title : '仓库名称'
        },
        {
            field : 'bareaNum',
            title : '大区编号'
        },
        {
            field : 'bareaName',
            title : '大区名称'
        },
        {
            field : 'action',
            title : '操作',
            formatter : function(value, row, index) {
                var result = '';
                result += '<button class="btn btn-xs btn-primary" onclick="openModal(\''
                    + member_list_update_url
                    + row.id
                    + '\', \'member_listUpdateModal\', \''
                    + member_list_table_id
                    + '\');">编辑</button>&nbsp;';
                result += '<button class="btn btn-xs btn-primary" onclick="openModal(\''
                    + member_list_update_url
                    + row.id
                    + '\', \'member_listUpdateModal\', \''
                    + member_list_table_id
                    + '\');">删除</button>&nbsp;';
                return result;
            }
            //格式化
        } ];
    function member_list_loadData() {
        member_list_table = $('#' + member_list_table_id).bootstrapTable({
            method : 'post',
            columns : member_list_table_columns,
            url : "/base/storage/barea/findList",
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
                $("input[name='member_sort']").change(function () {
                    var id = $(this).attr("dataid");
                    var sort = $(this).val();
                    if(isDigits(sort)) {
                        $.ajax({
                            url:'/admin/dictionary/sort',
                            type:'post',
                            data:{id:id,sort:sort},
                            dataType:'json',
                            success:function (data) {
                                layer.msg(data.message,{
                                    time:2000
                                });
                                member_list_table.bootstrapTable('refresh');
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
    function member_list_search() {

        member_list_table.bootstrapTable('refreshOptions', {
            pageNumber : 1
        });
        return false;
    }

    //查询参数
    function queryParams(params) {
        params.search = searchDataInit("member_list_searchForm");
        return params;
    }
</script>
</body>
</html>
