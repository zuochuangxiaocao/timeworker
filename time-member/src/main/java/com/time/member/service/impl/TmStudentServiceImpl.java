package com.time.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.time.member.entity.TmStudent;
import com.time.member.mapper.TmStudentMapper;
import com.time.member.service.TmStudentService;
import org.springframework.stereotype.Service;

/**
 * 会员库
 *
 * @author sy
 * @date 2020-04-13 02:33:07
 */
@Service
public class TmStudentServiceImpl extends ServiceImpl<TmStudentMapper, TmStudent> implements TmStudentService {

}
