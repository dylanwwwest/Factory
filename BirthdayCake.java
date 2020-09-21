/*
 * class for birthday cake
 * Dylan West
 */

package factorydesignpattern;
/*
 * sets variables for the birthday cake cake
 */

public class BirthdayCake extends Cake {
	public BirthdayCake() {
	this.name = "Brithday Cake";
	this.price = (int) 109.99;
	this.numLayers = 1;
	this.shape = Shape.SHEET;
	this.flavor = "Funfetti";
	this.icing = "Vanilla";
	}
	/*
	 * adds the decorations to the birthday cake
	 */
	public void getDecorations()	{
	decorations.add("Sprinkles");
	decorations.add("Candy Flowers");
	decorations.add("Icing Writing");
	}
}
