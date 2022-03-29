package Main;

import java.util.function.Function;

/**
 *
 * @author jp
 */
public class Main {

    public static void main(String[] args) {
        System.getProperties().forEach((t, u) -> System.out.println(t + " = " + u));
    }

}
