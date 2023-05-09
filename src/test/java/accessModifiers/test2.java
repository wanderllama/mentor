package accessModifiers;

import accessModifiers.extra.test;

public class test2 {

    public static void main(String[] args) {
        System.out.println(test.globalString);

        test.changeGlobalString();

        System.out.println(test.globalString);

//        privateMethod();
//        defaultMethod();
//        callPrivate();


//        test.protectedMethod();


    }
}
