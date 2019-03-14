package info.functioanlnterface;
interface surendra
{
     default void show() {
	  System.out.println("surendra alaparthi");
  }
	public String address();
}
public class Interface implements surendra{

	public static void main(String[] args) {
		
		Interface i=new Interface();
		i.show();
		System.out.println(i.address());
	}

	
	public String address() {
		return "marathahali";
	}

}
