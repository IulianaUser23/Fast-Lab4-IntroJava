/**
 * Created by User on 24.03.2017.
 */
//un convertor de la lbs la kg (atentie la numere cu virgula, trebuie sa le puneti de tip double)
public class Exercitiu7 {
    public static void main(String[] args) {
     double a;
     a = SkeletonJava.readIntConsole("Introduceti Pounds:");
     double b = a * 0.4536;
     SkeletonJava.printConsole( a + "Lbs = " + b + "Kg");
    }
}
