/**
 * Created with IntelliJ IDEA.
 * Date: 28.04.13
 *
 * @author: mkalachyov
 */
public class Cofee {
    public static void main(String[] args){
        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + " " + houseBlend.cost() + "$");

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Milk(darkRoast);
        darkRoast = new Whip(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " " + darkRoast.cost() + "$");
    }
}
