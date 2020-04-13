package com.time.member.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.time.common.core.model.R;

import com.time.member.entity.TmStudent;
import com.time.member.service.TmStudentService;
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
@RequestMapping("/tmstudent" )
@Api(value = "tmstudent", tags = "会员库管理")
public class TmStudentController {

    private final TmStudentService tmStudentService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tmStudent 会员库
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getTmStudentPage(Page page, TmStudent tmStudent) {
        return R.ok(tmStudentService.page(page, Wrappers.query(tmStudent)));
    }


    /**
     * 通过id查询会员库
     * @param studentId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{studentId}" )
    public R getById(@PathVariable("studentId" ) String studentId) {
        return R.ok(tmStudentService.getById(studentId));
    }

    /**
     * 新增会员库
     * @param tmStudent 会员库
     * @return R
     */
    @ApiOperation(value = "新增会员库", notes = "新增会员库")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmstudent_add')" )
    public R save(@RequestBody TmStudent tmStudent) {
        return R.ok(tmStudentService.save(tmStudent));
    }

    /**
     * 修改会员库
     * @param tmStudent 会员库
     * @return R
     */
    @ApiOperation(value = "修改会员库", notes = "修改会员库")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('time-member_tmstudent_edit')" )
    public R updateById(@RequestBody TmStudent tmStudent) {
        return R.ok(tmStudentService.updateById(tmStudent));
    }

    /**
     * 通过id删除会员库
     * @param studentId id
     * @return R
     */
    @ApiOperation(value = "通过id删除会员库", notes = "通过id删除会员库")
    @DeleteMapping("/{studentId}" )
    @PreAuthorize("@pms.hasPermission('time-member_tmstudent_del')" )
    public R removeById(@PathVariable String studentId) {
        return R.ok(tmStudentService.removeById(studentId));
    }

}
