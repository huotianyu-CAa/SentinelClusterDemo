# SentinelClusterDemo
sentinel集群流控demo，包含token-client和token-server，基于nacos数据源实现配置持久化，基于zookeeper实现token-server高可用选举

# 使用前提环境：
1、确保sentinelboard项目已完成改造，即可以从nacos读取和拉取配置\n
2、nacos配置中心\n
3、zookeeper中间件\n

# 启动流程：
1、启动多个TokenServer项目实例，并在配置文件中配置端口，项目启动后会选举leader\n
2、启动多个TestService（即token-client）项目实例，并在配置文件中配置端口\n
3、在sentinelboard中配置token-client集群流控节点信息；配置token-client流控规则\n
4、测试集群流控是否生效\n

<img width="1783" alt="image" src="https://github.com/huotianyu-CAa/SentinelClusterDemo/assets/56818177/d0715667-ac03-481f-9690-d4bda772ba44">
<img width="1780" alt="image" src="https://github.com/huotianyu-CAa/SentinelClusterDemo/assets/56818177/46b17242-d2a8-4382-80bd-7f74a67fa297">

配置流控规则
<img width="1784" alt="image" src="https://github.com/huotianyu-CAa/SentinelClusterDemo/assets/56818177/bc4ea2e2-703f-4723-a93b-1dc4e7352618">

nacos配置
<img width="1783" alt="image" src="https://github.com/huotianyu-CAa/SentinelClusterDemo/assets/56818177/7f29b66c-5756-43c2-ab8a-a76c8f787cd1">

流控测试
<img width="1736" alt="image" src="https://github.com/huotianyu-CAa/SentinelClusterDemo/assets/56818177/43f53f4f-5445-455e-b704-af964dd59889">



