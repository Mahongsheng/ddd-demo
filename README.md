# ddd-demo

一个使用DDD领域驱动设计的工程实践，主要为熟悉DDD的设计并应用到解决业务问题中，形成Demo方便以后的学习与使用；

项目参考了美团技术团队博客“[领域驱动设计在互联网业务开发中的实践](https://tech.meituan.com/2017/12/22/ddd-in-practice.html)”一文，使用微服务+DDD的架构，避免业务的过耦合，同时解决贫血症和其引起的失忆症；

## 业务简要描述

实现一个双端（M端为管理员、C端为用户）抽奖平台；

## 项目架构

现实世界中，领域包含了问题域和解系统。一般认为软件是对现实世界的部分模拟。在DDD中，解系统可以映射为一个个限界上下文，限界上下文就是软件对于问题域的一个特定的、有限的解决方案。

划分五个限界上下文：

> 通常为`import com.company.team.business`，在这里我们替换business为ddd；

```java
import com.company.team.ddd.lottery.*;//抽奖上下文
import com.company.team.ddd.riskcontrol.*;//风控上下文
import com.company.team.ddd.counter.*;//计数上下文
import com.company.team.ddd.condition.*;//活动准入上下文
import com.company.team.ddd.stock.*;//库存上下文
```

## 上下文内架构

```java
import com.company.team.ddd.lottery.domain.valobj.*;//领域对象-值对象
import com.company.team.ddd.lottery.domain.entity.*;//领域对象-实体
import com.company.team.ddd.lottery.domain.aggregate.*;//领域对象-聚合根
import com.company.team.ddd.lottery.service.*;//领域服务
import com.company.team.ddd.lottery.repo.*;//领域资源库
import com.company.team.ddd.lottery.application.service;//应用服务层
import com.company.team.ddd.lottery.interfaces.assembler;//DTO-DO相互转换器
import com.company.team.ddd.lottery.interfaces.dto;//DTO模型
import com.company.team.ddd.lottery.interfaces.facade;//领域防腐层
```

各个上下文间以Feign做负载均衡调用，此处为简单模拟；