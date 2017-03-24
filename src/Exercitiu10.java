/**
 * Created by User on 24.03.2017.
 */
//se citeste un numar. sa se afiseze tabla inmultirii de la 0 la 10 cu acel numar (am facut in clasa)
public class Exercitiu10 {
    public static void main(String[] args) {
    int a;
    a = SkeletonJava.readIntConsole("Introduceti numarul:");
    for (int i=0; i<=10; i++)
        SkeletonJava.printConsole( i + "X" + a + "=" + i * a);
    }
}
