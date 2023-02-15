package lesson4;


public class Cats {
    private String name;
    private String bars = "bars";
    private String tom = "tom";
    private String irb = "irb";
    private int age;
    private int a = 10;
    private int b = 20;
    private  int c = 30;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", bars='" + bars + a +
                ", tom='" + tom + b +
                ", irb='" + irb + c +
                ", age=" + age +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}