public class Person {

	private String myName; 
	private int myAge;

	public Person (String imyName,  int imyAge ){
		myName = imyName; 
		myAge  = imyAge; 
	}; 

	public void showMyName (){
		System.out.println (this.myName);
	}; 
    
	public void showMyAge() {
		System.out.println (this.myAge);
	}; 
	
	public String getName(){
		return myName; 
	}; 

	public void tellMyHoby(){}; 

	public void singSong(){
		System.out.println("Person's song");
	}

}