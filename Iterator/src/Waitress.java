import java.util.Iterator;
/**
 * Created with IntelliJ IDEA.
 * Date: 03.07.13
 *
 * @author: mkalachyov
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegeterianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try {
                if (menuComponent.isVegeterian()){
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e){}
        }
    }
}
