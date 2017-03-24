/**
 * Created by Iuliana on 24.03.2017.
 */
// se citesc 2 numere - sa se afiseze cel mai mare;
public class Exercitiu4 {
    public static void main(String[] args) {
        int a;
        a=SkeletonJava.readIntConsole("Introduceti primul numar:");
        int b;
        b=SkeletonJava.readIntConsole("Introduceti al doilea numar:");

        if (a==b) {SkeletonJava.printConsole("numerele sunt egale");}
        else if (a>b) { SkeletonJava.printConsole("numarul" + a + "este mai mare");
        }
        else {
            SkeletonJava.printConsole("numarul" + b + "este mai mare");}
    }
}
