package YieldMethod;

public class MethodYield extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from the damn child");
        }
    }
}
