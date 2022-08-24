package Ex1;

public class Dio extends Bird {

    public Dio(String name, int age) {
        super(name, age);
    }
    @Override
    public void walk() {
        StringBuffer sb = new StringBuffer("Wryyyуу");
        sb.insert(0,"MUDA ...!");
        System.out.println(sb);
    }
}
