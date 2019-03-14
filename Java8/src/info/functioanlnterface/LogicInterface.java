package info.functioanlnterface;

interface A{
	 default void show()
	{
		System.out.println("A Interface");
	}
}

interface B {
	default void show()
	{
		System.out.println("B Interface");
	}
}

public class LogicInterface implements B, A {
	public void show()
	{
		System.out.println("LogicInterface");
	}

	public static void main(String[] args) {
		LogicInterface li=new LogicInterface();
		li.show();

	}

	

}
