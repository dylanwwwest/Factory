/*
 * the class for black forest cake
 * Dylan West
 */

package factorydesignpattern;
/*
 * sets variables for the black forest cake
 */
public class BlackForestCake extends Cake {
	public BlackForestCake() {
	this.name = "Black Forest Cake";
	this.price = 47.99;
	this.numLayers = 3;
	this.shape = Shape.ROUND;
	this.flavor = "Black Forest";
	this.icing = "Whipped Cream";
		}
	/*
	 * adds the decorations to the black forest cake
	 */
	public void decorations() {
	decorations.add("Cherries");
	decorations.add("Chocolate Flakes");
	decorations.add("Chocolate Flakes");
	decorations.add("Whipped Cream");
	}
}
