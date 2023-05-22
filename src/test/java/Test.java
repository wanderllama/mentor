import java.util.Arrays;

import static java.lang.Integer.valueOf;

public class Test {

    public static String concatonateAllString(String... a) {
        String send = "";
        for (int i = 0; i < a.length; i++) {
            send += a[i];
        }
        return send;
    }

    public static void main(String[] args) {
        System.out.println(concatonateAllString("first", "second"));
        System.out.println(concatonateAllString("first", "second", "third"));
        System.out.println(concatonateAllString("first", "second", "third", "fourth"));
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

}
