package tutorial;

public class Manager implements Interviewer {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.submitInterviewStatus();
		
	}
	public String submitInterviewStatus() {
		System.out.println("Accept");
		return null;
	}

}
