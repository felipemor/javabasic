public class numerodecrescente {

    static Thread T = new Thread();

    public static void main(String args[]) throws InterruptedException {

        for (int c = 20; c >= 0; c--) {
            T.sleep(1000);
            System.out.println(c);

        }

    }
}
