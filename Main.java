package com.company;

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = null;
        CiftBagliListe rehber = new CiftBagliListe();
        try {
            scan = new Scanner(new FileInputStream("C:\\Users\\Hp\\IdeaProjects\\proje2\\src\\com\\company\\rehber.txt"));
        }
        catch (FileNotFoundException e){
            System.out.printf("Dosya bulunamadı.");
            System.exit(1);
        }
        while (scan.hasNextLine()) {
            StringTokenizer satır = new StringTokenizer(scan.nextLine(), (","));
            String adSoyad = satır.nextToken();
            ArrayList<String> numaralar = new ArrayList<>(3);

            while (satır.hasMoreTokens()){
                numaralar.add(satır.nextToken());
            }

            Bilgi kişi = new Bilgi(adSoyad, numaralar);
            rehber.ekle(kişi);

        }

    }
}
