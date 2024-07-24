
public class Raf {
	
	private Kitap [] kitaplar ;
	
	public Raf(){
		
		kitaplar = new Kitap[10];
	}
	
	public Kitap[] getKitaplar() {
		return kitaplar;
	}

	

	public void kitapEkle(Kitap ktp) {
		for(int i=0; i<kitaplar.length;i++)
			if(kitaplar[i]==null){
				kitaplar[i]=ktp;
				break;
			}
		
	}

	public void rafGoster() {
//		for(int i=0;i<kitaplar.length;i++)
//			System.out.println(kitaplar[i]);
		
		for(Kitap iter:kitaplar)
			System.out.println(iter);
		
		
		
	}

	public void kitapSil(Kitap ktp) {
		for(int i=0; i<kitaplar.length;i++)
			if(kitaplar[i]==ktp){
				kitaplar[i]=null;
				break;
			}
		
	}

}
