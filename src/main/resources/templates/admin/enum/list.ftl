<#include "admin/common/_head.ftl">
<#include "admin/common/_left.ftl">
<div class="main-content">
    <div class="row">
        <div class="col-sm-12">
            <div class="main-content-header">
                <div class="pull-left header-title">
                    <h4>枚举值调整</h4>
                </div>
            </div>
        </div>
    </div>
    <div class="row list-search-row">
        <div class="col-sm-12">
            <div class="pull-left">
                <button class="btn list-btn btn-primary " type="button" onclick="openModal(cate_insert_modal_url, 'cate_create_modal', cate_list_table_id )">
                    <i class="fa fa-fw fa-plus"></i>新增枚举值
                </button>
                <button class="btn list-btn btn-danger " type="button" onclick="deleteBatch(cate_list_delete_url,  cate_list_table_id )">
                    <i class="fa fa-fw fa-times"></i>删除枚举值
                </button>
            </div>
            <div class="pull-right">
                <form id="cate_list_searchForm" name="cate_list_searchForm" class="form-inline list-search" onsubmit="return false">
                    <div class="form-group">
                        <select class="form-control" name="search_type">
                            <option value="catename" selected>枚举值名</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="search_value" placeholder="搜索相关数据" />
                    </div>
                    <div class="form-group">
                        <a class="btn list-btn btn-info " onClick="cate_list_search();"><i class="fa fa-search fa-fw"></i>查询</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <table class="table table-striped table-hover table-no-bordered " id="cate_list_table"></table>
        </div>
    </div>
    <!-- 注册modal -->
    <div class="modal modal-top fade" id="cate_create_modal" tabindex="-1">
        <div class="modal-dialog modal-primary">
            <div class="modal-content"></div>
        </div>
    </div>

    <!-- 修改查看modal -->
    <div id="cate_listUpdateModal" class="modal modal-top fade" tabindex="1">
        <div class="modal-dialog modal-primary">
            <div class="modal-content"></div>
        </div>
    </div>

</div>
</div>
<!-- /#wrapper -->
<#include "admin/common/_js.ftl">
<script>
    var cate_insert_modal_url = '/sys/other/enum/add'; //新增注册url
    var cate_list_view_url = '/sys/other/enum/view/'; //查看信息URL
    var cate_list_update_url = '/sys/other/enum/update/'; //更新信息URL
    var cate_list_delete_url = '/sys/other/enum/delete'; //删除URL

    var cate_list_table; //用户表对象
    var cate_list_table_id = 'cate_list_table'; //用户表id

    $(function () {
        selectMenuByID("admin_enum");
        cate_list_loadData();
    });
    //显示列
    var cate_list_table_columns = [
        {
            field : 'checkbox',
            title : 'check',
            checkbox : true,
            hidden : true,
            align : "center",//水平
            valign : "middle"//垂直
        },
        {
            field : 'enuNum',
            title : '枚举值编码',
            width : 50,//宽度
            align : "center",//水平
            valign : "middle",//垂直
            // formatter : function(value, row, index) {
            //     return index + 1;
            // }
        },
        {
            field : 'enuName',
            title : '枚举值名称'
        },
        {
            field : 'enuDicNum',
            title : '字典键值'
        },
        {
            field : 'enuDicOrder',
            title : '字典排序'
        },
        {
            field : 'enuStatus',
            title : '状态',
            formatter: function (value, row, index) {
                var content = "启用";
                if (row.enuStatus === 1) {
                    content = "停用";
                }
                return content;
            }
        },
        // {
        //     field : 'sort',
        //     width : 150,//宽度
        //     title : '字典排序',
        //     formatter:function (value,row,index) {
        //         var content = '<input type="text" size="2" value="'+row.sort+'" name="cate_sort" dataid="'+row.id+'">';
        //         return content;
        //     }
        // },
        {
            field : 'enuRemark',
            title : '备注'
        },
        {
            field : 'createTime',
            title : '创建时间'
        },
        {
            field : 'action',
            title : '操作',
            formatter : function(value, row, index) {
                var result = '';
                result += '<button class="btn btn-xs btn-primary" onclick="openModal(\''
                    + cate_list_update_url
                    + row.id
                    + '\', \'cate_listUpdateModal\', \''
                    + cate_list_table_id
                    + '\');">修改</button>&nbsp;';
                return result;
            }
            //格式化
        } ];
    function cate_list_loadData() {
        cate_list_table = $('#' + cate_list_table_id).bootstrapTable({
            method : 'post',
            columns : cate_list_table_columns,
            url : "/sys/other/enum/findList",
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
                $("input[name='cate_sort']").change(function () {
                    var id = $(this).attr("dataid");
                    var sort = $(this).val();
                    if(isDigits(sort)) {
                        $.ajax({
                            url:'/sys/enum/sort',
                            type:'post',
                            data:{id:id,sort:sort},
                            dataType:'json',
                            success:function (data) {
                                layer.msg(data.message,{
                                    time:2000
                                });
                                cate_list_table.bootstrapTable('refresh');
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
    function cate_list_search() {

        cate_list_table.bootstrapTable('refreshOptions', {
            pageNumber : 1
        });
        return false;
    }

    //查询参数
    function queryParams(params) {
        params.search = searchDataInit("cate_list_searchForm");
        return params;
    }
</script>
</body>
</html>
