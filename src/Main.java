public class Main {
    public static void main(String[] args) {
        greet();
        count(28);
    }

    public static void greet() {
        System.out.println("Sidó Balázs");
        greet("Balazs");
        count(28);
    }

    public static void greet(String name) {
        System.out.println(name);
    }

    public static void cheer() {
        System.out.println("BBG");
    }

    public static void count(int age) {
        System.out.println(age);
    }
}


