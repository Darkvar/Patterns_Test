/**
 * Created with IntelliJ IDEA.
 * Date: 03.07.13
 *
 * @author: mkalachyov
 */
public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items){
        this.items = items;
    }
    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
