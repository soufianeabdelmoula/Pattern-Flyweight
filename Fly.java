package ex4;

public class Fly {

	public static Options FlyWeight(String nom,double prix)
	{
	
		return new Options(nom,prix);
	}
}
