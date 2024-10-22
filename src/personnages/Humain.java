package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom=nom;
		this.boisson=boisson;
		this.argent=argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	public String getBoisson() {
		return boisson;
	}
	public void direBonjour() {
		System.out.println(parler()+"Bonjour ! Je m'appelle "+ nom +"et j'aime boire du "+ boisson +"!");
	}
	public void boire() {
		System.out.println(parler()+"Mmmmm, un bon verre de "+boisson+"! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (prix<=argent) {
			System.out.println(parler()+"J'ai "+ argent +"sous en poche. Je vais pourvoir m'offir " +bien+ " à "+ prix+ " sous");
			perdreArgent(prix);
		}else{
			System.out.println(parler()+"Je n'ai plus que "+argent+"sous en poche. Je ne peux même pas m'offir "+bien+" à "+prix+" sous");
		}
	}
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	public void perdreArgent(int perte) {
		//TODO regarder si il peut etre en négatif
		argent-=perte;
	}
	private String parler() {
		return ( "( " + nom + ") -");
	}
	
}
