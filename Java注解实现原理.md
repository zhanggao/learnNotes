注解是一个描述数据的数据，仅仅是元数据，和逻辑无关。

```
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
    public @interface Override {
}
```

上面是Java里面 @Override 的实现，这里面什么都没做，那 Java 是怎么实现继承检查的呢？

```
@Inherited // 表示子类继承该注解
@Target(ElementType.FIELD) // 注解用于什么地方(FIELD 用于属性)
@Retention(RetentionPolicy.RUNTIME) // 定义该注解的生命周期。(RUNTIME 一直到运行期)
@Documented // 一个简单的Annotations标记注解，表示是否将注解信息添加在java文档中
```

```
// 1、我们先来定义一个注解
@Target(ElementType.FIELD) // 注解用在属性上
@Retention(RetentionPolicy.RUNTIME) // 注解保留到运行期
@Documented // 将注解信息添加在java文档中
public @interface TestAnnotation {
    String testAnnoValue() default "myValue";
}

// 2、写一个类使用该注解

public class TestClass {
    @TestAnnotation("测试属性")
    private String testFieldA;

    @TestAnnotation
    private String testFieldB;
}

// 3、写一个类来实现注解的逻辑
public static void main(String[] args) {
    Class c = TestClass.class;
    Field[] fields = c.getDeclaredFields();

    for (Field field : fields) {
        TestAnnotation testAnnotation = field.getAnnotation(TestAnnotation.class);
        if (testAnnotation != null) {
            System.out.println("field:" + field.getName() + " value : " + testAnnotation.testAnnoValue());
        }
    }
    // 上面的循环输出
    // field:testFieldA value : 测试属性
    // field:testFieldB value : myValue
}

```

通过上面的例子是否明白了为什么 @Override 注解只有两三行代码？
因为 @Override 注解编译器实现了业务逻辑代码。