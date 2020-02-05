import java.util.Comparator;

/**
 * @ClassName : LambdaTest1
 * @Description :
 * @Author : kaka
 * @Date: 2020-02-02 17:25
 */
public class LambdaTest1 {

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

    public static void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        int compara1 = com1.compare(34, 21);
        System.out.println(compara1);
        
        System.out.println("---------------------------");
        
        //Lambda表达式 "->"
        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1, o2);
                
        int compara2 = com2.compare(12, 21);
        System.out.println(compara2);

        System.out.println("---------------------------");

        //方法引用 "::"
        Comparator<Integer> com3 = Integer::compare;

        int compara3 = com3.compare(12, 12);
        System.out.println(compara3);
    }

    public static void main(String[] args) {
        test2();
    }
}
