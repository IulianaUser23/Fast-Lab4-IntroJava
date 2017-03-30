/**
 * Created by Iuliana on 31.03.2017.
 */
//Se dau doua numere a si n. sa se afiseze numarul a la puterea n

public class TemaAlaN {
    public static void main(String[] args) {
        int a, n;
        a= SkeletonJava.readIntConsole("Numarul este:");
        n= SkeletonJava.readIntConsole("Numarul se ridica la puterea:");
        int Putere = a;
        if (n==0) {System.out.println(" Numarul ridicat la puterea 0 este 1");}
        for (int i=1; i<=n-1; i++)
            {Putere *=a; }
            System.out.println("rezultatul este:" + Putere);
    }
}
