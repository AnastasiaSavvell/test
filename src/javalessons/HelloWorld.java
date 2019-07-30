package javalessons;

public class HelloWorld {
    public static void main (String[] args){
        System.out.println("Govno ebanoe");

        byte b = 10;
        short c = 200;
        int a = b + 23;
        long myLongValue = 123456789765L;

        float myFloatValue = 23.57F;
        double myDoubleValue = 56.54;

        double sum = a + b + c +myLongValue + myDoubleValue + myFloatValue;
        System.out.println("sum = "+ sum);

        float floatResult = myFloatValue/2;
        System.out.println("floatResult = "+ floatResult);

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\u00A9';
        System.out.println("char3 = "+char3);

        System.out.println("Sum of Character");
        System.out.println(char1 + char2 + char3);

        boolean b1 = true;
        boolean b2 = false;

        String s = "some string" + "some other string";
        System.out.println(s);

        System.out.println("b = "+ b);
        System.out.print("a = "+a);
        System.out.print("c = "+c);

        short someShort = b;
        int someInt = someShort;
        System.out.println("someShort = " + someInt);

        double someIntToDouble = someInt;
        System.out.println("someIntToDouble = " + someIntToDouble);
    }
}
