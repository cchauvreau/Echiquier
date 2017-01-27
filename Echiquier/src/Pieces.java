

public abstract class Pieces{

	
	
	
	
	protected  String couleur ;
	protected String symbole ;
	protected int valeur ;
	protected Position position ;
	
	//Region Get/Set



	public String getCouleur() {
		return couleur;
	}



	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}



	public int getValeur() {
		return valeur;
	}



	public void setValeur(int valeur) {
		this.valeur = valeur;
	}



	public Position getPosition() {
		
		return position;
	}



	public void setPosition(Position position) {
		this.position = position;
	}



	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}

	//EndRegion

	public Pieces (String c , Position p)
	
	{
		couleur = c;
		position = p;
	}
	
	
	
	public String  toString()
	{
		String r = this.symbole+" "+this.couleur+" "+this.position.getX()+","+this.position.getY();
		
		return r ;
	}
	
	
	protected abstract void  deplacement(Echiquier e ,Position p) throws ExceptionPosition;
	

}
