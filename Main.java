package ex4;

public class Main {

	
	public static void main(String[] args) {
		Vehicule v=new Vehicule();
		String nom1 ="option1";double prix1=580;
		String nom2 ="option2";double prix2=260;
		String nom3 ="option3";double prix3=572;
		String nom4 ="option4";double prix4=558;
		String nom5 ="option5";double prix5=323;
		String nom6 ="option6";double prix6=364;
		String nom7 ="option7";double prix7=435;
		String nom8 ="option8";double prix8=999;
		
		//l'affichage
		v.ajouteOption(nom1,prix1);
		v.ajouteOption(nom2,prix2);
		v.ajouteOption(nom3,prix3);
		v.ajouteOption(nom4,prix4);
		v.ajouteOption(nom5,prix5);
		v.ajouteOption(nom6,prix6);
		v.ajouteOption(nom7,prix7);
		v.ajouteOption(nom8,prix8);
		
		v.affichOption();
		
		}
}
