/**
 * Created with IntelliJ IDEA.
 * Date: 28.06.13
 *
 * @author: mkalachyov
 */
public class Tea {
    public void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    private void pourInCup() {
        System.out.println("Adding Lemon");
    }

    private void addLemon() {
        System.out.println("Pouring into cup");
    }
}
