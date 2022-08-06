package singleton;
public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonEager lazyholder = SingletonEager.getInstancia();
        System.out.println(lazyholder);
        lazyholder = SingletonEager.getInstancia();
        System.out.println(lazyholder);

    }
}
