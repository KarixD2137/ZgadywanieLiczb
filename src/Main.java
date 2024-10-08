/*
git init
git config --local user.name "KarixD2137"
git config --local user.email "karol.kopczynski7@gmail.com"
git add .
git commit -m "pusty projekt"
git log
git remote add origin https://github.com/KarixD2137/ZgadywanieLiczb.git
git push -u origin master
*/

import java.util.Scanner;

public class Main {
    // Nazwa pliku i nazwa klasy muszą być takie same
    // Nazwa klas powinny być z wielkiej litery
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Witam serdecznie!");

        // Typ prosty - tylko wartość, pisany z małej litery
        // boolean
        // byte, short, int, long
        // float, double
        // char
        // Typ złożony - objekt zawierający własności i metody, pisany z dużej litery

        int wylosowanaLiczba = (int)(Math.random()*100+1); //rzutowanie

        System.out.println(wylosowanaLiczba);

        System.out.println("Zgadnij liczbę");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();

        if(wpisanaLiczba == wylosowanaLiczba){
            System.out.println("Wygrałeś");
        }
        else{
            System.out.println("Nie udało ci się");
        }
        // Wyrażenie warunkowa (taka jakby skrócona instrukcja warunkowa, która tworzy  )
        // warunek? jeżeli tak : jeżeli nie
        // Instrukcja - nie zwraca wartości
        // Wyrażenie - zwraca wartość
        int roznica = wylosowanaLiczba>wpisanaLiczba? wylosowanaLiczba-wpisanaLiczba : wpisanaLiczba-wylosowanaLiczba;
        roznica = roznica/10; // dzielenie
        switch (roznica)
        {
            case 0:
                System.out.println("Dobra robota!");
                break;
            case 1:
                System.out.println("Bardzo blisko!");
                break;
            case 2:
                System.out.println("Blisko");
                break;
            case 3:
                System.out.println("Niedaleko");
                break;
            default:
                System.out.println("Słabo");
                break;
        }
        System.out.println(switch (roznica){
            case 0 -> "Bardzo blisko";
            case 1 -> "Blisko";
            case 2 -> "niedaleko";
            default -> "słabo";
        });
        // Zgadujemy 10 razy
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę");
            wpisanaLiczba = klawiatura.nextInt();
            if(wpisanaLiczba == wylosowanaLiczba){
                System.out.println("Gratulacje, udało ci się zgadnąć liczbę!");
                break;
            }
        }
        // Zgadujemy do skutku

        do
        {
            System.out.println("Podaj liczbę");
            wpisanaLiczba = klawiatura.nextInt();
            if (wylosowanaLiczba>wpisanaLiczba)
            {
                System.out.println("Poszukiwana liczba jest większa");
            }
            else if (wylosowanaLiczba<wpisanaLiczba)
            {
                System.out.println("Poszukiwana liczba jest mniejsza");
            }
        }
        while (wylosowanaLiczba != wpisanaLiczba);
        System.out.println("Gratulacje, udało ci się zgadnąć liczbę!");
    }
}