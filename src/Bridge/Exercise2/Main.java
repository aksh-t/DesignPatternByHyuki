package Bridge.Exercise2;

public class Main {
    public static void main(String[] args) {
        CountDisplay d = new CountDisplay(new FileDisplayImpl("src/Bridge/Exercise2/star.txt"));
        d.multiDisplay(3);
    }
}
