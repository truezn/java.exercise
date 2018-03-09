public class Girl extends Person{

    public  Girl(String iMyName,int iMyAge) {
        super(iMyName,iMyAge);  
    };
    // this is override 
    public void showMyName(){
        System.out.println("My name is" + " " + super.getName());
    };
    // this is overload
	public void showMyName(String myNewName) {
        System.out.println(myNewName);
    }

    public void tellMyHoby(){
        System.out.println("I like dress up");
    }; 

    public void singSong(){
        System.out.println("Girl's song");
    }
}