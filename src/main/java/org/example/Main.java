package org.example;

public class Main {
    public static void main(String[] args) {
        AfishaManager afishaManager = new AfishaManager(2);
        afishaManager.addFilm("Привет");
        afishaManager.addFilm("Пока");
        afishaManager.addFilm("Досвидос");
        String[] films = afishaManager.findLast();
        for (String film : films) {
            System.out.println(film);
        }
    }
}