package Lab3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

public class Ders {
	private String dersAdi;
	private LinkedList<Ogrenci> ogrenciler;
	private int subeASayisi;
	private int subeBSayisi;
	private int ogrenciSayisi;
	
	public Ders(String dersAdi) {
		this.dersAdi = dersAdi;
		ogrenciler = new LinkedList<>();
		subeASayisi = subeBSayisi = ogrenciSayisi = 0;
	}

	public String getDersAdi() {
		return dersAdi;
	}

	public LinkedList<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}
	
	@SuppressWarnings("unchecked")
	public void dosyaOku(String dosyaAdi) {
		try {
			FileInputStream fileIn = new FileInputStream(dosyaAdi);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			ogrenciler = (LinkedList<Ogrenci>) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("Ogrenci class not found");
			c.printStackTrace();
		}
	}
	
	public void gruplaraAyir() {
		ogrenciSayisi = getOgrenciler().size();
		subeASayisi = 0;
		subeBSayisi = ogrenciSayisi/2;
	}
	
	public void hesapla() {
		gruplaraAyir();
		
		Hesapla subeA = new Hesapla(subeASayisi);
		Hesapla subeB = new Hesapla(subeBSayisi);
		
		Thread th1 = new Thread(subeA);
		Thread th2 = new Thread(subeB);
		th1.start();
		th2.start();
	}
	
	public void ekranaYazdir() {
		for(Ogrenci o: ogrenciler) {
			System.out.println(o);
		}
	}
	
	class Hesapla implements Runnable{
		private int subeSayisi;
		
		public Hesapla(int subeSayisi) {
			this.subeSayisi = subeSayisi;
		}
		
		public void hesapla() {
			for(int i=0;i<ogrenciSayisi/2;i++) {
				ogrenciler.get(subeSayisi).genelNotHesapla();
				subeSayisi++;
			}
		}
		
		@Override
		public void run() {
			hesapla();
		}
	}
	
}
