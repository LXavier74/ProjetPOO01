package projetPOO01.GestionPersonnes;

public class Patron extends Salarie implements IPatron {

	public Patron(String nom, String prenom, String adresse, String ville, String codePostal, String numSecu,
			String salaire, boolean estClient) {
		super(nom, prenom, adresse, ville, codePostal, numSecu, salaire, estClient);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void embauche() {
		// TODO Auto-generated method stub

	}

	@Override
	public void licenciement() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void paieSalarie() {
		// TODO Auto-generated method stub
		System.out.println("PAIEMENT OK");

	}

}
