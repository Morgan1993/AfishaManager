package org.example;

public class AfishaManager {
    private String[] films = {};
    private int limit;

    public AfishaManager() {
        limit = 10;
    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String newFilm) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength = Math.max(films.length, limit);
        String[] result = new String[limit];
        int k = 0;
        for (int i = films.length - 1; i >= 0; i--){
            if (k == limit) {
                break;
            }
            result[k++] = films[i];
        }
        return result;
    }
}
