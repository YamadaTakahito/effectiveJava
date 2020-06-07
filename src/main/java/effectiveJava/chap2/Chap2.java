package effectiveJava.chap2;

import effectiveJava.chap2.item2.NyPizza;
import effectiveJava.chap2.item2.NyPizza.Size;

public class Chap2 {
    public static void main() {
        NyPizza nyPizza = new NyPizza.Builder(Size.SMALL).build();
    }
}
