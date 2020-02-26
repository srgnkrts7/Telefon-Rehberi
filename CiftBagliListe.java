package com.company;

public class CiftBagliListe {

    private Node head; // head veriyi tutan referans
    private Node tail; // tail veriyi tutan referans
    private Integer count;

    public CiftBagliListe() // Liste yapılandırıcısı
    {
        head = null;
        tail = null;
        count = 0;
    }

    public boolean bosMu() // Liste doluluk kontrolü
    {
        return head == null;
    }

    public int getCount() {
        return count;
    }

    public void basaEkle(Bilgi kişi) // Listenin başına ekleme fonksiyonu
    {
        Node yeniDugum = new Node(kişi, null, head); // yeni düğüm oluşturuluyor
        if (bosMu()) // Listenin boşluk kontrolü
        {
            tail = yeniDugum;
        } else {
            head.previous = yeniDugum;
            yeniDugum.next = head; // Eski head ile yer değişiyor
        }
        head = yeniDugum;
    }
    public void ortayaEkle(Bilgi kişi, Node aktif) {

        Node prevaktif = aktif.previous;
        Node yeniDugum = new Node(kişi, aktif.previous, aktif);
        prevaktif.next = yeniDugum;
        aktif.previous = yeniDugum;

    }

    public void sonaEkle(Bilgi kişi) // Listenin sonuna ekleme fonksiyonu
    {
        Node yeniDugum = new Node(kişi, tail, null); // yeni düğüm oluşturuyoruz.

        tail.next = yeniDugum; // tail ile yeni düğüm yer değişiyor.
        yeniDugum.previous = tail;
        tail = yeniDugum;
    }
    public void ekle(Bilgi yeniİnsan) {
        Node aktif = head;

        Integer sayac = 0;

        if (bosMu()) {
            basaEkle(yeniİnsan); // liste boşsa
            count++;

        } else {
            while (aktif != null && aktif.kişi.getAdSoyad().compareTo(yeniİnsan.getAdSoyad()) < 0) // Eşleşme bulunana kadar
            {
                aktif = aktif.next; // her seferinde döngü döndürüyoruz
                sayac++;
            }
            if (sayac == getCount()) {
                System.out.println("1. if " + yeniİnsan.getAdSoyad());
                sonaEkle(yeniİnsan);
            } else if (sayac == 0) {
                System.out.println("2. if " + yeniİnsan.getAdSoyad());
                basaEkle(yeniİnsan);
            } else {
                System.out.println("3. if " + yeniİnsan.getAdSoyad());
                ortayaEkle(yeniİnsan, aktif);
            }
                count++;
        }
    }

    public void sil(String silinecek) // Seçili sıradaki elemanı silmek için kullanılan fonksiyon
    {

        if (bosMu()) {
            return;
        }
        Node aktif = head;
        count--;
        while (aktif != null && !aktif.kişi.getAdSoyad().equals(silinecek)) // Eşleşme bulana kadar
        {
            aktif = aktif.next;
            // Döngü sürekli bir sonrakine aktarılıyor
            if (aktif == null) {
                aktif=tail;
                break;
            }
        }
        if (aktif == head) {
            if(count==1){
                tail=null;
                head=null;

            }else{
                head.next.previous = null;
                head = head.next;
            }
        } else if (aktif == tail) {
            tail.previous.next = null;
            tail = tail.previous;
        } else {
            aktif.previous.next = aktif.next;
            aktif.next.previous = aktif.previous;
        }

    }

    public String alfabetik() {
        Node temp = head;

        String isimler = " ";

        while (temp != null) {

            isimler = isimler + temp.kişi.getAdSoyad() + "\n";

            temp = temp.next;

        }
        return isimler;
    }
    public String tersAlfabetik() {
        Node temp = tail;
        String tersisimler = " ";
        while (temp != null) {
            tersisimler = tersisimler + temp.kişi.getAdSoyad() + "\n";
            temp = temp.previous;
        }
        return tersisimler;
    }

    public String Bul(String adsoyad) {
        Node temp = head;
        while (temp != null) {
            if (adsoyad.equals(temp.kişi.getAdSoyad())) {
                return temp.toStringNumbers();
            }
            temp = temp.next;
        }
        return null;
    }
    public boolean adBul(String adsoyad) {
        Node temp = head;
        while (temp != null) {
            if (adsoyad.equals(temp.kişi.getAdSoyad())) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public String toStringg() {
        Node temp = head;
        String isimler = " ";
        while (temp != null) {
            isimler = isimler + temp.kişi.getAdSoyad() + "  " + temp.kişi.getNumaralar() + "\n";
            temp = temp.next;
        }
        return isimler;
    }
}