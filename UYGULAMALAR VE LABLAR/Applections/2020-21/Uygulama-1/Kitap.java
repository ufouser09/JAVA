
public class Kitap {
	
	private String ad;
	private String yazar;
	private final String ISBN;  //final olması demek; nesne ilk oluştuğunda aldığı değeri hep koruyacak, değiştiremeyeceğiz.
	private static int kitapSayisi; //static değişken, nesnelere göre farklı değer almıyor. 
	
	public Kitap(String ad, String yazar, String isbn){
		this.ad= ad;
		this.yazar=yazar;
		ISBN=isbn;
		kitapSayisi++;
		
	}
	
	
	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public static int getKitapSayisi() {
		return kitapSayisi;
	}

	public static void setKitapSayisi(int kitapSayisi) {
		Kitap.kitapSayisi = kitapSayisi;
	}

	public String getISBN() {
		return ISBN;
	}



	@Override
	public String toString() {
		return "Kitap [ad=" + ad + ", yazar=" + yazar + ", ISBN=" + ISBN + "]";
	}

	
	
	
	
	
	
	
	

}
