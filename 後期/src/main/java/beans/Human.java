package beans;
import java.io.Serializable;
public class Human implements Serializable {
	private String name;
	private int age;
	//コンストラクタ
	public Human() {}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//getter
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public int getAge() {
		return age;
	}
	//setter
	public void setAge(int age) {
		this.age = age;
	}
}