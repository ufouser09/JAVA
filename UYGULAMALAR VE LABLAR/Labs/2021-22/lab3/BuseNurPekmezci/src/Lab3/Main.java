package Lab3;


public class Main {

	public static void main(String[] args) {
		Ders ders = new Ders("A dersi");
		ders.dosyaOku("ogrenci.ser");
		ders.hesapla();
		ders.ekranaYazdir();
	}

}
