/**
 * Created by Iuliana on 24.03.2017.
 */
// se citesc 3 numere, sa se afiseze cel mai mic
public class Exercitiu3 {
    public static void main(String[] args) {
        int a, b, c;
        a = SkeletonJava.readIntConsole("Introduceti primul numar:");
        b = SkeletonJava.readIntConsole("Introduceti al doilea numar:");
        c = SkeletonJava.readIntConsole("Introduceti al treilea numar:");
        if (a<b) {
            if (a<c) {SkeletonJava.printConsole("Numarul" +a + "este cel mai mic");}
            else SkeletonJava.printConsole("Numarul" + c + "este cel mai mic");
        }
        else {
            if (b<c) {SkeletonJava.printConsole("Numarul" + b + "este cel mai mic");}
                else SkeletonJava.printConsole("Numarul" + c + "este cel mai mic");
            }
        }
    }
