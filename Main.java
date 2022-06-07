import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Prędkość w m/s");
    Scanner pobierz = new Scanner(System.in);
    int a,b;
      a = pobierz.nextInt();
    System.out.println("Druga liczba");
      b = 1000;
          System.out.println("Wybierz :\n 1 - Przelicznik");
    int wybierz;
    wybierz = pobierz.nextInt();
    switch (wybierz){
      case 1:
        System.out.println(przelicz(a,b));
        break;
    }
    }
   public static double przelicz(double x, double y)
      {
        System.out.println("Prędkość w km/h");
        double wynik =x / y;
        return wynik;
      }  
}