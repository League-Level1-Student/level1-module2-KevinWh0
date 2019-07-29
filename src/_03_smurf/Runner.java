package _03_smurf;

public class Runner {
	public static void main(String[] args) {
		Smurf handyS = new Smurf("Handy Smurf");
		Smurf papaS = new Smurf("Papa Smurf");
		Smurf smurfette = new Smurf("Smurfette");
		
		handyS.eat();
		handyS.getName();
		
		System.out.println(papaS.getName()+" Hat col: "+papaS.getHatColor()+" Gender: "+papaS.isGirlOrBoy());
		System.out.println(smurfette.getName()+" Hat col: "+smurfette.getHatColor()+" Gender: "+smurfette.isGirlOrBoy());
		
	}
	
	
	
}
