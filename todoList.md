

# 书
- [ ] **1. 各种相关概念**
    - [x] 大型网站技术架构核心原理与案例分析
    - [ ] 深入分析Java Web技术内幕
- [ ] **2. jvm**
    - [ ] 深入理解Java虚拟机
    - [ ] Java并发编程实战
- [ ] **3. 源码**
    - [ ] Spring 源码
    - [ ] MyBatis 源码 暂定
- [ ] **4. 数据库**
    - [ ] MySQL技术内幕
            1. InnoDB vs MyISAM
            2. EXPLAIN
            3. 前缀索引
            4. 事务隔离级别
            5. 范式
            6. 集群架构
            7. 级联备份方案
            8. 乐观锁、排它锁、间隙锁
            9. 子查询
    - [ ] Redis设计与实现
            1. 集群架构方案
            2. 3.x和2.x集群架构的区别
            3. 一致性哈希
- [ ] **5. 中间件**
    - [ ] 大型网站系统与Java中间件实践
    - [ ] Zookeeper
    - [ ] MessageQueue

# 知识点
- [ ] volatile实现原理，volatile做了什么事？
- [ ] Java写生产者消费者
- [ ] Java注解实现原理
- [x] [Java泛型实现原理](/Java泛型实现原理.md)
- [ ] Java锁的使用方式，synchronized和lock的区别
- [ ] mysql锁使用，乐观锁
- [ ] 缓存穿透
- [ ] 分布式锁的实现方式有哪些
- [ ] [Tomcat Spring 关系](/Tomcat&Spring.md)
- [ ] ClassLoader

- [ ] Thread.currentThread().setContextClassLoader(catalinaLoader);
- [ ] 数据库乐观锁、Redis分布式锁、ZooKeeper分布式锁
- [ ] Socket NIO Netty Dubbo


select * from tables where id = '11' // 很快 id是char类型
select * from tables where id = 11 // 非常慢

FutureTask

nio 
jvm模型
oom sof
显示锁隐式锁
jstack jstat jmap

netty
zookeeper选举算法

ConcurrentModificationException
for (String s : list) {
    if (s.startsWith("t")) {
        list.remove(s);
    }
}

一致性哈希
dubbo api spi
base cap
分布式事务 负载均衡

布隆过滤器是 利用一个超大的二进制数组和多个hash函数。
生成:
    1. 一个入参A，用X个hash函数生成X个值，将二进制数组上和X个值对应的置为1。
    2. 单个布隆过滤器只能增加，不能移除；要移除的话，可以再加个黑名单过滤器。
使用:
    1. 入参B，用X个hash函数生成X个值，如果二进制数组上对应的X个的值全部是1，则B可能在在集合中；如果有一个不是1，则B 100%不在集合中。


beans 节点下的配置需要成对出现

maven.pom 里的 profile/properties 和 build/filters/filter 里的值会在编译时将${var}全部替换掉。