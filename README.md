# java重点笔记<p>
### [1.面向对象编程](https://github.com/wwc04/java-learn-note/tree/main/ObjectOrientedProgramming "面向对象编程")
### 三大核心特性

### 封装
将数据和对数据的操作封装在类中，隐藏内部实现细节，只暴露必要的接口
通过访问修饰符（public、protected、private）控制成员的可见性
提高了代码的安全性和可维护性，降低了模块间的耦合度

### 继承
子类可以继承父类的属性和方法，实现代码的复用和扩展
Java采用单继承机制，一个类只能直接继承一个父类
子类可以重写父类的方法，实现多态性
继承关系体现了"is-a"的关系，如"Student is a Person"

### 多态
同一操作作用于不同对象时产生不同的行为
编译时多态：通过方法重载实现，根据参数列表决定调用哪个方法
运行时多态：通过方法重写实现，父类引用指向子类对象时，调用的是子类重写的方法
多态提高了程序的扩展性和可维护性

<br>

### [2.异常](https://github.com/wwc04/java-learn-note/tree/main/Exception "异常")
### 异常体系结构
Java异常体系以Throwable为顶层父类，分为两大分支：
Error：系统级错误，如内存溢出、栈溢出，程序通常无法处理
Exception：程序级异常，分为受检异常和非受检异常
受检异常：编译时必须处理的异常，如IOException、SQLException
非受检异常：运行时异常，如NullPointerException、ArrayIndexOutOfBoundsException

### 异常处理机制
try-catch-finally结构：try块包含可能抛出异常的代码，catch块捕获并处理异常，finally块确保无论是否发生异常都会执行
throws声明：在方法签名中声明可能抛出的异常，将异常处理责任传递给调用者
throw语句：主动抛出异常对象
自定义异常：通过继承Exception或RuntimeException创建业务特定的异常类

### 最佳实践
具体异常优先捕获，最后捕获通用异常
不要忽略异常，至少要记录日志
使用try-with-resources自动管理资源
避免在finally块中抛出异常
异常信息应该清晰明确，便于问题定位

<br>

### [3.集合](https://github.com/wwc04/java-learn-note/tree/main/Set "集合")
### 核心接口体系
Collection接口是单列集合的根接口，主要子接口：
List：有序、可重复的集合，通过索引访问元素
Set：无序、不可重复的集合
Queue：队列，先进先出的数据结构
Map接口是双列集合的根接口，存储键值对映射关系。

### 主要实现类特性
### List实现类
ArrayList：基于动态数组，随机访问快，增删慢
LinkedList：基于双向链表，增删快，随机访问慢
### Set实现类
HashSet：基于哈希表，无序，查询最快
LinkedHashSet：维护插入顺序的HashSet
TreeSet：基于红黑树，元素有序
### Map实现类
HashMap：基于哈希表，键值对无序
LinkedHashMap：维护插入顺序的HashMap
TreeMap：基于红黑树，键有序


### 底层原理
HashMap采用数组+链表/红黑树结构，通过哈希算法确定元素位置
当哈希冲突时使用链表法解决，链表长度超过阈值时转为红黑树
扩容机制：当元素数量超过容量×负载因子时进行2倍扩容
并发集合通过分段锁或CAS操作保证线程安全

<br>

### [4.Stream流](https://github.com/wwc04/java-learn-note/tree/main/Stream "Stream流")
### 核心概念
Stream是Java 8引入的函数式编程特性，不是数据结构，而是对数据源的计算操作：
不会修改源数据，每次操作都生成新的Stream
操作分为中间操作和终止操作
支持并行处理，充分利用多核CPU

### 数据操作类型
### 中间操作
过滤：filter、distinct
映射：map、flatMap
排序：sorted
截取：limit、skip
### 终止操作
匹配：anyMatch、allMatch、noneMatch
查找：findFirst、findAny
归约：reduce、collect
遍历：forEach

<br>

### [5.I/O流](https://github.com/wwc04/java-learn-note/tree/main/IO "I/O流")
### 流分类体系
### 按数据流向：
输入流：从数据源读取数据
输出流：向目标写入数据
### 按数据处理单位：
字节流：以字节为单位，适合处理所有类型数据
字符流：以字符为单位，适合处理文本数据

### 核心类层次
### 字节流
InputStream/OutputStream：所有字节流的抽象基类
FileInputStream/FileOutputStream：文件字节流
BufferedInputStream/BufferedOutputStream：缓冲字节流
### 字符流
Reader/Writer：所有字符流的抽象基类
FileReader/FileWriter：文件字符流
BufferedReader/BufferedWriter：缓冲字符流

<br>

### [6.日志技术](https://github.com/wwc04/java-learn-note/tree/main/SpecialDocuments/Log "日志技术")
### 日志框架体系
Log4j：早期的流行日志框架
Logback：Log4j的改进版本，性能更好
Log4j2：重新设计的日志框架，支持异步日志
SLF4J：日志门面，提供统一的API接口

### 核心组件
Logger：日志记录器，负责输出日志
Appender：日志输出目的地，如控制台、文件、数据库
Layout：日志格式定义
Level：日志级别，包括TRACE、DEBUG、INFO、WARN、ERROR

### 最佳实践
合理选择日志级别，生产环境使用INFO及以上级别
日志信息要包含足够的上下文，便于问题排查
使用参数化日志，避免字符串拼接的性能开销
重要操作记录操作日志，便于审计和监控
日志文件要合理分割和归档，避免单个文件过大

<br>

### [7.多线程](https://github.com/wwc04/java-learn-note/tree/main/Thream "多线程")
### 线程创建方式
继承Thread类：重写run方法，简单但不利于扩展
实现Runnable接口：更灵活，推荐使用
实现Callable接口：可以有返回值和抛出异常
使用线程池：管理和复用线程，提高性能

### 线程状态管理
NEW：新建状态，线程对象已创建但未启动
RUNNABLE：可运行状态，可能在运行或等待CPU时间片
BLOCKED：阻塞状态，等待获取监视器锁
WAITING：等待状态，无限期等待其他线程通知
TIMED_WAITING：超时等待状态，在指定时间内等待
TERMINATED：终止状态，线程执行完毕

### 线程同步机制
synchronized关键字：内置锁，保证方法或代码块的原子性
volatile关键字：保证变量的可见性，防止指令重排序
Lock接口：更灵活的锁机制，支持公平锁、可中断锁
原子变量：基于CAS操作，无锁线程安全
并发工具类：CountDownLatch、CyclicBarrier、Semaphore等

### 线程池原理
核心线程池：常驻的工作线程
工作队列：存放等待执行的任务
最大线程数：线程池能容纳的最大线程数量
拒绝策略：当任务无法处理时的处理方式
线程工厂：创建新线程的工厂类

<br>

### [8.网络通信](https://github.com/wwc04/java-learn-note/tree/main/NetCommunication "网络通信")
### 网络基础概念
IP地址：设备的网络标识
端口号：应用程序的网络入口
协议：通信规则和格式，如TCP、UDP、HTTP
Socket：网络通信的端点

### TCP协议特性
面向连接：通信前需要建立连接
可靠传输：通过确认机制、重传机制保证数据可靠到达
流量控制：通过滑动窗口机制控制发送速率
拥塞控制：根据网络状况调整发送速率

### HTTP协议
无状态协议：每次请求独立，服务器不保存客户端状态
请求-响应模型：客户端发送请求，服务器返回响应
持久连接：HTTP/1.1支持连接复用，减少建立连接的开销
状态码：表示请求处理结果，如200成功、404未找到

### 通信模式
阻塞I/O：线程在数据未就绪时阻塞等待
非阻塞I/O：立即返回结果，需要轮询检查状态
I/O多路复用：单个线程管理多个连接，提高并发能力
异步I/O：操作完成后通过回调通知，线程不阻塞

<br>

### [9.反射](https://github.com/wwc04/java-learn-note/tree/main/Reflect "反射")
### 核心概念
反射允许程序在运行时获取类的信息并操作类的成员：
动态获取类的完整结构信息
在运行时创建对象、调用方法、访问字段
突破访问权限限制，访问私有成员

### 主要API功能
Class类：类的元数据，获取类的各种信息
Constructor类：构造方法，用于创建对象实例
Method类：方法信息，用于调用方法
Field类：字段信息，用于访问和修改字段值
Annotation类：注解信息，用于处理注解

### 应用场景
框架开发：Spring、MyBatis等框架大量使用反射
动态代理：基于反射实现方法的动态拦截和增强
注解处理：读取和处理自定义注解
对象序列化：将对象状态转换为可存储或传输的格式
工具开发：如IDE的代码提示、调试工具等

</p>


