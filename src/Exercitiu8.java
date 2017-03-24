/**
 * Created by User on 24.03.2017.
 */
// sunt date doua numere - sa se calculeze media lor
public class Exercitiu8 {
    public static void main(String[] args) {
        int a,b,c;
        a = SkeletonJava.readIntConsole("Introduceti primult numar:");
        b = SkeletonJava.readIntConsole("Introduceti al doilea numar");
        c = (a+b)/2;
        SkeletonJava.printConsole("Media celor doua numere este:" + c);
    }
}
