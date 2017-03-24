/**
 * Created by Iuliana on 24.03.2017.
 */
//- se citeste un numar. sa se afiseze luna corespunzatoare acelui numar sau mesajul “eroare” daca numarul nu este intre 1 si 12
public class Exercitiu5 {
    public static void main(String[] args) {
        int a;
        a=SkeletonJava.readIntConsole("Introduceti un numar de la 1 la 12");
        switch (a) {
            case 1: System.out.println("Ianuarie"); break;
            case 2: System.out.println("Februarie"); break;
            case 3: System.out.println("Martie"); break;
            case 4: System.out.println("Aprilie"); break;
            case 5: System.out.println("Mai"); break;
            case 6: System.out.println("Iunie"); break;
            case 7: System.out.println("Iulie"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("Septembrie"); break;
            case 10: System.out.println("Octombrie"); break;
            case 11:System.out.println("Noiembrie"); break;
            case 12: System.out.println("Decembrie"); break;
            default: System.out.println("EROARE, numar de luna invalid"); break;
        }
    }
}
