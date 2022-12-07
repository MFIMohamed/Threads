package threadInterrupt;

public class main {
    public static void main(String[] args) {
        threadClassNormal threadClassNormall = new threadClassNormal();
        threadClassNormall.start();
        threadClassNormall.interrupt();

        threadClassSleep threadClassSleep1 = new threadClassSleep();
        threadClassSleep1.start();
        threadClassSleep1.interrupt();
    }
}
