package org.example.DemoTest;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 主题：复习Lambda Express表达式
 *先复制new对象的前面
 *
 * 假如要使用Lambda Express前提是它是一个函数式接口
 *
 * 1 拷贝小括号，写死右箭头，落地大括号
 *
 */
interface Foo{
//public void sayHello();
    public int add(int x,int y);
    default int div(int x,int y){
        return x*y;
    }
}

public class Test {
    public static void main(String[] args) {
       /* Predicate<String> stringPredicate = new Predicate<String>() {

            @Override
            public boolean test(String s) {
                return s.startsWith("a");
            }
        };*/
        Predicate<String> stringPredicate = (String s) -> {return s.startsWith("a");};
        System.out.println("stringPredicate = " + stringPredicate.test("a"));



        /*     *//*Supplier<String> supplier = new Supplier<>() {
            @Override
            public Object get() {
                return UUID.randomUUID().toString();
            }
        };*//*
        Supplier<String> supplier = () -> { return UUID.randomUUID().toString();};
        System.out.println(supplier.get());*/





        /* *//*Consumer<String> consumer = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println("s = " + s);
            }
        };*//*
        Consumer<String> consumer = (String s) -> {System.out.println("s = " + s);};
        consumer.accept("aaa");*/




       /* Function<String, String> function = new Function<String, String>() {

            @Override
            public String apply(String s) {
                //将输入的字符串s转换为大写字母，并返回转换后的字符串。
                return s.toUpperCase();
            }
        };*//*
        Function<String, String> function = (String s) -> {return s.toUpperCase();};
        System.out.println("function = " + function.apply("abc"));*/



/*        Foo foo = (x,y) -> {
        int result;
        result=x+y;
        return result;
        };
        System.out.println(foo.add(2, 3));
        System.out.println(foo.div(10,5));*/




        /*Foo foo = new Foo() {
            @Override
            public void sayHello() {
                System.out.println("asdf");
            }
        };
        ------------------------------------------
        Foo foo = () -> System.out.println("asdf");
        foo.sayHello();*/
    }
}
