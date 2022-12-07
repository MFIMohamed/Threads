package Runnableinterface;

public class mainInterface implements Runnable {
    public static void main(String[] args) {

        mainInterface mI = new mainInterface();
        Thread nT = new Thread(mI);
        nT.start();

    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("This is from runnable");
        }
    }
}
