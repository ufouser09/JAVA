
public class Kitaplık {
	
	private Raf[] raf;

	public Kitaplık(int n) {
		this.raf = new Raf[n];
		for(int i=0;i<n; i++){
			raf[i]=new Raf();
		}
		
	}
	
	public void kitapEkle(Kitap ktp, int rafNo){
		raf[rafNo].kitapEkle(ktp);
		
		
	}

	public void rafGoster(int rafNo) {
		
		raf[rafNo].rafGoster();
	}

	public void kitapSil(int rafNo, Kitap ktp) {
		raf[rafNo].kitapSil(ktp);
		
	}

	public Kitap kitapAra(String str) {
		for(int i=0; i<raf.length;i++)
			for(Kitap iter:raf[i].getKitaplar())
				if(iter!=null)
					if(iter.getAd().compareTo(str)==0){
						System.out.printf("aranan kitap %d. rafta bulunuyor.\n", i);
						return iter;
					}
		
		System.out.println("aranan kitap bulunamadı");
		return null;
		
		
	}

	public void tumRaflariGoster() {
		for(int i=0; i<raf.length;i++){
			System.out.println(i + ". Raftaki Kitaplar:");
			rafGoster(i);
		}
		
	}
	
	
	
	
	
	
	

}
