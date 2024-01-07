## Sonar

使用 {SonarQube} 为团队和企业提供干净的代码

[Sonar官网]: https://www.sonarsource.com/products/sonarqube/?gads_campaign=SQ-Hroi-Brand&amp;gads_ad_group=SonarQube&amp;gads_keyword=sonarqube&amp;cq_src=google_ads&amp;cq_cmp=19274189926&amp;cq_con=147504963074&amp;cq_term=sonarqube&amp;cq_med=&amp;cq_plac=&amp;cq_net=g&amp;cq_pos=&amp;cq_plt=gp&amp;gad_source=1&amp;gclid=Cj0KCQiAkeSsBhDUARIsAK3tiec8taKFblqwD43OJpcjlK7b1ViTYPeXL4kHB1PJjzNOvyAeKIS1K1YaAmnwEALw_wcB	"Sonar官网"

![](/Users/wangke/Developer/Java/alp/images/sonar1.jpg)

![](/Users/wangke/Developer/Java/alp/images/sonar2.jpg)

![](/Users/wangke/Developer/Java/alp/images/sonar3.jpg)



## Code Review

### 目标及原则

- 提高代码质量，及早发现潜在缺陷，降低修改/弥补缺陷的成本
- 促进团队内部知识共享，提高团队整体水平
- 评审过程对于评审人员来说，也是一种思路重构的过程，帮助更多的人理解系统
- 是一个传递知识的手段，可以让其它并不熟悉代码的人知道作者的意图- 和想法，从而可以在以后轻松维护代码
- 可以被用来确认自己的设计和实现是一个清楚和简单的
- 鼓励相互学习对方的长处和优点

### 流程和规则

Git Flow 是一种基于 Git 的分支管理工作流，旨在帮助团队更有效地协同开发和管理软件项目。这个工作流程定义了一组清晰的分支和合并策略，以支持不同类型的开发活动。

Git Flow 包括以下主要分支：

- 主分支 (master)：
主分支包含了稳定的、已经发布或者即将发布的版本。对主分支的修改应该是经过充分测试和验证的。

- 开发分支 (develop)：
开发分支是围绕下一个版本的开发进行的地方。它是开发者进行日常工作的主要分支，所有新特性和 bug 修复都应该从这个分支开始。
除了这两个主要分支外，Git Flow 还包括以下支持性分支：

- 特性分支 (feature/feature-name)：
特性分支用于开发新功能。它从 develop 分支分出，并在完成后合并回 develop 分支。

- 发布分支 (release/release-version)：
发布分支用于准备发布一个新版本。在这个分支上进行最后的测试、版本号更新等工作。一旦准备就绪，它会被合并到 master 分支，同时也会合并回 develop 分支。

- 修复分支 (hotfix/hotfix-name)：
修复分支用于紧急修复在生产环境中发现的 bug。它从 master 分支分出，修复完成后合并回 master 和 develop 分支。

![04 Hotfix branches](/Users/wangke/Developer/Java/alp/images/04 Hotfix branches.svg)

[Gitflow]: https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow	"Gitflow"



### Pull Request

![](/Users/wangke/Developer/Java/alp/images/github.jpg)

- 通常我们接到一个新的需求时, 需要通过主干分支拉出一个新的本地分支进行开发
- 任务完成才能提交`PR`
- 严禁一个`PR`里面有多个任务，除非它们是紧密关联的
- 在提交PR时,指定相应`Review` 的人员
- 代码`Review` 通过将会合并主干, `删除feature 分支`

发起`Pull Request`以后，请将`Pull Request`的链接通过`Email`发给代码审核者，以此通知对方及时进行审核。

#### PR流程

![](/Users/wangke/Developer/Java/alp/images/pr1.jpg)

![](/Users/wangke/Developer/Java/alp/images/pr2.jpg)

![](/Users/wangke/Developer/Java/alp/images/pr3.jpg)

![](/Users/wangke/Developer/Java/alp/images/pr4.jpg)

![](/Users/wangke/Developer/Java/alp/images/pr5.jpg)

![](/Users/wangke/Developer/Java/alp/images/pr6.jpg)

![](/Users/wangke/Developer/Java/alp/images/pr7.jpg)

![](/Users/wangke/Developer/Java/alp/images/pr8.jpg)

![](/Users/wangke/Developer/Java/alp/images/pr9.jpg)
