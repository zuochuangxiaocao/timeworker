
package com.time.admin.service.impl;

import com.time.admin.dao.RoleMenuDAO;
import com.time.admin.service.RoleMenuService;
import com.time.common.core.model.domain.RoleMenuDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 角色菜单
 *
 *
 * @date 2018/10/16
 * @package com.time.admin.service.impl
 */
@Transactional(rollbackFor = {RuntimeException.class})
@Service
public class RoleMenuServiceImpl implements RoleMenuService {
    @Autowired
    private RoleMenuDAO roleMenuDAO;
    /**
     * 获取角色菜单ID集合
     *
     * @param roleId 角色主键
     * @return List<Long>
     */
    @Transactional(readOnly = true, rollbackFor = {RuntimeException.class})
    @Override
    public List<Long> findMenuIdsByRoleId(Long roleId) {
        return roleMenuDAO.findMenuIdsByRoleId(roleId);
    }

    /**
     * 删除角色菜单关系
     *
     * @param roleId 角色主键
     * @return 受影响行数
     */
    @Override
    public Integer deleteByRoleId(Long roleId) {
        return roleMenuDAO.deleteByRoleId(roleId);
    }

    /**
     * 批量保存角色菜单关系
     *
     * @param roleMenus 角色菜单
     * @return 受影响行数
     */
    @Override
    public Integer batchSave(List<RoleMenuDO> roleMenus) {
        return roleMenuDAO.batchSave(roleMenus);
    }
}
