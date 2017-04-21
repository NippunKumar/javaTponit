package tutorial;

class TestOuter1 {
	static int data = 30;

	static class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	static class TestOuter1$Inner {
		TestOuter1$Inner() {
		}

		void msg() {
			System.out.println((new StringBuilder()).append("data is ").append(TestOuter1.data=29).toString());
		}

		public static void main(String args[]) {
			System.out.println("old data is " +data);
			TestOuter1$Inner obj = new TestOuter1$Inner();
			obj.msg();
			final byte age1 = 10;
			final byte age2 = 20;
			short sum = age1 + age2;
			double  x=   10.0;
			double y =  6.0;
			double z = x/y;
			System.out.println(z);
			
			String day = "SUN";
			switch (day) {
			case "MON":
			case "TUE":
			case "WED":
			case "THU": System.out.println("Time to work");
			break;
			case "FRI": System.out.println("Nearing weekend");
			break;
			case "SAT":
			case "SUN": System.out.println("Weekend!");
			break;
			default: System.out.println("Invalid day?");
			int a=10, b=20, c=30;
			switch (a) {
			case b+c: System.out.println(b+c); break;
			case 10*7: System.out.println(10*7512+10); break;
			final int a =10;
			final int b =20;
			final int c =30;
			switch (a) {
			case b+c:System.out.println(b+c); break;
			}
			}
		}
	}
}