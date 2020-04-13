package com.time.member.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.time.member.entity.TmMember;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员库
 *
 * @author sy
 * @date 2020-04-13 02:33:07
 */
@Mapper
public interface TmMemberMapper extends BaseMapper<TmMember> {

}
