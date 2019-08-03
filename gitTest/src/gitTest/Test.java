package gitTest;

public class Test implements GN {
	public static void main(String[] args) {
		System.out.println(new Test().getNumber());
	}

	@Override
	public int getNumber() {
		return 900;
	}
}
