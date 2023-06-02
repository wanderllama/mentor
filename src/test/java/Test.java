import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.valueOf;

public class Test {



    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add(1, "two");
        list.add("three");
        list.add(1, "four");
        System.out.println(list);
        list.remove(1);
        list.remove("four");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());

    }

    public static String concatonateAllString(String... a) {
        String send = "";
        for (int i = 0; i < a.length; i++) {
            send += a[i];
        }
        return send;
    }


    // without var args
    public static String oldWayConcatonateString(String a, String b) {
        return a + b;
    }

    public static String oldWayConcatonateString(String a, String b, String c) {
        return a + b + c;
    }

    public static String oldWayConcatonateString(String a, String b, String c, String d) {
        return a + b + c + d;
    }

    public static int test(int... a) {
        return 9;
    }

    public static int test1(int[] a) {
        return 9;
    }

}
