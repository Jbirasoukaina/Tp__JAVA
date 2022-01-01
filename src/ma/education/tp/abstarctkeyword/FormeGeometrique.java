package ma.education.tp.abstarctkeyword;

public abstract class FormeGeometrique {
	
	
	double surface;
	
	// Methode abstraite sans corps
	public abstract double calculerSurface();
	
	// Methode concrete avec un corps
	public void afficherSurface() {
	System.out.println(this.surface);

}
}