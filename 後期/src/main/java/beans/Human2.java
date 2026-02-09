package beans;

import java.io.Serializable;

public class Human2 implements Serializable {
	private String name;
	private int age;

	public Human2() {
	}

	public Human2(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
