package EX2;

public class test_main {

	public static void main(String[] args) {
		Dictionnaire D = new Dictionnaire("Larousse");
		MotDico m1,m2,m3,m4;
		m1 = new MotDico("Amour", "Sentiment d'affection intense");
        m2 = new MotDico("Joie", "Sentiment de bonheur profond");
        m3 = new MotDico("Bonheur", "Etat de satisfaction complète");
        m4 = new MotDico("Epanouissement", "Etat de satisfaction complète");
		
		D.ajouterMot(m1);
		D.ajouterMot(m2);
		D.ajouterMot(m3);
		D.ajouterMot(m4);
		
		System.out.println("Contenu du dictionnaire Larousse :");
		D.listerDico();

		String mot = "Tristesse";
        int pos = D.chercherMot(mot);
        if (pos == -1) {
            System.out.println("\nLe mot '" + mot + "' n'existe pas dans le dictionnaire.");
        }else {
        	System.out.println("\nLe mot '" + mot + "' trouvé en : "+pos);
        	System.out.println("la difinition de '"+mot+"'est : "+D.dico[pos].definition);
        }
        
        String mot1 = "Bonheur";
        int pos1 = D.chercherMot(mot1);
        if (pos1 == -1) {
            System.out.println("\nLe mot '" + mot1 + "' n'existe pas dans le dictionnaire.");
        }else {
        	System.out.println("\nLe mot '" + mot1 + "' trouvé en : "+pos1);
        	System.out.println("la difinition de '"+mot1+"'est : "+D.dico[pos1].definition);
        }
        
        int nb = D.nbSynonymes(m1);
        System.out.println("\nNombre de synonymes pour '" + m1.mot + "' : " + nb);
        
        D.supprimerMot(m1.mot);
        System.out.println("\nDictionnaire après suppression du mot '"+m1.mot+"' : ");
        D.listerDico();
		
	}

}
