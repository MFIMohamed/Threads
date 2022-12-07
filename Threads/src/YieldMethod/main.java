package YieldMethod;

public class main {
    public static void main(String[] args) {
        MethodYield mY = new MethodYield();
        mY.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from main");
            Thread.yield();
        }
    }
}
