import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Lambda表达式的使用
 *
 * 1.举例： （o1，o2）—> Integer.compara(o1，o2);
 * 2.格式：
 *      -> ：Lambda操作符 或 箭头操作符
 *      ->左边：Lambda形参列表（其实就是接口中抽象方法的形参列表）
 *      ->右边：Lambda体（其实就是重写的抽象方法的方法体）
 * 3.Lambda表达式的使用：（分为6种情况）
 *
 *      总结：
 *      ->左边：Lambda表达式形参列表的参数类型可以省略（类型推断）；如果形参列表只有一个参数，括号也可以省略。
 *      ->右边：Lambda体应该使用一对{}包裹，如果只有一条执行语句，可以省略大括号（有return，也可以省）。
 * 4.Lambda表达式的本质：作为函数式接口的实例  (@FunctionalInterface)
 * 5.如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口
 *
 * @Author : kaka
 * @Date: 2020-02-02 19:04
 */
public class LambdaTest2 {

    /**语法格式一：无参，无返回值*/
    public static void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        };
        r1.run();
        System.out.println("---------------------------");

        //Lambda表达式
        Runnable r2 = () -> System.out.println("Hello World!");
        r2.run();
    }

    /**语法格式二：Lambda需要一个参数，但是没有返回值*/
    public static void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("Hello World!");
        System.out.println("-----------------");

        Consumer<String> con1 = (String s) -> System.out.println(s);
        con1.accept("Hello World!...");

    }
    /**语法格式三：数据类型可以省略，因为可由编译器推断出，称为“类型推断”*/
    public static void test3(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("Hello World!");
        System.out.println("-----------------");
        //类型省略
        Consumer<String> con1 = (s) -> System.out.println(s);
        con1.accept("Hello World!...");
    }
    public static void test4(){
        //类型推断
        ArrayList<String> list = new ArrayList<>();
        int[] a = {1,2,3};
    }

    /**语法格式四：Lambda若只需要一个参数时，参数的小括号可以省略*/
    public static void test5(){
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("I love Java!");

        System.out.println("------------");

        Consumer<String> con2 = s -> System.out.println(s);
        con2.accept("Talk is cheap,show me the code!");
    }

    /**语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值*/
    public static void test6(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return Integer.compare(o1, o2);
            }
        };

        System.out.println(com1.compare(12, 21));
        System.out.println("----------------------");

        Comparator<Integer> com2 = (o1,o2) ->{
            System.out.println(o1);
            System.out.println(o2);
            return Integer.compare(o1, o2);
        };
        System.out.println(com1.compare(41, 21));
    }

    /**语法格式六：当Lambda体只有一条语句时，return 与大括号若有，都可以省略*/
    public static void test7(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(com1.compare(12, 21));
        System.out.println("----------------------");

        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1, o2);
        System.out.println(com1.compare(41, 21));
    }

    public static void main(String[] args) {
        test7();
    }
}
