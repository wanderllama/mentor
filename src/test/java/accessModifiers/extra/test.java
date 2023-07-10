package accessModifiers.extra;

public class test {

    public static String globalString = "string";

    public static void changeGlobalString() {
        globalString = "changed";
    }

    public static String changeString(String str) {
        return "changed";
    }

    private static int privateMethod() {
        return 1;
    }

    public static void callPrivate() {
        privateMethod();
    }

    protected static void protectedMethod() {
        System.out.println("protected method");
    }

    public static int howToBreakWithReturn(int x) {
        for (int i = 0; i < 10; i++) {
            if(i == x) {
                return 0;
            }
        }
        return 1;
    }

    static int defaultMethod() {
return 0;
    }

    public static void main(String[] args) {

        privateMethod();

        howToBreakWithReturn(5);

        changeGlobalString();

        String var = "string";
        var = changeString(var);



        System.out.println(globalString);

            // this is a conflict -> created in gihub
        // but i want to do this
        // and this
    }
}
