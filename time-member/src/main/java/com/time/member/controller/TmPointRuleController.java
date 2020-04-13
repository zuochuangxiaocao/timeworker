package com.time.member.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.time.common.core.model.R;
import com.time.member.entity.TmPointRule;
import com.time.member.service.TmPointRuleService;
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
@RequestMapping("/tmpointrule" )
@Api(value = "tmpointrule", tags = "会员库管理")
public class TmPointRuleController {

    private final TmPointRuleService tmPointRuleService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tmPointRule 会员库
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getTmPointRulePage(Page page, TmPointRule tmPointRule) {
        return R.ok(tmPointRuleService.page(page, Wrappers.query(tmPointRule)));
    }


    /**
     * 通过id查询会员库
     * @param ruleId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{ruleId}" )
    public R getById(@PathVariable("ruleId" ) String ruleId) {
        return R.ok(tmPointRuleService.getById(ruleId));
    }

    /**
     * 新增会员库
     * @param tmPointRule 会员库
     * @return R
     */
    @ApiOperation(value = "新增会员库", notes = "新增会员库")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmpointrule_add')" )
    public R save(@RequestBody TmPointRule tmPointRule) {
        return R.ok(tmPointRuleService.save(tmPointRule));
    }

    /**
     * 修改会员库
     * @param tmPointRule 会员库
     * @return R
     */
    @ApiOperation(value = "修改会员库", notes = "修改会员库")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmpointrule_edit')" )
    public R updateById(@RequestBody TmPointRule tmPointRule) {
        return R.ok(tmPointRuleService.updateById(tmPointRule));
    }

    /**
     * 通过id删除会员库
     * @param ruleId id
     * @return R
     */
    @ApiOperation(value = "通过id删除会员库", notes = "通过id删除会员库")
    @DeleteMapping("/{ruleId}" )
    @PreAuthorize("@pms.hasPermission('time-member_tmpointrule_del')" )
    public R removeById(@PathVariable String ruleId) {
        return R.ok(tmPointRuleService.removeById(ruleId));
    }

}
