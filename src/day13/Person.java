package day13;

import java.io.Serializable;

/**
 * 可以序列化和反序列化的对象
 */
public class Person implements Serializable {
    /**
     * 表明一个序列化版本标识符的静态变量
     * 用来表明不同版本变量的兼容性
     */
    private static final long serialVersionUID = 1L;
    String name;
    int age;
}
