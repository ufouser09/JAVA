package generics;

class Test<T, U> {
	T obj1;
    U obj2;
    
    Test(T obj1, U obj2) { 
        this.obj1 = obj1; 
        this.obj2 = obj2; 
    } 
    
    public void print() { 
        System.out.println(obj1 + "\t" + obj2);
    } 
} 
    
public class Ornek1 {

	public static void main(String[] args) {
		Test <String, Integer> t1 = new Test<String, Integer>("NYP", 2020); 
		t1.print(); 
		Test <Character, Character> t2 = new Test<Character, Character>('3', 'B'); 
		t2.print();
	}

}