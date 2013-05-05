import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Date: 05.05.13
 *
 * @author: mkalachyov
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.print("Adding toppings: ");
        for (String topping: toppings){
            System.out.println(topping);
        }
    }

    void bake(){
        System.out.println("Bake 25 min at 350");
    }

    void cut(){
        System.out.println("Cutting pizza at diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in a box");
    }

    public String getName(){
        return name;
    }
}
