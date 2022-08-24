package Ex2;

public class Main {
    int lol(int f, int v) {
        return f + v ;
    }

    double lol(double f, double v) {
        return f + v ;
    }

    long lol(long f, long v) {
        return f - v ;
    }

    void Show(){
        System.out.println (lol(8,15));
        System.out.println(lol(15.4,65.2));
        System.out.println(lol(1523256485,456156846));
    }

    public static void main(String[] args) {
    Main main = new Main();
    main.Show();
    }
}

