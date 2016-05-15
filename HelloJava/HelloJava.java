public class HelloJava{

	public static void main(String[] args){
		System.out.println("Hello Java!");
		FibonGenerator fg = new FibonGenerator();
		System.out.println(fg.number(3));
		System.out.println(fg.number(6));
		System.out.println(fg.number(10));

		PrimeGenerator pg = new PrimeGenerator();
		System.out.println(pg.prime(1));
		System.out.println(pg.prime(10));
		System.out.println(pg.prime(100));
	}
}