/**
 * Created with IntelliJ IDEA.
 * Date: 29.06.13
 *
 * @author: mkalachyov
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareReceipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
    boolean customerWantsCondiments(){
        return true;
    }
}
