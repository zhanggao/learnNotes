List<Integer> 和 List<String> 

语法糖 伪泛型

Java 的范型本质是一个伪泛型，只是Java提供的一个语法糖，是在编译期间实现的。
ArrayList<Integer> 和 ArrayList<String> 最终编译后都是 ArrayList，内部的用来存储内容的 elementData 数组本来就是 Object[] 类型，使用泛型时加的泛型参数，在编译时会被类型擦除。
Java编译器先在编译的时候先检查代码中使用泛型的类型，再进行类型擦除，再进行编译。
当定义了一个List<Integer> list = new List<>();类型时，list.add("string")会报错，这是在编译期间检查的，通过反射是能向list中add String类型的，并且也能取出来得到正确的类型。

先检查再编译，检查编译的对象引用和值传递的问题
自动类型转换
类型擦除与多态的冲突
泛型变量不能是基本数据类型，List<Integer>类型擦除后会变成原始类型List<Object> Object不能用来储存原始类型
