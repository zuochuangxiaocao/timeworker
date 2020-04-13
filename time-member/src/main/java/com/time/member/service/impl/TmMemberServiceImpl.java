package com.time.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.time.member.entity.TmMember;
import com.time.member.mapper.TmMemberMapper;
import com.time.member.service.TmMemberService;
import org.springframework.stereotype.Service;

/**
 * 会员库
 *
 * @author sy
 * @date 2020-04-13 02:33:07
 */
@Service
public class TmMemberServiceImpl extends ServiceImpl<TmMemberMapper, TmMember> implements TmMemberService {

}
