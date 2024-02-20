package abstracta.cineherencia;

public class cineprincipal {

	public static void main(String[] args) {
		sala1 s1=new sala1("Spiderman", "18:00");
		sala2 s2=new sala2("Fallmoom", "20:00");
		sala3 s3=new sala3("Scream", "20:20");
		sala4 s4=new sala4 ("Caballeros del zodiaco","17:35");
		sala5 s5=new sala5 ("Pasion de  gavilanes", "18:35");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
