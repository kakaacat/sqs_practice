import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Java内置的4大核心函数式接口
 *
 * 消费型接口 Consumer<T>  void accept(T t)
 * 供给型接口 Supplier<T>  T get()
 * 函数型接口 Function<T,R>  R apply(T t)
 * 断定型接口 Predicate<T>  boolean test(T t)
 *
 *
 *
 * @Author : kaka
 * @Date: 2020-02-03 09:59
 */
public class LambdaTest3 {
    public static void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }
    public static void test1() {
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("一瓶矿泉水，价格" + aDouble);
            }
        });

        System.out.println("----------------");

        happyTime(400, money -> System.out.println("一瓶可乐，价格" + money));
    }

    public static void test2(){
        List<String> list = Arrays.asList("北京","南京","天津","东京","上海");
        List<String> filterStr = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });

        System.out.println(filterStr);
        System.out.println("-----------------");

        List<String> filterS = filterString(list, s -> s.contains("京"));
        System.out.println(filterS);
    }

    /**
     * 根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
     */
    public static List<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> filterList = new ArrayList<>();

        for (String s : list) {
            if (pre.test(s)){
                filterList.add(s);
            }
        }

        return filterList;

    }



    public static void main(String[] args) {
        test2();
    }
}
