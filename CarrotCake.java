/* 
 * Dylan West
 * carrot cake class
 */

package factorydesignpattern;


import java.util.ArrayList;
/*
 * sets variables for the carrot cake
 */
public class CarrotCake extends Cake {
	public CarrotCake()	{
		this.name = "Carrot Cake";
		this.price = (int) 54.99;
		this.numLayers = 2;
		this.shape = Shape.ROUND;
		this.flavor = "Carrot";
		this.icing = "Cream Cheese";	
	}
	/*
	 * adds decorations to the carrot cake
	 */
	public void decorations()
	{
	decorations.add("Walnuts");
	decorations.add("Candy Carrots");
	}

}
