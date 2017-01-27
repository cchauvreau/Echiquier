
public class Pion extends Pieces {
	
	
	public Pion(String c , int v, Position p) 
	{
		super(c, p);
		this.symbole ="P";
		this.valeur = 1 ;
	}

	@Override
	protected void deplacement(Echiquier e ,Position p) throws  ExceptionPosition
	{
		
		try {
		
			if(e.positionPossible(p) == false ) //dans l 'echiquier
			{
				throw new ExceptionPosition();
			  
			}
			
			else if (p.getX() != this.position.getX()) // se deplace e l' horizontale
			{
				throw new ExceptionPosition();
				
			}
			
			else if(this.couleur == "BLANC")
			{
				if(p.getY()<this.position.getY()-1) // recule blanc 
				{
					throw new ExceptionPosition();
				}
			}
			
			else
			{
				if(p.getY()>this.position.getY()+1) //recule noir 
				{
					throw new ExceptionPosition();
				}
			}
			
			
			this.setPosition(p);
		
		}
		
		catch(ExceptionPosition E)
		{
			E.getMessage();
		}
	}
	

}
