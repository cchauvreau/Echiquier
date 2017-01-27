
public class Roi extends Pieces{

	
	public Roi(String c , int v, Position p) 
	{
		super(c, p);
		this.symbole ="R";
		this.valeur = 20 ;
	}

	@Override
	protected void deplacement(Echiquier e , Position p) 
	{
		try {
			
			if(e.positionPossible(p) == false ) // dans l' échiquier
			{
				throw new ExceptionPosition();
			  
			}
			else
			{
			
			if(p.getX()!= this.position.getX() && p.getY() != this.position.getY()) //se deplace en diagonale
			{
				throw new ExceptionPosition();
			}
			
			else if(p.getX()>this.position.getX()+1 || p.getX()<this.position.getX()-1) // se deplace de coté de plus d' 1
			{
				throw new ExceptionPosition();
			}
			
			
				if(this.couleur == "BLANC")
			{
				if(p.getY()<this.position.getY()-1 || p.getX()>this.position.getY()+1) // avance ou recule de plus d' 1 case pour blanc 
				{
					throw new ExceptionPosition();
				}
				
		
				
			}
			
			else
			{
				if(p.getY()>this.position.getY()+1 || p.getX()>this.position.getY()-1) //avance ou recule de plus d' 1 case pour noir 
				{
					throw new ExceptionPosition();
				}
			}
			
			
			this.setPosition(p);
		
			}
		}
		
		catch(ExceptionPosition E)
		{
			E.getMessage();
		}
	}
	
	
	

	

}
