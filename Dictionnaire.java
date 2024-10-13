package EX2;

public class Dictionnaire {
	public int nbMots ; 
	public MotDico dico[];
	public String nom;
	
	public  Dictionnaire (String n) {
		this.nbMots = 0;
		this.nom = n;
		this.dico = new MotDico[100];
	}
	public void ajouterMot (MotDico m) {
		this.dico[nbMots] = m;
		this.nbMots ++;
	}
	
	public void supprimerMot(String ch) {
        int pos = chercherMot(ch);
        if (pos != -1) {
            for (int j = pos; j < this.nbMots - 1; j++) 
                this.dico[j] = this.dico[j + 1];
            this.dico[nbMots - 1] = null; 
            this.nbMots--;
        } else 
            System.out.println("le mot est non trouvé dans le dictionnaire.");
    }
	
	public int chercherMot (String ch) {
		for(int i=0;i<this.nbMots;i++) {
			if(this.dico[i].mot == ch) 
				return i;
		}
		return -1;
	}
	public void listerDico() {
		for(int i=0;i<this.nbMots;i++) {
            System.out.println(this.dico[i].mot);
        }
    }
	public int nbSynonymes (MotDico m) {
		int nb = 0;
		for(int i=0;i<this.nbMots;i++) {
			if(this.dico[i].synonyme(m)) {
				nb ++;
			}
		}
		return nb;
	}
	
	
}
