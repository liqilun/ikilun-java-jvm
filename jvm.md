 javaVM 判断对象实例何时回收 用的可达性分析算法，而非引用计数算法
 
 
 java虚拟机判断一个对象实例是否可以被回收，并非引用计数算法。
因为引用计数算法很难解决对象直接互相循环引用的问题。
所以java C＃都是使用可达性分析来判断对象是否可以回收的。
这个算法的基本思路就是通过一系列的称为“GC Root”的对象作为起始点，从这些节点开始向下搜素，搜索所走过的路径称为应用链，当一个对象到GC Roots没有任何引用链相连时。则证明此对象时不可用的，可以被回收了。如下图对象object5，object6，object7虽然互相有关系，但是没有GC roots可以达到他们。所以他们时可以被回收的对象。



从JAVA 5开始，JDK提供了一些JVM检测的API，这就是有名的java.lang.management 包，包里提供了许多MXBean的接口类，可以很方便的获取到JVM的内存、GC、线程、锁、class、甚至操作系统层面的各种信息,本文就简单的介绍一种利用JMX对JAVA进程进行CPU、堆内存使用的监控。很多朋友都在说，其实真没必要，现在有很多的工具都可以监控，比如：JMap，JHat，MAT，VIsualVM，JConsole工具都可以，但是有些时候Jconsole不一定能监控到作为系统服务的java进程，在这里我给大家做一个入门介绍。

JMX（Java Management Extensions），即JAVA管理扩展，用来监视和管理JVM以及其运行的操作系统。目前java平台主要提供了下图所示的9个MXBean, 各个MXBean的作用根据类名大概能猜出几分，具体可查API。

作者：小程故事多
链接：http://www.jianshu.com/p/fe37a62ba155
來源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


