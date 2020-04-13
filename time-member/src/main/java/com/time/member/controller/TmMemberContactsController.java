package com.time.member.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.time.common.core.model.R;
import com.time.member.entity.TmMemberContacts;
import com.time.member.service.TmMemberContactsService;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


/**
 * 会员库
 *
 * @author sy
 * @date 2020-04-13 02:33:56
 */
@RestController
@AllArgsConstructor
@RequestMapping("/tmmembercontacts" )
@Api(value = "tmmembercontacts", tags = "会员库管理")
public class TmMemberContactsController {

    private final TmMemberContactsService tmMemberContactsService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tmMemberContacts 会员库
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getTmMemberContactsPage(Page page, TmMemberContacts tmMemberContacts) {
        return R.ok(tmMemberContactsService.page(page, Wrappers.query(tmMemberContacts)));
    }


    /**
     * 通过id查询会员库
     * @param contactsId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{contactsId}" )
    public R getById(@PathVariable("contactsId" ) String contactsId) {
        return R.ok(tmMemberContactsService.getById(contactsId));
    }

    /**
     * 新增会员库
     * @param tmMemberContacts 会员库
     * @return R
     */
    @ApiOperation(value = "新增会员库", notes = "新增会员库")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmmembercontacts_add')" )
    public R save(@RequestBody TmMemberContacts tmMemberContacts) {
        return R.ok(tmMemberContactsService.save(tmMemberContacts));
    }

    /**
     * 修改会员库
     * @param tmMemberContacts 会员库
     * @return R
     */
    @ApiOperation(value = "修改会员库", notes = "修改会员库")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmmembercontacts_edit')" )
    public R updateById(@RequestBody TmMemberContacts tmMemberContacts) {
        return R.ok(tmMemberContactsService.updateById(tmMemberContacts));
    }

    /**
     * 通过id删除会员库
     * @param contactsId id
     * @return R
     */
    @ApiOperation(value = "通过id删除会员库", notes = "通过id删除会员库")
    @DeleteMapping("/{contactsId}" )
    @PreAuthorize("@pms.hasPermission('time-member_tmmembercontacts_del')" )
    public R removeById(@PathVariable String contactsId) {
        return R.ok(tmMemberContactsService.removeById(contactsId));
    }

}
