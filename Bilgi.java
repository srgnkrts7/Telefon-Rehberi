package com.company;

import java.util.ArrayList;

public class Bilgi {
    private String adSoyad;
    private ArrayList<String> numaralar;

    public Bilgi(){
        adSoyad = null;
        numaralar = new ArrayList<>(1);
    }

    public Bilgi(String adSoyad, ArrayList<String> numaralar){
        this.adSoyad = adSoyad;
        this.numaralar = numaralar;
    }

    @Override
    public String toString(){
        return "Ad Soyad:" + getAdSoyad() + "\nNumaralar:" + getNumaralar();
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public ArrayList<String> getNumaralar() {
        return numaralar;
    }

    public void setNumaralar(ArrayList<String> numaralar) {
        this.numaralar = numaralar;
    }
}
