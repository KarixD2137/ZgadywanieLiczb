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

public class Main {
    // Nazwa pliku i nazwa klasy muszą być takie same
    // Nazwa klas powinny być z wielkiej litery
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Witam serdecznie!");

        // Typ prosty - tylko wartość, pisany z małej litery
        // Typ złożony - objekt zawierający własności i metody, pisany z dużej litery

        double wylosowanaLiczba = Math.random()*10+1;
        System.out.println(wylosowanaLiczba);
    }
}