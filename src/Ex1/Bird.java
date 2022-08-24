package Ex1;

public class Bird {
    String name;
    int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void printInfo(){
        System.out.println("Назвиние:" + name +". Возрост:" + age);
    }


    public void walk(){
        StringBuffer sb = new StringBuffer("Pi-pi-pi");
        sb.insert(0,"Hi ");
        System.out.println(sb);
    }

}

