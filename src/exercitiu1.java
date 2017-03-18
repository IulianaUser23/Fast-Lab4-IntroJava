import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by User on 18.03.2017.
 */
public class exercitiu1 {
    public static void main(String[] args) {
        int numar;
        numar=SkeletonJava.readIntGUI("introduceti un numar:");

        if (numar>=0) {
            //voi calcula si afisa patratul sau}
            int patrat = numar*numar;
            SkeletonJava.printConsole("aici este numarul:"+patrat);
        }
            else {
                //voi afisa numarul asa cum l-am citit
                SkeletonJava.printConsole("aici este numarul:"+numar);
            }

    }
    }
