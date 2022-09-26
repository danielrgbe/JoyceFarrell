public class SugarSmashPlayer
{
	private static final int NUMBER_OF_LEVELS = 10;
	private static final int MIN_SCORE = 100;
	private int idNumber;	
	private String name;
	private int[] highestScores = new int[NUMBER_OF_LEVELS];
	private int levelsUnlock;
	
	public SugarSmashPlayer()
	{
		levelsUnlock = 1;
	}

	public int getIdNumber()
	{
		return idNumber;
	}

	public void setIdNumber(int iNumber)
	{
		this.idNumber = idNumber;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getHightScore(int level)
	{
		return highestScores[level];
	}

	public void setHightScore(int hightScore, int level)
	{
		if(level >= 1 && level <=NUMBER_OF_LEVELS)//Si esta dentro del los niveles existentes.
		{
			if(level <= levelsUnlock)//Si estan desbloqueados y ya tienen alguna puntuación
			{
				//Solo si es el primer nivel no verifiques que la puntuación supere la puntuación mínima
				if(superaPuntuacionMinima(hightScore, level))
				{
					//verifica que la nueva puntuación sea mayor a la antigua puntuación
					if(hightScore > highestScores[level - 1])
						highestScores[level - 1] = hightScore;
					else
						System.out.println("La puntuación del nivel no ha cambiado");
				}
			}	
			else//puede o no ser desbloqueado
			{
				if(level - 1 == levelsUnlock)//se puede desbloquear pero aun no tiene una puntuación
					if(superaPuntuacionMinima(hightScore, level))
						highestScores[level - 1] = hightScore;
				else
					System.out.println("El nivel aun no ha sido desbloqueado");	
			}
		}
		else//entonces el nivel no existe
			System.out.println("Error: El nivel no existe");
	}

	public boolean superaPuntuacionMinima(int hightScore, int level)
	{
		if(level == 1)
			return true;
		else
			if(hightScore >= MIN_SCORE)
	  		   return true;
			else
			    return false;		
	}

	
	@Override
	public String toString()
	{
		return "todo ok";
	}
}
