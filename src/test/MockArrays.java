package test;

import java.util.AbstractList;
import java.util.Objects;

public class MockArrays <E> extends AbstractList<E>{
    private final E[] a;
	public MockArrays (E[] array) {
		a = Objects.requireNonNull(array);
	}
	
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
    @Override
    public Object[] toArray() {
        return a.clone();
    }
}
