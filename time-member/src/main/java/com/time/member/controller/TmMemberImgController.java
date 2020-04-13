package com.time.member.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.time.common.core.model.R;
import com.time.member.entity.TmMemberImg;
import com.time.member.service.TmMemberImgService;
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
@RequestMapping("/tmmemberimg" )
@Api(value = "tmmemberimg", tags = "会员库管理")
public class TmMemberImgController {

    private final TmMemberImgService tmMemberImgService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tmMemberImg 会员库
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getTmMemberImgPage(Page page, TmMemberImg tmMemberImg) {
        return R.ok(tmMemberImgService.page(page, Wrappers.query(tmMemberImg)));
    }


    /**
     * 通过id查询会员库
     * @param imgId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{imgId}" )
    public R getById(@PathVariable("imgId" ) String imgId) {
        return R.ok(tmMemberImgService.getById(imgId));
    }

    /**
     * 新增会员库
     * @param tmMemberImg 会员库
     * @return R
     */
    @ApiOperation(value = "新增会员库", notes = "新增会员库")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmmemberimg_add')" )
    public R save(@RequestBody TmMemberImg tmMemberImg) {
        return R.ok(tmMemberImgService.save(tmMemberImg));
    }

    /**
     * 修改会员库
     * @param tmMemberImg 会员库
     * @return R
     */
    @ApiOperation(value = "修改会员库", notes = "修改会员库")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmmemberimg_edit')" )
    public R updateById(@RequestBody TmMemberImg tmMemberImg) {
        return R.ok(tmMemberImgService.updateById(tmMemberImg));
    }

    /**
     * 通过id删除会员库
     * @param imgId id
     * @return R
     */
    @ApiOperation(value = "通过id删除会员库", notes = "通过id删除会员库")
    @DeleteMapping("/{imgId}" )
    @PreAuthorize("@pms.hasPermission('time-member_tmmemberimg_del')" )
    public R removeById(@PathVariable String imgId) {
        return R.ok(tmMemberImgService.removeById(imgId));
    }

}
