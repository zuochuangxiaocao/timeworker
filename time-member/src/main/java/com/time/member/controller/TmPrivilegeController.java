package com.time.member.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.time.common.core.model.R;

import com.time.member.entity.TmPrivilege;
import com.time.member.service.TmPrivilegeService;
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
@RequestMapping("/tmprivilege" )
@Api(value = "tmprivilege", tags = "会员库管理")
public class TmPrivilegeController {

    private final TmPrivilegeService tmPrivilegeService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tmPrivilege 会员库
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getTmPrivilegePage(Page page, TmPrivilege tmPrivilege) {
        return R.ok(tmPrivilegeService.page(page, Wrappers.query(tmPrivilege)));
    }


    /**
     * 通过id查询会员库
     * @param privilegeId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{privilegeId}" )
    public R getById(@PathVariable("privilegeId" ) String privilegeId) {
        return R.ok(tmPrivilegeService.getById(privilegeId));
    }

    /**
     * 新增会员库
     * @param tmPrivilege 会员库
     * @return R
     */
    @ApiOperation(value = "新增会员库", notes = "新增会员库")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmprivilege_add')" )
    public R save(@RequestBody TmPrivilege tmPrivilege) {
        return R.ok(tmPrivilegeService.save(tmPrivilege));
    }

    /**
     * 修改会员库
     * @param tmPrivilege 会员库
     * @return R
     */
    @ApiOperation(value = "修改会员库", notes = "修改会员库")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmprivilege_edit')" )
    public R updateById(@RequestBody TmPrivilege tmPrivilege) {
        return R.ok(tmPrivilegeService.updateById(tmPrivilege));
    }

    /**
     * 通过id删除会员库
     * @param privilegeId id
     * @return R
     */
    @ApiOperation(value = "通过id删除会员库", notes = "通过id删除会员库")
    @DeleteMapping("/{privilegeId}" )
    @PreAuthorize("@pms.hasPermission('time-member_tmprivilege_del')" )
    public R removeById(@PathVariable String privilegeId) {
        return R.ok(tmPrivilegeService.removeById(privilegeId));
    }

}
