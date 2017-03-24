/**
 * Created by Iuliana on 24.03.2017.
 */
// Temperatura din Farenheit in Celsius
public class Exercitiu6 {
    public static void main(String[] args) {
      int a;
      a = SkeletonJava.readIntConsole("Introduceti temperatura in grade Farenheit:");
      int b = (a-32)*5/9;
      SkeletonJava.printConsole(a + "gr.F" +"egal" + b + "gr.C");
    }
}
