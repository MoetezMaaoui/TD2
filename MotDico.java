package EX2;

public class MotDico {
	public static int count = 0;
	public int num ;
	public String mot ;
	public String definition;

	public MotDico(String mot,String definition) {
		this.num = count++;
		this.mot = mot;
		this.definition = definition;
	}
	
	public String getMot() {
		return this.mot;
	}
	public String getDefinition() {
		return this.definition;
	}
	public void setDefinition(String s) {
		this.definition = s;	
	}
	public void setMot(String s) {
		this.mot = s;	
	}
	public boolean synonyme(MotDico m) {
		return this.definition.equals(m.definition) ;
	}
}

