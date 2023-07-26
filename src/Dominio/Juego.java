package Dominio;

public class Juego {
    private String palabraSecreta;
    private StringBuilder palabraAdivinar;
    private int intentosResatantes;
    private boolean finDelJuego;

    public Juego(String palabra, int IntentosMaximos) {
        palabraSecreta = palabra.toUpperCase();
        palabraAdivinar = new StringBuilder(palabraSecreta.length());
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraAdivinar.append("_");
        }
        intentosResatantes = IntentosMaximos;
        finDelJuego = false;
    }

    public boolean FinDelJuego() {
        return finDelJuego;
    }

    public boolean letraEnLaPalabra(char palabra) {
        palabra = Character.toUpperCase(palabra);
        boolean encontro = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == palabra) {
                palabraAdivinar.setCharAt(i, palabra);
                encontro = true;
            }
        }
        if (!encontro) {
            intentosResatantes--;
        }
        return encontro;
    }

    public boolean palabraAdivinada() {
        return palabraAdivinar.toString().equals(palabraSecreta);
    }

    public int getIntentosResatantes() {
        return intentosResatantes;
    }

    public String getPalabraAdivinar() {
        return palabraAdivinar.toString();
    }
}
