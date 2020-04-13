package com.time.member.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.time.common.core.model.R;

import com.time.member.entity.TmSales;
import com.time.member.service.TmSalesService;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


/**
 * 会员库
 *
 * @author sy
 * @date 2020-04-13 02:33:06
 */
@RestController
@AllArgsConstructor
@RequestMapping("/tmsales" )
@Api(value = "tmsales", tags = "会员库管理")
public class TmSalesController {

    private final TmSalesService tmSalesService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tmSales 会员库
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getTmSalesPage(Page page, TmSales tmSales) {
        return R.ok(tmSalesService.page(page, Wrappers.query(tmSales)));
    }


    /**
     * 通过id查询会员库
     * @param salesId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{salesId}" )
    public R getById(@PathVariable("salesId" ) String salesId) {
        return R.ok(tmSalesService.getById(salesId));
    }

    /**
     * 新增会员库
     * @param tmSales 会员库
     * @return R
     */
    @ApiOperation(value = "新增会员库", notes = "新增会员库")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmsales_add')" )
    public R save(@RequestBody TmSales tmSales) {
        return R.ok(tmSalesService.save(tmSales));
    }

    /**
     * 修改会员库
     * @param tmSales 会员库
     * @return R
     */
    @ApiOperation(value = "修改会员库", notes = "修改会员库")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmsales_edit')" )
    public R updateById(@RequestBody TmSales tmSales) {
        return R.ok(tmSalesService.updateById(tmSales));
    }

    /**
     * 通过id删除会员库
     * @param salesId id
     * @return R
     */
    @ApiOperation(value = "通过id删除会员库", notes = "通过id删除会员库")
    @DeleteMapping("/{salesId}" )
    @PreAuthorize("@pms.hasPermission('time-member_tmsales_del')" )
    public R removeById(@PathVariable String salesId) {
        return R.ok(tmSalesService.removeById(salesId));
    }

}
