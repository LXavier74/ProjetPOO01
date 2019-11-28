package projetPOO01.GestionPersonnes;import java.util.List;


public class Client extends Personne implements IFournisseur, IClient {
	
 private String numClient;


	public Client(String nom, String prenom, String adresse, String ville, String codePostal,String numClient) {
		super(nom, prenom, adresse, ville, codePostal);
		this.numClient = numClient;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void livrer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commander() {
		// TODO Auto-generated method stub

	}



	@Override
	public void paie() {
		// TODO Auto-generated method stub
		System.out.println("Client paie");
	}

	public String getNumClient() {
		return numClient;
	}

	@Override
	public String toString() {
		return "Client [numClient=" + numClient + "," + super.toString() + "]";
	}


	@Override
	public boolean estClient() {
		boolean resultat = true;
		return resultat;
	}


	@Override
	public void achete(List<Achat> achat) {
		// TODO Auto-generated method stub
		
	}		
	

}
