package typecasting;



	class Animal {
		  @Override
		  public String toString() {
		    return "This is an Animal"; 
		  }
		  
		  public String myMethod() {
			    return "running Animal's method."; 
		  }
		}

	class Cow extends Animal {
		   @Override
		   public String toString() {
		     return "This is a Cow"; 
		  }
		   public String myMethod() {
			    return "running Cow's method."; 
		  }
		}

	public class ObjectCasting {
	    public static void main(String args[]) {
	    	
	    	Cow daisy = new Cow();
		    System.out.println( daisy); 
		    System.out.println(daisy.myMethod());
		    
	    	Animal anim = new Animal();
	    	System.out.println(anim);
	    	System.out.println(anim.myMethod());
		    
	    	//Upcasting : child to parent
		    anim = (Animal) daisy;  //parantezde Animal yazmam şart değil.
		    System.out.println(anim); // prints: This is a Cow
		    System.out.println(anim.myMethod()); //running Cow's method.
		    
			
		    
		    //Downcasting : parent to child
		    Animal an1 = new Cow(); 
		    Cow c =  (Cow) an1;  
		    System.out.println(an1); 
		    System.out.println(c); 
		   
		    
		    
		   
		   
		    
		  }
		}
	


