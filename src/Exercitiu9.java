/**
 * Created by User on 24.03.2017.
 */
//se citeste un numar gen 1980. sa verificati daca este un an bisect .
//Un an este bisect dacă este divizibil cu 4, exceptând cazurile când este divizibil cu 100 fără a fi divizibil cu 400.
public class Exercitiu9 {
    public static void main(String[] args) {
        int An;
        An = SkeletonJava.readIntConsole("Introduceti anul:");
      if (An %4 ==0 && An %100 !=0 || An %400 ==0) {
          SkeletonJava.printConsole( An + "este an bisect");
      } else {SkeletonJava.printConsole( An + "este an normal");}
    }
}
