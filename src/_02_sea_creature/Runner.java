package _02_sea_creature;

public class Runner {
	public static void main(String[] args) {
		SeaCreature sp = new SeaCreature("Spongebob");
		SeaCreature pa = new SeaCreature("Patrick");
		SeaCreature sq = new SeaCreature("Squidward");
		
		
		sp.eat();
		sp.laugh();
		
		System.out.println(pa.getName());
		pa.eat();
		pa.laugh();
		
		System.out.println(sq.getName());
		
		sq.eat();
		sq.laugh();
		
	}
}
