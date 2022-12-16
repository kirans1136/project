package execepotiontopic;

public class Sample1 {
	public static void main(String[] args) {
		System.out.println("*****main strats*****");
		int []arr={10,20,30,40};
		try{
			System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("*******cought");
		}
		

	System.out.println("*****main ends*****");

	}	
}
