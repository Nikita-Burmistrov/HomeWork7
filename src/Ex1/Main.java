package Ex1;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        Bird galliformes = new Galliformes("Galliformes",8);
        galliformes.printInfo();
        test.Foo(galliformes);
        System.out.println("");

        Bird crow = new Crow("Crow",11);
        crow.printInfo();
        test.Foo(crow);
        System.out.println("");

        Bird dio = new Dio("Dio Burandō",123);
        dio.printInfo();
        test.Foo(dio);
        System.out.println("");
        }
    }

