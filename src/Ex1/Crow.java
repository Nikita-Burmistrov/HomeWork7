package Ex1;

public class Crow extends Bird {

    public Crow(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        StringBuffer sb = new StringBuffer("Po-po-po");
        sb.insert(0,"Hello ");
        System.out.println(sb);
    }
}
