import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(      "\n" +
                "               /xxxx\\\n" +
                "              |xxxxxx|\n" +
                "              |xxxxxx|      _\n" +
                "              \\xxxxxx/     (~)\n" +
                "               \\xxxx/\n" +
                "                \\--/\n" +
                "                 ||\n" +
                "                 ||\n" +
                "                 ||\n" +
                "                 ||\n" +
                "                 ||\n" +
                "                 []\nBienvenido a tu programara de sets de tennis\n-------------------------------------------- ");
        System.out.println("Ingresa los juegos ganados por el equipo A");
        int GanadosA = sc.nextInt();
        System.out.println("Ingresa los juegos ganados por el equipo B");
        int GanadosB = sc.nextInt();
        int Paraganarb = GanadosA + 2;//((GanadosA < 6) && (GanadosB < 6))
        int Paraganara = GanadosB + 2;
        if ((GanadosA==5) && (GanadosB==5)) {
            System.out.println("Empate 5 a 5");
            //empate 5 a 5
        } else if ((GanadosA >6) && (GanadosA-GanadosB>2)){
            System.out.println("Invalido!!");
            //invalido de a
        } else if ((GanadosB >6) && (GanadosB-GanadosA>2)){
            System.out.println("Invalido!!");
            //invalido de b
        } else if ((GanadosA ==6) && (GanadosB==6)){
            System.out.println("Empate 6 a 6");
            //empate 6 a 6
        }
        else if ((GanadosB >=6) && (GanadosB>=Paraganarb)  &&((Paraganarb >=2))) {
            System.out.println("gano el equipo b");
            // Gano el b
        } else if ((GanadosA>=6) && (GanadosA>=Paraganara)&& (Paraganara >=2)) {
            System.out.println("Gano el Equipo A");
            // Gano el a
        } else if((GanadosA <= 6) && (GanadosB <= 6)&&(GanadosA>=0)&&(GanadosB>=0))  {
            System.out.println("el juego aun no termina");
            //EL juego no ha terminado
        } else {
            System.out.println("opcion invalida");
        }
    }
}