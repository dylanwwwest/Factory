package factorydesignpattern;

import java.util.ArrayList;
/*
 * sets attributes and variables for cake
 */
public class Cake {
protected String name;
protected double price;
protected int numLayers;
protected ArrayList<String> decorations = new ArrayList<String>();
protected factorydesignpattern.Shape shape;
protected String flavor;
protected String icing;
/*
 * makes array to add decorations to
 */
public void Cake()
{
	decorations = new ArrayList<String>();
}
/*
 * creates the cake and prints
 */
public void createCake()
{
 System.out.println("Creating a " + numLayers + shape + flavor + "Cake");
}
/*
 * creates layers for the cake
 */
private void createLayers()
{
	if(numLayers == 1)
	{
		System.out.println("Creating a 1 layer" + shape + flavor + "Cake");
	}
	else
	{
		System.out.println("Creating a " + numLayers + "layered" + shape + flavor + "Cake");
	}
}
/*
 * prints icing on the cake and adds them
 */
private void frostCake()
{
	 System.out.println("Frost cake with" + icing +  "icing.");
}
/*
 * adds decorations to the cake and prints
 */
private void addDecorations()
{
	System.out.println("Adding" + decorations);
}
/*
 * gets price and prints it
 */
public double getPrice()
{
	System.out.println("Price: " + "$" + price); 
	return price;
	
}
}
