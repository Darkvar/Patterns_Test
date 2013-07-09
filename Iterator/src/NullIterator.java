import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Date: 06.07.13
 *
 * @author: mkalachyov
 */
public class NullIterator implements Iterator {

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
