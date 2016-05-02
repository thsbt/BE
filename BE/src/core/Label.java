package core;

public class Label implements Comparable<Label>{
	private float cout;
	private Sommets pere;
	private Sommets sommet;
	private boolean marque;

	public Label(float cout, Sommets Pere, Sommets sommet,boolean marque){
		this.cout=cout;
		pere=Pere;
		this.sommet=sommet;
		this.marque=marque;
	}

	@Override
	public int compareTo(Label o) {
		if(this.getTotalCout() - o.getTotalCout()>0) return 1 ; 
		if(this.getTotalCout() - o.getTotalCout()<0)return -1;
		else{
			if(this.getCout()-o.getCout()>0) return 1;
			if(this.getCout()-o.getCout()<0) return -1;
			else return 0;
		}
	}
	
	public float getCout() {
		return cout;
	}
	
	public float getTotalCout(){
		return cout;
	}

	public void setCout(float cout) {
		this.cout = cout;
	}

	public Sommets getPere() {
		return pere;
	}

	public void setPere(Sommets pere) {
		this.pere = pere;
	}

	public Sommets getSommet() {
		return sommet;
	}

	public void setSommet(Sommets sommet) {
		this.sommet = sommet;
	}

	public boolean isMarque() {
		return marque;
	}

	public void setMarque(boolean marque) {
		this.marque = marque;
	}
	
}
