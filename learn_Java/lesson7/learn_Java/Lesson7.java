package learn_Java;

public class Lesson7 {
	
	private int age;
	
	public void setAge(int age){
		this.age = age;
	}
	
	int getAge(){
	  return this.age;
	}	
	
	
	public static void main(String[] args){
		Lesson7 param = new Lesson7();
		System.out.println(param.getAge());
	}
}

