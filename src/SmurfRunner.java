
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf Smurf = new Smurf("Smurf");

		Smurf.eat();

		System.out.println(Smurf.getName());

		Smurf PapaSmurf = new Smurf("PapaSmurf");

		System.out.println(PapaSmurf.getName());

		System.out.println(PapaSmurf.isGirlOrBoy());

		System.out.println(PapaSmurf.getHatColor());

		Smurf Smurfette = new Smurf("Smurfette");

		System.out.println(Smurfette.getName());

		System.out.println(Smurfette.isGirlOrBoy());

		System.out.println(Smurfette.getHatColor());
	}

}
