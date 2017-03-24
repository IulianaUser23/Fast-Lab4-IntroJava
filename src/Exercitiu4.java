/**
 * Created by User on 24.03.2017.
 */
// se citesc 3 numere, sa se afiseze cel mai mic
public class Exercitiu4 {
    public static void main(String[] args) {
    int a, b, c;
        a=SkeletonJava.readIntConsole("Introduceti primul numar:");
        b=SkeletonJava.readIntConsole("Introduceti al doilea numar:");
        c=SkeletonJava.readIntConsole("Introduceti al treilea numar:");
        if (a<b){
            SkeletonJava.printConsole("numarul" + a + "este mai mare");
        }
    }
}
