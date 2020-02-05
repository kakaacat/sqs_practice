import java.io.PrintStream;
import java.util.function.Consumer;

/**
 *
 * 方法引用的使用
 *
 * 1.使用情景：当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
 * 2.方法引用，本质上就是Lambda表达式，而Lambda表达式作为函数式接口的实例。所以
 *      方法引用，也是函数式接口的实例.
 *
 * 3.使用格式： 类(对象) :: 方法名
 *
 * 4.具体分为如下三种情况：
 *  对象 :: 非静态方法
 *  类 :: 静态方法
 *  类 :: 非静态方法
 *
 * 5.方法引用使用的要求：要求接口中的抽象方法的形参列表和返回值类型
 *      与方法引用的方法的形参列表和返回值类型相同！
 *
 * @Author : kaka
 * @Date: 2020-02-03 10:51
 */
public class MethodRefTest {
    //情况一：对象 :: 实例方法
    //Consumer中的void accept(T t)
    //PrintStream中的 void println(T t)
    public static void test1(){
        Consumer<String> con1 = s -> System.out.println(s);
        con1.accept("Hello World!");

        System.out.println("---------------");

        PrintStream ps = System.out;
        Consumer<String> con2 = ps :: println;
        con2.accept("hello world!");

    }

    public static void main(String[] args) {
        test1();
    }
}
