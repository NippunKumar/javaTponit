package tutorial;

import java.util.ArrayList;

class Office {

}

interface Interviewer {
	default Object submitInterviewStatus() {
		System.out.println("Accept");
		return null;
	}
}

class Manager implements Interviewer {
	public String submitInterviewStatus() {
		System.out.println("Accept");
		return null;
	}
}