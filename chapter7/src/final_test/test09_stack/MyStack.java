package final_test.test08_stack;

import java.util.Vector;

public class MyStack<T> implements IStack<T>{
	Vector<T> v = new Vector<T>();
	private int pp = v.size();
	
	@Override
	public T pop() {
		if (v.size() == 0) 
			return null;
		
		T t = v.get(v.size()-1);
		v.remove(v.size()-1);
		return t;
	}

	@Override
	public boolean push(T pop) {
		v.add(pop);
		return true;
	}
}
