
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Monitor monitor1  = new Monitor(10,20);
        Monitor monitor2  = new Monitor(20,40);
        Monitor monitor3  = new Monitor(50,60);

        ArrayList<Monitor> monitores = new ArrayList<>();

        monitores.add(monitor1);
        monitores.add(monitor2);
        monitores.add(monitor3);

        Iterator i = monitores.iterator();

        while(i.hasNext()){
            Object monitor = i.next();

            System.out.println(monitor);
        }

    }
}
