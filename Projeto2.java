import java.util.Random;

public class Projeto2 {

    public static void main(String[] args) {
        int x;
        Random generated = new Random(); // Random gera número aleatório

        for(int i=0; i < 6; i++) {
            int number = generated.nextInt(60);
            System.out.println(number);
        }
    }

}

