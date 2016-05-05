public class HelloJava{

	public static void main(String[] args){
		System.out.println("Hello Java!");
		FibonGenerator fg = new FibonGenerator();
		System.out.println(fg.number(3));
		System.out.println(fg.number(6));
		System.out.println(fg.number(10));
	}
}