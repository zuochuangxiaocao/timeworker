package com.time.member.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.time.common.core.model.R;

import com.time.member.entity.TmSign;
import com.time.member.service.TmSignService;
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
@RequestMapping("/tmsign" )
@Api(value = "tmsign", tags = "会员库管理")
public class TmSignController {

    private final TmSignService tmSignService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tmSign 会员库
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getTmSignPage(Page page, TmSign tmSign) {
        return R.ok(tmSignService.page(page, Wrappers.query(tmSign)));
    }


    /**
     * 通过id查询会员库
     * @param signId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{signId}" )
    public R getById(@PathVariable("signId" ) String signId) {
        return R.ok(tmSignService.getById(signId));
    }

    /**
     * 新增会员库
     * @param tmSign 会员库
     * @return R
     */
    @ApiOperation(value = "新增会员库", notes = "新增会员库")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmsign_add')" )
    public R save(@RequestBody TmSign tmSign) {
        return R.ok(tmSignService.save(tmSign));
    }

    /**
     * 修改会员库
     * @param tmSign 会员库
     * @return R
     */
    @ApiOperation(value = "修改会员库", notes = "修改会员库")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmsign_edit')" )
    public R updateById(@RequestBody TmSign tmSign) {
        return R.ok(tmSignService.updateById(tmSign));
    }

    /**
     * 通过id删除会员库
     * @param signId id
     * @return R
     */
    @ApiOperation(value = "通过id删除会员库", notes = "通过id删除会员库")
    @DeleteMapping("/{signId}" )
    @PreAuthorize("@pms.hasPermission('time-member_tmsign_del')" )
    public R removeById(@PathVariable String signId) {
        return R.ok(tmSignService.removeById(signId));
    }

}
