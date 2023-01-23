package Java.task2;

public class Beginner {
    final static String VLAD = "Vlad";
    private static String string = "Vlad";
    public static void main(String[] args) {
        Person igor = new Person();
        Person vova = new Person();

        vova.say();
        igor.run();

        int height;
        height = 188;
        short s;
        s = 12;
        float fl = 2.5f;
        Integer integer = 1234;
        int b = 6971;
        int a = 123;
        Integer.max(123, 6971);
        final int max = Integer.max (a, b);

        String str = "twe";
        String value = String.valueOf(s);

        System.out.println("twe");
        System.out.println(s);
        System.out.println(igor.age);
        System.out.println(height);
        System.out.println('@');
        System.out.println(fl);
        System.out.println(s);
        System.out.println();
        System.out.println(max);
        System.out.println(vova.getSalary());
        System.out.println(string);
        System.out.println(a);









    }
}
