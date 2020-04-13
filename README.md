
#运行顺序
time-Eureka,time-admin,time-auth,time-ateway

# Time

- 前后端完全分离，基于最新稳定版本`Spring Boot 2.0.6.RELEASE`
- 基于网关的统一权限管理，更高效更方便
- 基于`Spring Security OAuth`实现按钮级细粒度权限控制
- `Apache LICENSE 2.0`，完全开源


# 项目介绍
项目使用Maven进行管理，结构如下：

``` lua
Time
├── time-admin -- 管理模块（端口：8003）
├── time-auth -- 权限模块（端口：8005）
├── time-common -- 共用模块
├── time-eureka -- 服务中心（端口：8001）
├── time-gateway -- ZUUL网关（端口：80）
├── time-member -- 会员模块（待实现 端口：8004）
```

- 用户管理：完整的用户管理授权体系
- 部门管理：配置系统组织机构，树结构展现，可随意调整上下级
- 菜单管理：配置系统菜单，操作权限，按钮权限标识，图标等
- 角色管理：角色菜单权限分配，最新的基于资源的权限控制（new RBAC）
- 会员管理: 会员基础信息，会员管理，等级，积分

## 软件架构

#### 后端技术选型

| 名称                  | 版本           | 说明         | 官网                                                         |
| --------------------- | -------------- | ------------ | ------------------------------------------------------------ |
| JDK                   | 1.8.0_161      | 运行环境     | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html |
| Maven                 | 3.5.2          | 项目构建管理 | http://maven.apache.org                                      |
| Spring-boot           | 2.0.6.RELEASE1 | 微服务框架   | https://spring.io/projects/spring-boot                       |
| Spring-cloud          | Finchley.SR2   | 微服务框架   | https://spring.io/projects/spring-cloud                      |
| Eureka                |                | 服务发现     | https://github.com/spring-cloud/spring-cloud-netflix         |
| Zuul                  |                | 网关         | https://github.com/spring-cloud/spring-cloud-netflix         |
| MySQL                 | 5.7.16         | 数据库       | https://www.mysql.com/downloads/                             |
| MyBatis               |                | ORM框架      | http://blog.mybatis.org/                                     |
| Swagger2              | 2.7.0          | 文档         | http://swagger.io                                            |
| Spring Security OAuth |                | 安全框架     | https://spring.io/projects/spring-security-oauth             |
| Hystrix               |                | 熔断器       | https://github.com/spring-cloud/spring-cloud-netflix         |
| Ribbon                |                | 负载均衡     | https://github.com/spring-cloud/spring-cloud-netflix         |

#### 前端技术选型

| 名称               | 版本   | 说明         | 官网                                            |
| ------------------ | ------ | ------------ | ----------------------------------------------- |
| vue                | 2.5.17 | 前端框架     | https://github.com/vuejs/vue                    |
| element-ui         | 2.4.6  | UI组件       | https://element.eleme.io/#/                     |
| axios              | 0.18.0 | 网络组件     | https://github.com/axios/axios                  |
| nprogress          | 0.2.0  | 进度条       | https://github.com/rstacruz/nprogress           |
| vuex               | 3.0.1  | 前端状态管理 | https://github.com/vuejs/vuex                   |
| vue-router         | 3.0.1  | 前端路由     | https://github.com/vuejs/vue-router             |
| vue-admin-template |        | 后台模板     | https://github.com/PanJiaChen/vue-element-admin |

