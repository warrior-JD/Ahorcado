package Dominio;

public class Palabra {
    private String[] palabra = {
            "JAVA",
            "PYTHON",
            "HTML",
            "CSS",
            "JAVASCRIPT",
            "ANDROID"
    };

    public String getRandomWord() {
        int index = (int) (Math.random() * palabra.length);
        return palabra[index];
    }
}
