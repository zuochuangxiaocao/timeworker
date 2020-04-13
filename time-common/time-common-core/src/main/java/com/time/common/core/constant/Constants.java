package com.time.common.core.constant;

/**
 *
 * @date 2018/8/27
 * @package com.time.admin.constants
 */
public interface Constants {
    /**
     * 用户相关常量
     */
    int USER_STATUS_NORMAL = 1;
    int USER_STATUS_BLOCKED = 0;
    /**
     * 各种正则表达式
     */
    String USERNAME_PATTERN = "^[\\u4E00-\\u9FA5\\uf900-\\ufa2d_a-zA-Z][\\u4E00-\\u9FA5\\uf900-\\ufa2d\\w]{1,19}$";
    String MOBILE_PHONE_PATTERN = "^0{0,1}(13[0-9]|15[0-9]|14[0-9]|18[0-9])[0-9]{8}$";
    String EMAIL_PATTERN = "^\\w+([-.]\\w+)*@\\w+([-]\\w+)*\\.(\\w+([-]\\w+)*\\.)*[a-z]{2,3}$";
    /**
     * 菜单类型
     */
    int MENU = 1;
    int BUTTON = 2;
    /**
     * 基本角色
     */
    String BASE_ROLE = "ROLE_USER";
    String ROLE_ANONYMOUS = "ROLE_ANONYMOUS";

    /**
     * 安全相关
     */
    String TIME_LICENSE = "SHENYONG@TIMEWORK.CN";
    String JWT_SIGN_KEY = "SHENYONG@TIMEWORK.CN!@#";
    /**
     * token请求头名称
     */
    String TOKEN_HEADER = "Authorization";
    String TOKEN_BEARER = "Bearer ";
    /**
     * 查询客户端
     * 参考 JdbcClientDetailsService
     */
    String CLIENT_FIELDS = "client_id, client_secret, resource_ids, scope, "
                            + "authorized_grant_types, web_server_redirect_uri, authorities, access_token_validity, "
                            + "refresh_token_validity, additional_information, autoapprove";
    String BASE_FIND_STATEMENT = "select " + CLIENT_FIELDS + " from sys_oauth_client_details";
    String DEFAULT_FIND_STATEMENT = BASE_FIND_STATEMENT + " order by client_id";
    String DEFAULT_SELECT_STATEMENT = BASE_FIND_STATEMENT + " where client_id = ?";

    /***
     * 缓存时间设置
     */
    int MINUTE = 5;

    /***
     * license
     */
    String LICENSE_NAME = "TIME_LICENSE_";
}
