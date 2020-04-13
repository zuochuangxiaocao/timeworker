package com.time.member.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
//import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.time.member.entity.TmConsultant;
import com.time.common.core.model.R;
import com.time.member.service.TmConsultantService;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


/**
 * 会员库
 *
 * @author sy
 * @date 2020-04-13 02:33:07
 */
@RestController
@AllArgsConstructor
@RequestMapping("/tmconsultant" )
@Api(value = "tmconsultant", tags = "会员库管理")
public class TmConsultantController {

    private final TmConsultantService tmConsultantService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tmConsultant 会员库
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getTmConsultantPage(Page page, TmConsultant tmConsultant) {
        return R.ok(tmConsultantService.page(page, Wrappers.query(tmConsultant)));
    }


    /**
     * 通过id查询会员库
     * @param consultantId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{consultantId}" )
    public R getById(@PathVariable("consultantId" ) String consultantId) {
        return R.ok(tmConsultantService.getById(consultantId));
    }

    /**
     * 新增会员库
     * @param tmConsultant 会员库
     * @return R
     */
    @ApiOperation(value = "新增会员库", notes = "新增会员库")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmconsultant_add')" )
    public R save(@RequestBody TmConsultant tmConsultant) {
        return R.ok(tmConsultantService.save(tmConsultant));
    }

    /**
     * 修改会员库
     * @param tmConsultant 会员库
     * @return R
     */
    @ApiOperation(value = "修改会员库", notes = "修改会员库")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmconsultant_edit')" )
    public R updateById(@RequestBody TmConsultant tmConsultant) {
        return R.ok(tmConsultantService.updateById(tmConsultant));
    }

    /**
     * 通过id删除会员库
     * @param consultantId id
     * @return R
     */
    @ApiOperation(value = "通过id删除会员库", notes = "通过id删除会员库")
    @DeleteMapping("/{consultantId}" )
    @PreAuthorize("@pms.hasPermission('time-member_tmconsultant_del')" )
    public R removeById(@PathVariable String consultantId) {
        return R.ok(tmConsultantService.removeById(consultantId));
    }

}
