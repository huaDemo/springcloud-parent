# springcloud学习实例
知识点梳理
### 1.Eureka注册中心
    功能是对所有微服务起到管理作用。
### 2.Spring Cloud Config配置中心
    功能是通过配置中心加载git或svn上的启动文件。
    git地址：https://github.com/huaDemo/config-repo.git
    请求实例：http://localhost:8888/configclient/dev/master
### 3.Spring Cloud Gateway路由转发
    功能是将所有的请求全部交由路由服务并转发到其他服务。
    请求实例：http://localhost:9000/configserver/configclient/dev/master
### 4.Feign服务调用
    功能是对微服务内部之间进行调用
### 5.Hystrix熔断器
    功能是为了防止服务发生雪崩
### 6.Zipkin链路追踪
    功能是对所有服务进行日志监控
    
    