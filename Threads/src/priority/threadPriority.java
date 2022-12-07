package priority;

public class threadPriority {
    public static void main(String[] args) {

        Task n = new Task();
        System.out.println(n.getPriority());
        n.setPriority(9);
        System.out.println(n.getPriority());
        n.setPriority(10);
        System.out.println(n.getPriority());
    }
}
