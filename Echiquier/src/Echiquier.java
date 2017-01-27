import java.util.ArrayList;

public class Echiquier {
	
	
	private  ArrayList<Pieces> l = new ArrayList<Pieces>() ;
	
	private int taille ;
	
	//Region Get/Set
	public Echiquier(int t)
	{
		taille = t ;
	}
	
	
	public ArrayList<Pieces> getL() {
		return l;
	}


	public void setL(ArrayList<Pieces> l) {
		this.l = l;
	}


	public int getTaille() {
		return taille;
	}


	public void setTaille(int taille) {
		this.taille = taille;
	}

	//EndRegion

	public  void ajouterPieces(Pieces p)
	
	{
		this.l.add(p);
	}

	public  Pieces  getPieces (Position po)
	{
		Pieces r  = null;
		
		for (Pieces p : this.l)
		{
			if(p.position.equals(p))
			{
				r= p ;
			}
		}
		
		return r ;
	}
	
	
	public  int getPoint (String couleur)
	
	{
		int r = 0 ;
		
		for (Pieces p : this.l)
		{
			if(p.couleur.equals(couleur))
			{
				r= r + p.valeur ;
			}
		}
		
		return r ;
	}
	
	public   boolean  positionPossible (Position po)
	{
		boolean r = true ;
		if(po.getX()> this.taille || po.getY()>this.taille)
			
		{
			r = false ;
		}
		
		else
		{
			r = true ;
		}
		
		return r ;
	}
	
}
