# Tomcat 和 Spring 的关系

## Tomcat
主要功能：Connector Container
HTTP 服务器本质上是一个普通的应用，运行在服务器上，监听一个tcp端口来接收并处理HTTP请求，绝大多数语言都能实现这种功能，基本都有现成的类库。
Tomcat 本质上也是这样的一个处理 HTTP 请求的应用，再加是一个 Servelet 容器。
Spring 可以理解成是一个 Servelet，接收所有从 Tomcat 过来的请求，Spring 再将请求分发到各个类。

1、Tomcat 启动时会读取web.xml配置中的两个节点<context-param>和<listener>，并将<context-param>里的值保存为键值对。
2、接着容器会创建一个ServletContext上下文，应用范围内整个容易都使用这个上下文。
3、将<context-param>里读取到的键值对交给ServletContext。
4、容器创建<listener>里的节点的类实例。
5、contextInitialized(ServletContextEvent event)里可以servletContext.getInitParameter("contextConfigLocation")得到<context-param>里的值

listener 可以理解成是 Tomcat 提供的启动入口。


HttpConnector 初始化一个 ServerSocket ,起一个线程等待，等待新的连接请求。




## Spring
Spring 实现了ServletContextListener接口。
