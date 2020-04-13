package com.time.member.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.time.common.core.model.R;
import com.time.member.service.TmMemberLevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * 会员库
 *
 * @author sy
 * @date 2020-04-13 02:33:07
 */
@RestController
@AllArgsConstructor
@RequestMapping("/tmmemberlevel" )
@Api(value = "tmmemberlevel", tags = "会员库管理")
public class TmMemberLevelController {

    private final TmMemberLevelService tmMemberLevelService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tmMemberLevel 会员库
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getTmMemberLevelPage(Page page, com.time.member.entityy.TmMemberLevel tmMemberLevel) {
        return R.ok(tmMemberLevelService.page(page, Wrappers.query(tmMemberLevel)));
    }


    /**
     * 通过id查询会员库
     * @param levelId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{levelId}" )
    public R getById(@PathVariable("levelId" ) String levelId) {
        return R.ok(tmMemberLevelService.getById(levelId));
    }

    /**
     * 新增会员库
     * @param tmMemberLevel 会员库
     * @return R
     */
    @ApiOperation(value = "新增会员库", notes = "新增会员库")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmmemberlevel_add')" )
    public R save(@RequestBody com.time.member.entityy.TmMemberLevel tmMemberLevel) {
        return R.ok(tmMemberLevelService.save(tmMemberLevel));
    }

    /**
     * 修改会员库
     * @param tmMemberLevel 会员库
     * @return R
     */
    @ApiOperation(value = "修改会员库", notes = "修改会员库")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmmemberlevel_edit')" )
    public R updateById(@RequestBody com.time.member.entityy.TmMemberLevel tmMemberLevel) {
        return R.ok(tmMemberLevelService.updateById(tmMemberLevel));
    }

    /**
     * 通过id删除会员库
     * @param levelId id
     * @return R
     */
    @ApiOperation(value = "通过id删除会员库", notes = "通过id删除会员库")
    @DeleteMapping("/{levelId}" )
    @PreAuthorize("@pms.hasPermission('time-member_tmmemberlevel_del')" )
    public R removeById(@PathVariable String levelId) {
        return R.ok(tmMemberLevelService.removeById(levelId));
    }

}
