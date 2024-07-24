
public class Test {
	
	public static void main(String[] args) {
		
		Kitap kitap1 = new Kitap("Vadideki Zambak", "H. Balzac", "1234");
		Kitap kitap2 = new Kitap("Sefiller","Victor Hugo","7345");
		Kitap kitap3 = new Kitap("Savaş ve Barış","Tolstoy","5345");
		
		
		System.out.println(kitap1.getYazar());
		System.out.println(kitap1);
		System.out.println(" ---------------------- ");
		Kitaplık kitaplık = new Kitaplık(5);
		kitaplık.kitapEkle(kitap1, 0);
		kitaplık.kitapEkle(kitap2, 0);
		kitaplık.kitapEkle(kitap3, 0);
		kitaplık.rafGoster(0);
		System.out.println(" ---------------------- ");
		kitaplık.kitapSil(0,kitap1);
		kitaplık.rafGoster(0);
		System.out.println(" ---------------------- ");
		kitaplık.kitapAra("Kitap2");
		kitaplık.kitapSil(0,kitap2);
		kitaplık.kitapAra("Kitap2");
		System.out.println(" ---------------------- ");
		System.out.println(Kitap.getKitapSayisi());  //static değişkenler ve metotlara erişmek için nesne tanımlamamıza gerek yok. Sınıf adını belirtmemiz yeterli. 
		System.out.println(" ---------------------- ");
		kitaplık.tumRaflariGoster();
		System.out.println(" ---------------------- ");
		kitap3.setAd("Suç ve Ceza");
		System.out.println(kitap3);
	}

}
