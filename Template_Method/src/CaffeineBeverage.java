/**
 * Created with IntelliJ IDEA.
 * Date: 28.06.13
 *
 * @author: mkalachyov
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
