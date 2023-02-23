package lesson4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cat bob = new Cat();
        Random rand = new Random();
        int i = 0;
        Cat cats1 = new Cat("bars", 15);
        Cat cats2 = new Cat("Viper", 30);
        cats2.getAge();
//        System.out.println(cats2);
//        System.out.println(cats2.getAge());
//        while (!(i >= 10)) {
//            i++;
//            System.out.println(bob);
//        }
//        for ( i = 0; i<10; i++){
//            System.out.println(rand.nextInt(10));
//            System.out.println(bob);
//        }
//        do {
//            i++;
//            System.out.println(bob);
//        }while (i<10);
        for (i = 0; i<5; i++ ) {
            System.out.println(i + bob.getAge()+bob.getName());
        }
        }
    }


