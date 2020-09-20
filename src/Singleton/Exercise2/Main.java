package Singleton.Exercise2;

public class Main {
    public static void main(String[] args) {
        Triple triple1 = Triple.getInstance(1);
        Triple triple2 = Triple.getInstance(2);
        Triple triple3 = Triple.getInstance(3);
        if (triple1 != null && triple2 != null && triple3 != null) {
            System.out.println("triple1, triple2, triple3 は全てnullではありません。");
        }

        if (triple1 != triple2 && triple2 != triple3 && triple3 != triple1) {
            System.out.println("triple1, triple2, triple3 は全て別のインスタンスです。");
        }

        Triple triple4 = Triple.getInstance(4);
        if (triple4 == null) {
            System.out.println("triple4 は null です");
        }

        Triple triple1_ = Triple.getInstance(1);
        if (triple1 == triple1_) {
            System.out.println("triple1 と triple1_ は同じインスタンスです。");
        }
    }
}
