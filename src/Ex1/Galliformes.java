package Ex1;

public class Galliformes extends Bird {
    public Galliformes(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        StringBuffer sb = new StringBuffer("Pu-pu-pu");
        sb.insert(0,"Lol ");
        System.out.println(sb);
    }
}
