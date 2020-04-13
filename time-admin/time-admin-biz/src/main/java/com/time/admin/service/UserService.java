
package com.time.admin.service;

import com.time.admin.model.dto.QueryParam;
import com.time.common.core.model.domain.UserDO;
import com.time.common.core.model.dto.Page;
import org.springframework.stereotype.Service;

/**
 * 系统用户
 *
 *
 * @date 2018/8/16
 * @package com.time.admin.service
 */
@Service
public interface UserService {
    /**
     * 根据主键获取用户信息
     *
     * @param id 主键
     * @return {@link UserDO}
     */
    UserDO get(Long id);

    /**
     * 根据用户名获取用户
     *
     * @param username 用户名
     * @return {@link UserDO}
     */
    UserDO getByUsername(String username);

    /**
     * 根据手机号获取用户
     *
     * @param mobilephone 手机号
     * @return {@link UserDO}
     */
    UserDO getByMobilephone(String mobilephone);

    /**
     * 根据邮箱获取用户
     *
     * @param email 邮箱
     * @return {@link UserDO}
     */
    UserDO getByEmail(String email);

    /**
     * 查询用户列表页
     *
     * @param queryParam 查询参数
     * @return {@link Page}
     */
    Page findPage(QueryParam queryParam);

    /**
     * 生成用户密码加密串
     *
     * @param password 密码
     * @return 加密密码串
     */
    String encryptPassword(String password);

    /**
     * 新增用户
     *
     * @param userDO
     * @return true 成功 false 失败
     */
    boolean save(UserDO userDO);

    /**
     * 更新用户
     *
     * @param userDO
     * @return true 成功 false 失败
     */
    boolean update(UserDO userDO);

    /**
     * 删除用户
     *
     * @param id 用户ID
     * @return true 成功 false 失败
     */
    boolean delete(Long id);
}
