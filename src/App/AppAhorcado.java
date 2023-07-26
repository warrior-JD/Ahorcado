package App;

import Dominio.Juego;
import Dominio.Palabra;

import java.util.Scanner;

public class AppAhorcado {
    public static void main(String[] args) {
        Palabra ad = new Palabra();
        Juego juego = new Juego(ad.getRandomWord(), 6);

        System.out.println("Bienvenidos al Ahorcado!");
        Scanner ingreso = new Scanner(System.in);

        while (!juego.FinDelJuego()) {
            System.out.println("la Palabra es: " + juego.getPalabraAdivinar());
            System.out.println("Intentos Restantes: " + juego.getIntentosResatantes());
            System.out.print("Ingresa la letra: ");
            char letra = ingreso.next().charAt(0);

            if (Character.isLetter(letra)) {
                if (!juego.letraEnLaPalabra(letra)) {
                    System.out.println("Letras incorrecta.");
                }
            } else {
                System.out.println("por favor introducir una letra correcta");
            }

            if (juego.palabraAdivinada()) {
                System.out.println("\n" + "¡Felicidades! Adivinaste la palabra: " + juego.palabraAdivinada());
                break;
            }

            if (juego.getIntentosResatantes() == 0) {
                System.out.println("\n" + "¡Juego terminado! La palabra era:" + juego.getPalabraAdivinar());
                break;
            }
        }
        ingreso.close();
    }
}

