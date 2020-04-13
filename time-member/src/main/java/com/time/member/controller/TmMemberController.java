package com.time.member.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.time.common.core.model.R;
import com.time.member.entity.TmMember;
import com.time.member.service.TmMemberService;
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
@RequestMapping("/tmmember" )
@Api(value = "tmmember", tags = "会员库管理")
public class TmMemberController {

    private final TmMemberService tmMemberService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tmMember 会员库
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getTmMemberPage(Page page, TmMember tmMember) {
        return R.ok(tmMemberService.page(page, Wrappers.query(tmMember)));
    }


    /**
     * 通过id查询会员库
     * @param memberId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{memberId}" )
    public R getById(@PathVariable("memberId" ) String memberId) {
        return R.ok(tmMemberService.getById(memberId));
    }

    /**
     * 新增会员库
     * @param tmMember 会员库
     * @return R
     */
    @ApiOperation(value = "新增会员库", notes = "新增会员库")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmmember_add')" )
    public R save(@RequestBody TmMember tmMember) {
        return R.ok(tmMemberService.save(tmMember));
    }

    /**
     * 修改会员库
     * @param tmMember 会员库
     * @return R
     */
    @ApiOperation(value = "修改会员库", notes = "修改会员库")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmmember_edit')" )
    public R updateById(@RequestBody TmMember tmMember) {
        return R.ok(tmMemberService.updateById(tmMember));
    }

    /**
     * 通过id删除会员库
     * @param memberId id
     * @return R
     */
    @ApiOperation(value = "通过id删除会员库", notes = "通过id删除会员库")
    @DeleteMapping("/{memberId}" )
    @PreAuthorize("@pms.hasPermission('time-member_tmmember_del')" )
    public R removeById(@PathVariable String memberId) {
        return R.ok(tmMemberService.removeById(memberId));
    }

}
