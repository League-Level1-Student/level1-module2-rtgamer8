
public class TeaMakerRunner {
	public static void main(String[] args) {
		TeaMaker tea = new TeaMaker();
		TeaBag bag = new TeaBag("mint");
		Kettle kettle = new Kettle();
		Cup cup =new Cup();           
		

		kettle.getWater();
		kettle.boil();
		
		cup.makeTea(bag,kettle.getWater()); 

		}
} 