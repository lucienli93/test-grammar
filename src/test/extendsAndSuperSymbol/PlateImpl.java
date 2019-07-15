package test.extendsAndSuperSymbol;

public class PlateImpl<T> implements Plate<T> {
    private T value;
    
    public PlateImpl(T t) {
        this.value = t;
    }
    
    @Override
    public T get() {
        return value;
    }

    @Override
    public void put(T t) {
        this.value = t;
    }
}
