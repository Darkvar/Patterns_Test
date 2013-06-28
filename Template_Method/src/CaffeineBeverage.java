/**
 * Created with IntelliJ IDEA.
 * Date: 28.06.13
 *
 * @author: mkalachyov
 */
public abstract class CaffeineBeverage {

    abstract void prepareRecipe();
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
