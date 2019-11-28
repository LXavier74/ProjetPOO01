package projetPOO01.GestionPersonnes;

import java.util.List;

public class Fournisseur extends Personne implements IClient, IFournisseur {
private String numFournisseur;
private boolean estClient;



	public Fournisseur(String nom, String prenom, String adresse, String ville, String codePostal, String numFournisseur) {
		super(nom, prenom, adresse, ville, codePostal);
		this.numFournisseur= numFournisseur;

		// TODO Auto-generated constructor stub
	}



	@Override
	public void paie() {
		// TODO Auto-generated method stub
		System.out.println("Fournisseur paie");
	}

	@Override
	public void livrer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commander() {
		// TODO Auto-generated method stub
		
	}

	public String getNumFournisseur() {
		return numFournisseur;
	}

	@Override
	public boolean estClient() {
		boolean resultat = false;
		if (this.estClient==true)
		{
			resultat = true;
		}
		return resultat;
	}



	@Override
	public void achete(List<Achat> achat) {
		// TODO Auto-generated method stub
		
	}






}
