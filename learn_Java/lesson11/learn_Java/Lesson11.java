package learn_Java;

public class Lesson11 {
	
	void useBroom(Broom broom){
		broom.driving();
		System.out.println(broom.getNumOfSeats());
	}
	
	public static void main(String[] args) {
		
		Lesson11 lesson = new Lesson11();
		Broom broom = new Nissan();
		lesson.useBroom(broom);
	}

}
