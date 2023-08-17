import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a tu programara de sets de tennis\n----------------------------------------- ");
        System.out.println("Ingresa los juegos ganados por el equipo A");
        int GanadosA = sc.nextInt();
        System.out.println("Ingresa los juegos ganados por el equipo B");
        int GanadosB = sc.nextInt();
        int mas2 = GanadosA + 2;
        //si aun no termina el juego
        if ((GanadosA < 6) && (GanadosB < 6)) {
            System.out.println("el juego aun no termina");
        } else if ((GanadosB >=6) && (GanadosB>=mas2)) {
            System.out.printf("gano el equipo b");
        } else if (GanadosA == 3) {
            // Código para la variableA igual a 3
        } else if (GanadosA == 4) {
            // Código para la variableB igual a 4
        } else if (GanadosA == 5) {
            // Código para la variableA igual a 5
        } else if (GanadosA == 6) {
            // Código para la variableA igual a 6
        } else if (GanadosA == 7) {
            // Código para la variableA igual a 7
        } else if (GanadosA == 8) {
            // Código para la variableB igual a 8
        } else if (GanadosA == 9) {
            // Código para la variableA igual a 9
        } else if (GanadosA == 10) {
            // Código para la variableA igual a 10
        } else {
            // Código si ninguna de las opciones anteriores coincide
        }
    }
}