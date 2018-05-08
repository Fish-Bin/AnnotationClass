package com.example.annotation.cls;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * RetentionPolicy
 * 1.Source          在原文件中有效，被编译器丢弃
 * 2.Class           在class文件有效，可能会被虚拟机忽略 ()
 * 3.Runtime         在运行时有效。
 *
 * ElementType
 * 1.Type            类、接口（包括注释类型）或枚举声明
 * 2.Field           字段声明（包括枚举常量）
 * 3.Method          方法声明
 * 4.Parameter       参数声明
 * 5.Constructor     构造方法声明
 * 6.Local_Variable  局部变量声明
 * 7.Annotation_Type 注释类型声明
 * 8.Package         包声明
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface JPHelloWorld {
    String get() default "hui";
}
