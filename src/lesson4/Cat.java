package lesson4;


public class Cat {
    private String name;
    private int age;

    public Cat() {
        name = "BOB";
        age = 20;
    }
    public static int getRandomAge(){
        return 0;
    }
    public static String getRandomName() {
        return "";
    }

    public int getAge() {
        return age;
    }

    public Cat(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}