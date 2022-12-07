package Thread2;

public class main {
    public static void main(String[] args) {
        childthread cT = new childthread();
        cT.start();

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Hey THere from main " + i );

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println("Interupted Exception Occured " + e );
            }
        }
    }
}
