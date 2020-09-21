package factorydesignpattern;
/*
 * order the cake and returns the name
 */
public class Bakery extends Cake {
	private factorydesignpattern.Cake cake;
	public String orderCake(String type)
	{
		return name;
	}
	/*
	 * creates the cake
	 */
	private void createCake(String type)
	{
		this.cake = new Cake();
		
	}

}
