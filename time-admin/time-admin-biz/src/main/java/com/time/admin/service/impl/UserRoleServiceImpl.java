
package com.time.admin.service.impl;

import com.time.admin.dao.UserRoleDAO;
import com.time.admin.service.UserRoleService;
import com.time.common.core.model.domain.UserRoleDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户角色
 *
 *
 * @date 2018/8/30
 * @package com.time.admin.service.impl
 */
@Transactional(rollbackFor = {RuntimeException.class})
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleDAO userRoleDAO;
    /**
     * 获取用户角色ID集合
     *
     * @param userId 用户主键
     * @return List<Long>
     */
    @Transactional(readOnly = true, rollbackFor = {RuntimeException.class})
    @Override
    public List<Long> findRoleIdsByUserId(Long userId) {
        return userRoleDAO.findRoleIdsByUserId(userId);
    }

    /**
     * 删除用户角色关系
     *
     * @param userId 用户主键
     * @return 受影响行数
     */
    @Override
    public Integer deleteByUserId(Long userId) {
        return userRoleDAO.deleteByUserId(userId);
    }

    /**
     * 批量保存用户角色关系
     *
     * @param userRoles 用户角色
     * @return 受影响行数
     */
    @Override
    public Integer batchSave(List<UserRoleDO> userRoles) {
        return userRoleDAO.batchSave(userRoles);
    }
}
