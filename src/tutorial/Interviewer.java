package tutorial;

public interface Interviewer {
	default Object submitInterviewStatus() {
		System.out.println("Accept");
		return null;
	}
}
