public class App {
	public static void main(String []args){
       Person a = new Person("Ning",35); 
       a.showMyName(); 
       a.showMyAge(); 
       Boy b = new Boy("Peter",2);
       b.showMyName();
       b.showMyAge();
       b.tellMyHoby();
       Girl c = new Girl("Nancy",3); 
       c.showMyName();
       c.showMyAge();
       c.showMyName("Lisa");
       c.tellMyHoby();
       c.singSong(); 
    // 虚方法
       Person d = new Girl("Malia",10);
       d.singSong(); 

	}
    
}
