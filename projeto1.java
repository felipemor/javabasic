public class projeto1 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args [2]);

        if (args[0].equals("Somar")){
            sum (x,y);
        }else if (args[0].equals("Subtrair")) {
            sub (x,y);
        }
        if (args[0].equals("multiplicar")){
            mult (x,y);
        }else if (args[0].equals("dividir")) {
            div (x,y);
        }else {
            System.out.println("Comando não Detectado");
        }

    }
    static void sum ( int x ,int y) {
        System.out.println(x+y);
    }

    static void div ( int x ,int y) {
        System.out.println(x/y);
    }

    static void mult ( int x ,int y) {
        System.out.println(x*y);
    }

    static void sub ( int x ,int y) {
        System.out.println(x-y);
    }
}
