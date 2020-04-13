package com.time.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.time.member.entity.TmMemberContacts;
import com.time.member.mapper.TmMemberContactsMapper;
import com.time.member.service.TmMemberContactsService;
import org.springframework.stereotype.Service;

/**
 * 会员库
 *
 * @author sy
 * @date 2020-04-13 02:33:56
 */
@Service
public class TmMemberContactsServiceImpl extends ServiceImpl<TmMemberContactsMapper, TmMemberContacts> implements TmMemberContactsService {

}
