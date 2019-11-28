package projetPOO01.GestionPersonnes;

import java.util.List;

public interface IClient {
	
	public void achete(List<Achat> achat);
	public void paie();
	public boolean estClient();


	
}
