package execepotiontopic;

public class Sample2 {
	public static void main(String[] args) {
		System.out.println("*********ms********");
		try{
			int i =1/0;
		}
		catch ( ArithmeticException e)
		{
			System.out.println("****handeled******* ");
		}
		System.out.println("*********me*******");
		
	}

}
