package ma.education.tp1.introduction;

public class Salle {
	
	
	//Les attributs de la classe Salle
	
	public long id;
	public  String nom;
	
	//Un constructeur sans param�tres
	
	public Salle() {
}
	//Un constructeur pour le nom de la salle
	
	public Salle(String Nom) {
		this.nom = Nom;
}
	//Un constructeur pour lid et le nom de la salle
	
	public Salle(long Id,String Nom) {
		this.id = Id;
		this.nom = Nom;
}

}
