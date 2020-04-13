
package com.time.auth.userdetails;

import com.time.auth.service.feign.UserService;
import com.time.common.core.model.domain.RoleDO;
import com.time.common.core.model.domain.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @date 2018/10/19
 * @package com.time.auth.service
 */
@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDO userDO = userService.getByUsername(username);
        List<RoleDO> roles = userService.getUserRole(userDO.getId());
        return new UserDetailsImpl(userDO, roles);
    }
}
