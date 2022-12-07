package thread4;

public class test {
    public static void main(String[] args) {

        Thread thread = new Thread(new main());
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread from main");
        }
        Thread thread1 = new Thread(new main());
        thread1.start();

        main thread3 = new main ();
        Thread thread4 = new Thread(thread3);
        thread4.start();

        Thread Thread5 = new Thread(new main());
        Thread5.start();
    }
}
