package ex4;

import java.util.ArrayList;

public class Vehicule {

	
	ArrayList<Options> options = new ArrayList<Options>();
	public Vehicule()
	{}
	public void ajouteOption(String nom,double prix)
	{
		options.add(Fly.FlyWeight(nom, prix));
		
	}
	public void affichOption()
	{
		for (Options item :options)
		{
			System.out.println(item.affiche());
		}
	}
}
