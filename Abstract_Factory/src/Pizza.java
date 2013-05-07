import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Date: 05.05.13
 *
 * @author: mkalachyov
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

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

    void setName(String name){
        this.name = name;
    }

}
