BeanFactory:interface
    根据beanId获取bean

ConfigurableBeanFactory:interface
    get set beanClassLoader

SingletonBeanRegistry:interface
    get set SingletonBean

BeanDefinitionRegistry:interface
    get set BeanDefinition


DefaultSingletonBeanRegistry:class implements SingletonBeanRegistry
    保存单例bean实例

DefaultBeanFactory:class extends DefaultSingletonBeanRegistry:class implements ConfigurableBeanFactory,BeanDefinitionRegistry
    根据 BeanDefinition 的定义，创建bean实例，如果是单例的则存到DefaultSingletonBeanRegistry里面
    createBean
        先根据 beanClassName 创建bean，再根据 propertyValues 把各种属性set进去

GenericBeanDefinition:class
    定义bean的属性，id、className、scope
    propertyValues

PropertyValue
    BeanDefinition 的属性，
    name 是 bean的name，value是 RuntimeBeanReference 或者 TypedStringValue

RuntimeBeanReference
    bean set引用其它的bean

TypedStringValue
    bean set引用普通java基本类型

BeanDefinitionValueResolver
    如果传的 RuntimeBeanReference,则返回bean
    如果传的 TypedStringValue,则返回vale

XmlBeanDefinitionReader:class
    解析xml成 BeanDefinition ，保存到 BeanDefinitionRegistry:interface 里面；
    DefaultBeanFactory:class 实现了 BeanDefinitionRegistry:interface

AbstractApplicationContext
    初始化并保存 DefaultBeanFactory 实例；
    创建 XmlBeanDefinitionReader，XmlBeanDefinitionReader 将所有的 BeanDefinition 存到 DefaultBeanFactory 里；
    创建 ClassLoader 存到 DefaultBeanFactory 里；

ClassPathResource
    从项目里面读取文件转成 InputStream

FileSystemResource
    从文件系统里读取文件转成 InputStream

CustomBooleanEditor
    将xml中的 "true" 等字符串转成 boolean 类型

CustomNumberEditor
    将xml中的 "0" 等字符串转成 数字 类型

SimpleTypeConverter
    字符串转基本类型工具类


ConstructorArgument
    List<ValueHolder> argumentValues 描述构造函数参数如果创建

ConstructorArgument.ValueHolder
    value、type、name(RuntimeBeanReference or TypedStringValue)

Autowired
    定义注解


