package test;

import java.io.Serializable;

public class SingtonExample implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8775341310544984700L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private static SingtonExample instance = null;
	
	private SingtonExample () {};
	
	public static SingtonExample getInstance() {
		if (instance == null) {
			synchronized (SingtonExample.class) {
				if (instance == null) {
					instance = new SingtonExample();
				}
			}
		}
		return instance;
	}
	
	private Object readResolve() {
		return getInstance();
	}
}
