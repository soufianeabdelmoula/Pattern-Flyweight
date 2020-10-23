package ex4;

public class Options {

	private String nom;
	private double prix;
	
	public Options(String nom,double prix2)
	{
		this.nom=nom;
		this.prix=prix2;
	}
	public String affiche()
	{
			return "Le nom de c'est  "+nom+"\n le  prix : "+prix+" ";
	}
}
