package projetPOO01;

import java.util.*;


import projetPOO01.GestionPersonnes.Client;
import projetPOO01.GestionPersonnes.Fournisseur;
import projetPOO01.GestionPersonnes.IClient;
import projetPOO01.GestionPersonnes.IFournisseur;
import projetPOO01.GestionPersonnes.Personne;
import projetPOO01.GestionPersonnes.Salarie;

public class Programme {
	static Scanner s1 = new Scanner(System.in);

	static List<Personne> lc = new ArrayList<Personne>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	IClient cl1 = new Client("","","","","");
		IClient cl2 = new Fournisseur("","","","","");
		Programme.gereClient(cl1);
		Programme.gereClient(cl2);
		Personne p1 = new Client("","","","","");
		Salarie s1 = new Salarie("","","","","");
		List<Personne> lp = new ArrayList<Personne>();
		lp.add(p1);
		lp.add(s1);
		*/
		boolean arret=false;

		while (arret==false)
			
		{
		System.out.println("1 = client , 2 = fournisseur, 3 = salarie, 4 = liste client, 5 = liste fournisseur, 6 = liste salarie, 7 = liste générale");


		System.out.println("Que voulez vous ajouter ?");
		String choix = s1.nextLine();
		switch (choix) {
		  case "1":
			  Programme.creerClient();
				break;
		  case "2":
			  Programme.creerFournisseur();
				  break;
		  case "3": 
			Programme.creerSalarie();
				  break;
		  case "4":
			Programme.listeClients();
				  break;
		  case "5":
				Programme.listeFournisseurs();
				  break;
		  case "6":
				Programme.listeSalaries();
				  break;
		  case "7":
				Programme.listeGenerale();
				  break;
		  default:
				System.out.println("Vous avez fait une erreur");
		}
		System.out.println("Vous voulez arrêter");	
		
		String arr = s1.nextLine();
		
		if(arr.equals("oui"))
		{
			arret=true;
		}
		
		
		}
		
		System.out.println("ARRET");

		
		
		

		
	}
	

	public static void UniqueSecu(String ns) throws MonException
	{
		for(Personne c: lc)
		{
		
			if (c instanceof Salarie)
			{
				if (ns.equals(((Salarie)c).getNumSecu())) throw new MonException("Ce numéro existe déja");
			}
			
		}
	}
	
	public static void UniqueCli(String nc) throws MonException
	{
		for(Personne c: lc)
		{
		
			if (c instanceof Client)
			{
				if (nc.equals(((Client)c).getNumClient())) throw new MonException("Ce numéro existe déja");
			}
			
		}
	}
	
	public static void UniqueFour(String nf) throws MonException
	{
		for(Personne c: lc)
		{
		
			if (c instanceof Fournisseur)
			{
				if (nf.equals(((Fournisseur)c).getNumFournisseur())) throw new MonException("Ce numéro existe déja");
			}
			
		}
	}
	
	public static void listeGenerale() {
		System.out.println("Vous voulez une liste générale");
		
		for(Personne c:lc)
		{
		
			System.out.println(c);
		
		}		
	}

	public static void creerClient()
	{
		System.out.println("Vous voulez ajouter un client");
		System.out.println("Quel est votre nom ?");
		String nomCli = s1.nextLine();
		System.out.println("Quel est votre prénom ?");
		String prenomCli = s1.nextLine();
		System.out.println("Quel est votre adresse ?");
		String adresseCli = s1.nextLine();
		System.out.println("Quel est votre ville ?");
		String villeCli = s1.nextLine();
		System.out.println("Quel est votre code postal ?");
		String cpCli = s1.nextLine();
	
		
		System.out.println("Quel est votre numero client ?");
		String numCli = s1.nextLine();
		
		boolean reussi = false;
		while(reussi==false)
		{
		do {
			numCli = s1.nextLine();
			if (!numCli.matches("\\d{1,9}")) {
				System.out.println("Rentrez un format correct");
			}
			else {
				try {
					Programme.UniqueCli(numCli);
					reussi=true;
				} catch (MonException e) {
					// TODO Auto-generated catch block
					System.out.println("Ce numéro existe déja");
					
				}
			}
		}
			while (!numCli.matches("\\d{1,9}") && reussi==false);
		}

		
		Personne monCli= new Client(nomCli, prenomCli , adresseCli,villeCli,cpCli,numCli);
		System.out.println(monCli.toString());
	
		lc.add(monCli);
		}
		
	public static boolean isNum(String strNum) {
	    boolean ret = true;
	    try {

	        Double.parseDouble(strNum);

	    }catch (NumberFormatException e) {
	        ret = false;
	    }
	    return ret;
	}


	

	public static void creerFournisseur()
	{
		System.out.println("Vous voulez ajouter un fournisseur");
		
		System.out.println("Quel est votre nom ?");
		String nomFour = s1.nextLine();
		System.out.println("Quel est votre prénom ?");
		String prenomFour = s1.nextLine();
		System.out.println("Quel est votre adresse ?");
		String adresseFour = s1.nextLine();
		System.out.println("Quel est votre ville ?");
		String villeFour = s1.nextLine();
		System.out.println("Quel est votre code postal ?");
		String cpFour = s1.nextLine();
		System.out.println("Quel est votre numero fournisseur ?");
		String numFour = s1.nextLine();

		
		boolean reussi = false;
		while(reussi==false)
		{
		do {
			numFour = s1.nextLine();
			if (!numFour.matches("\\d{1,9}")) {
				System.out.println("Rentrez un format correct");
			}
			else {
				try {
					Programme.UniqueFour(numFour);
					reussi=true;
				} catch (MonException e) {
					// TODO Auto-generated catch block
					System.out.println("Ce numéro existe déja");
					
				}
			}
		}
			while (!numFour.matches("\\d{1,9}") && reussi==false);
		}
		
		Personne monFour= new Fournisseur(nomFour, prenomFour , adresseFour,villeFour,cpFour,numFour);
		System.out.println(monFour.toString());
		
		lc.add(monFour);
	}
	
	
	public static void creerSalarie()
	{
		System.out.println("Vous voulez ajouter un salarie");
		System.out.println("Quel est votre nom ?");
		String nomSal = s1.nextLine();
		System.out.println("Quel est votre prénom ?");
		String prenomSal = s1.nextLine();
		System.out.println("Quel est votre adresse ?");
		String adresseSal = s1.nextLine();
		System.out.println("Quel est votre ville ?");
		String villeSal = s1.nextLine();
		System.out.println("Quel est votre code postal ?");
		String cpSal = s1.nextLine();
		System.out.println("Quel est votre numero de secu ?");
		String numSecu = s1.nextLine();
		System.out.println("Etes vous un client : true/false ?");
		Boolean estClient = s1.nextBoolean();

		boolean reussi = false;
		while(reussi==false)
		{
		do {
			numSecu = s1.nextLine();
			if (!numSecu.matches("\\d{13}")) {
				System.out.println("Rentrez un format correct");
			}
			else {
				try {
					Programme.UniqueSecu(numSecu);
					reussi=true;
				} catch (MonException e) {
					// TODO Auto-generated catch block
					System.out.println("Ce numéro existe déja");
					
				}
			}
		}
			while (!numSecu.matches("\\d{13}") && reussi==false);
		}
		System.out.println("Quel est votre salaire ?");
		String salaire;
		do {
			salaire = s1.nextLine();
			if (!salaire.matches("\\d{1,9}\\,\\d{1,2}€")) {
				System.out.println("Rentrez un format correct");
			}
		}
			while (!salaire.matches("\\d{1,9}\\,\\d{1,2}€"));
		
		Personne monSal= new Salarie(nomSal, prenomSal , adresseSal,villeSal,cpSal, numSecu, salaire, estClient);
		System.out.println(monSal.toString());
		
		lc.add(monSal);
	}
	public static void listeClients()
	{
		System.out.println("Vous voulez la liste des clients");
		
		for(Personne c:lc)
		{
			if (c.getClass().getSimpleName().equals("Client"))
			{
			System.out.println(c);
			}
	
			
		}
	}
	public static void listeFournisseurs()
	{
		System.out.println("Vous voulez la liste des fournisseurs");
		
		for(Personne c:lc)
		{
			if (c.getClass().getSimpleName().equals("Fournisseur"))
			{
			System.out.println(c);
			}
		}
	}
	public static void listeSalaries()
	{
		System.out.println("Vous voulez la liste des salariés");
		
		for(Personne c:lc)
		{
			if (c.getClass().getSimpleName().equals("Salarie"))
			{
			System.out.println(c);
			}
		}
	}
	
	
	
}
