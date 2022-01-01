package ma.education.tp1.introduction;

public class AccesSamePackage {

	public static void main(String[] args) {
		
		Salle SalleA = new Salle(15,"Soukaina");
		
		System.out.println("ID: "+SalleA.id+"\tNom: "+SalleA.nom);

	}

}
