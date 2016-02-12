public class Dependent {
	public static void main(String[] a) {
		Core core = new Core();
		Generated generated = new Generated();
		System.out.println(core.getNumber() + generated.getNumber());
	}
}