package com.lee.controller.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lee.common.ExcludeEmptyQueryWrapper;
import com.lee.entity.ExcpPutinInfoModel;
import com.lee.entity.ExcpPutoutInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.service.ExcpLocationService;
import com.lee.service.ExcpPutinService;
import com.lee.service.ExcpPutonService;
import com.lee.service.ExcpPutoutService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(value = "异常中心", description = "异常中心")
@RestController
@RequestMapping("/exception")
public class ExceptionController extends BasicController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ExcpPutinService excpPutinService;
    @Autowired
    ExcpPutonService excpPutonService;
    @Autowired
    ExcpPutoutService excpPutoutService;
    @Autowired
    ExcpLocationService excpLocationService;

    @RequestMapping(value = "putin/findList", method = RequestMethod.GET)
    @ApiOperation(value = "入库异常列表")
    public GenericResponse putinFindList(
            @ApiParam(value = "入库单号") @RequestParam(required = false) String warehousingNum,
            @ApiParam(value = "异常开始日期") @RequestParam(required = false) String exDateStart,
            @ApiParam(value = "异常结束日期") @RequestParam(required = false) String exDateEnd,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        try {
            IPage<ExcpPutinInfoModel> page = new Page<>();
            page.setCurrent(Long.valueOf(pageNo));
            page.setSize(Long.valueOf(pageSize));
            IPage<ExcpPutinInfoModel> iPage = excpPutinService.page(page, new ExcludeEmptyQueryWrapper<ExcpPutinInfoModel>()
                    .eq("warehousing_num", warehousingNum)
                    .between("create_time", exDateStart, exDateEnd)
            );
            return ResponseFormat.retParam(200, iPage);
        } catch (Exception e) {
            logger.error("查询入库异常列表异常", e);
            return ResponseFormat.retParam(500, "查询入库异常列表异常");
        }
    }

    @RequestMapping(value = "puton/findList", method = RequestMethod.GET)
    @ApiOperation(value = "上架异常列表")
    public GenericResponse putonFindList(
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        Map<String, Object> searchParams = new HashMap<>();
        try {
            searchParams.put("offsetIndex", pageNo);
            searchParams.put("limit", pageSize);
            return excpPutonService.getPageInfo(searchParams);
        } catch (Exception e) {
            logger.error("查询用户列表异常", e);
            return ResponseFormat.retParam(500, "查询用户列表异常");
        }
    }

    @RequestMapping(value = "putout/findList", method = RequestMethod.GET)
    @ApiOperation(value = "出库异常列表")
    public GenericResponse putonFindList(
            @ApiParam(value = "出库单号") @RequestParam(required = false) String exwarehousingNum,
            @ApiParam(value = "异常开始日期") @RequestParam(required = false) String exDateStart,
            @ApiParam(value = "异常结束日期") @RequestParam(required = false) String exDateEnd,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        try {
            IPage<ExcpPutoutInfoModel> page = new Page<>();
            page.setCurrent(Long.valueOf(pageNo));
            page.setSize(Long.valueOf(pageSize));
            IPage<ExcpPutoutInfoModel> iPage = excpPutoutService.page(page, new ExcludeEmptyQueryWrapper<ExcpPutoutInfoModel>()
                    .eq("warehousing_num", exwarehousingNum)
                    .between("create_time", exDateStart, exDateEnd)
            );
            return ResponseFormat.retParam(200, iPage);
        } catch (Exception e) {
            logger.error("查询出库异常列表异常", e);
            return ResponseFormat.retParam(500, "查询出库异常列表异常");
        }
    }

    @RequestMapping(value = "location/findList", method = RequestMethod.GET)
    @ApiOperation(value = "定位异常列表")
    public GenericResponse putonFindList(
            @ApiParam(value = "物资编号") @RequestParam(required = false) String matNum,
            @ApiParam(value = "物资名称") @RequestParam(required = false) String matName,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        Map<String, Object> searchParams = new HashMap<>();
        try {
            searchParams.put("matNum", matNum);
            searchParams.put("matName", matName);
            searchParams.put("offsetIndex", pageNo);
            searchParams.put("limit", pageSize);
            return excpLocationService.getPageInfo(searchParams);
        } catch (Exception e) {
            logger.error("查询用户列表异常", e);
            return ResponseFormat.retParam(500, "查询用户列表异常");
        }
    }

}
