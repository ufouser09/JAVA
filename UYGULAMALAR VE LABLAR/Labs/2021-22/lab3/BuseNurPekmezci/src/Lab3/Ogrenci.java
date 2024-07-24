package Lab3;

import java.io.Serializable;

public class Ogrenci implements Serializable{
	private static final long serialVersionUID = 1L;
	private String ogrenciAdi;
	private String ogrenciNo;
	private int vize;
	private int final_;
	private double genelNot;
	
	public Ogrenci(String ogrenciAdi, String ogrenciNo, int vize, int final_) {
		this.ogrenciAdi = ogrenciAdi;
		this.ogrenciNo = ogrenciNo;
		this.vize = vize;
		this.final_ = final_;
		this.genelNot = 0;
	}

	public String getOgrenciAdi() {
		return ogrenciAdi;
	}

	public String getOgrenciNo() {
		return ogrenciNo;
	}

	public int getVize() {
		return vize;
	}

	public int getFinal() {
		return final_;
	}

	public double getGenelNot() {
		return genelNot;
	}
	
	public void genelNotHesapla() {
		genelNot = getVize()*0.4 + getFinal()*0.6;
	}
	
	public String toString() {
		String info;
		info = getOgrenciNo()+" numarali "+getOgrenciAdi()+" adindaki ogrencinin genel notu= "+getGenelNot()+"'dur";
		return info;
	}
	
} 
