import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a tu programara de sets de tennis\n----------------------------------------- ");
        System.out.println("Ingresa los juegos ganados por el equipo A");
        int GanadosA = sc.nextInt();
        System.out.println("Ingresa los juegos ganados por el equipo B");
        int GanadosB = sc.nextInt();
            // Si aun no se ha terminado esto
            if (GanadosA<6){
                if (GanadosB<6){
                    System.out.println("El juego aun no termina");
                }
            // Si gana a esto
            else if (GanadosA>=6) {
                    System.out.println("aja");
                }
            }

    }
}