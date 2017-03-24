/**
 * Created by Iuliana on 24.03.2017.
 */
//se citeste inaltimea, greutatea si gender-ul uneri persoane. sa se calculeze indicele de masa corporala (BMI)
// pentru acea persoana si in ftie de valoare sa se spuna daca acea persoana e obeza, normala, schija sau altele
    //BMI = (greutate / (inaltime x inaltime in Meters))
public class Exercitiu12 {
    public static void main(String[] args) {
double inaltime, greutate, sex;
inaltime = SkeletonJava.readIntConsole("Introduceti inaltimea in cm:");
greutate = SkeletonJava.readIntConsole("Introduceti greutatea in kg:");
sex = SkeletonJava.readIntConsole("Introduceti sexul (F=0) sau (M=1):");
       double bMI = (greutate *10000 / (inaltime * inaltime));
       System.out.println("indicele de masa corporala BMI este:" + bMI);
       System.out.println ("Valori ale bMI");
       System.out.println ("Subnutrit: mai putin de 18.5");
       System.out.println ("Normal: intre 18.5 si 24.9");
       System.out.println ("Supraponderat:  intre 25 si 29.9");
       System.out.println ("Obez: 30 sau mai mare");
           }
}
