package com.time.member.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.time.common.core.model.R;
import com.time.member.entity.TmPhoneLog;
import com.time.member.service.TmPhoneLogService;
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
@RequestMapping("/tmphonelog" )
@Api(value = "tmphonelog", tags = "会员库管理")
public class TmPhoneLogController {

    private final TmPhoneLogService tmPhoneLogService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tmPhoneLog 会员库
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getTmPhoneLogPage(Page page, TmPhoneLog tmPhoneLog) {
        return R.ok(tmPhoneLogService.page(page, Wrappers.query(tmPhoneLog)));
    }


    /**
     * 通过id查询会员库
     * @param logId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{logId}" )
    public R getById(@PathVariable("logId" ) String logId) {
        return R.ok(tmPhoneLogService.getById(logId));
    }

    /**
     * 新增会员库
     * @param tmPhoneLog 会员库
     * @return R
     */
    @ApiOperation(value = "新增会员库", notes = "新增会员库")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmphonelog_add')" )
    public R save(@RequestBody TmPhoneLog tmPhoneLog) {
        return R.ok(tmPhoneLogService.save(tmPhoneLog));
    }

    /**
     * 修改会员库
     * @param tmPhoneLog 会员库
     * @return R
     */
    @ApiOperation(value = "修改会员库", notes = "修改会员库")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmphonelog_edit')" )
    public R updateById(@RequestBody TmPhoneLog tmPhoneLog) {
        return R.ok(tmPhoneLogService.updateById(tmPhoneLog));
    }

    /**
     * 通过id删除会员库
     * @param logId id
     * @return R
     */
    @ApiOperation(value = "通过id删除会员库", notes = "通过id删除会员库")
    @DeleteMapping("/{logId}" )
    @PreAuthorize("@pms.hasPermission('time-member_tmphonelog_del')" )
    public R removeById(@PathVariable String logId) {
        return R.ok(tmPhoneLogService.removeById(logId));
    }

}
