/**
 * Created by Iuliana on 31.03.2017.
 */
//Sa se calculeze factorialul unui numar a. factorialul este definit asa: factorial  = 1*2*3*4….*a

public class TemaFactorial {
    public static void main(String[] args) {
int a,fact;
a = SkeletonJava.readIntConsole("Introduceti numarul:");
fact=1;
if (a==0) System.out.println("Numarul nu poate fi 0");
for (int i=1; i<=a; i++){
fact = i*fact;
System.out.println("Factorialul este:"+fact);}
    }
}
