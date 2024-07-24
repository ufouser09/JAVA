package typecasting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		// byte -> short -> char -> int -> long -> float -> double
		
		//wadening casting - automatic
		int x = 5;
		double y = x;
		System.out.println(x);  
		System.out.println(y);
		
		
		char c = 'A';
		int c_i = c;
		System.out.println(c_i); //ascii tablosundan dönüşüm yapıyor.
		
		
		//narrowing casting - manual 
		double a = 7.8;
		int b = (int)a;
		System.out.println(b);
		
		
		// String dönüşümlerinde parse kullanırız.
		String yas = "80";
		//double yas_d = (double)yas;  bu ifade hatalıdır.
		double yas_d = Double.parseDouble(yas);
		System.out.println(yas_d);
		int yas_i = Integer.parseInt(yas); 
		System.out.println(yas_i);
		
	

		}
	
	
	
}
