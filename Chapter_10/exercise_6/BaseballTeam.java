public class BaseballTeam
{
    private int inings;
    private String teamName;
    private int[] iningScore;

    public BaseballTeam(int inings)
    {
	// In a professional game the number of innings for a basic game is 9
	// this happenns when the game is not draw
	this.inings = inings;
	iningScore = new int[inings];
	initIningScore();
    }
    
    public BaseballTeam()
    {
	this(9);
	teamName = "Default";
	initIningScore();
    }

    private void initIningScore()
    {
	for(int i = 0; i < inings; i ++)
	{
	    iningScore[i] = -1;//Because a valid score could be 0
	}
    }

    public int getIningScore(int ining)
    {
	//ining starts at 1 but at the arrays index begin at 0
	int index = ining - 1;

	return iningScore[index];
    }

    public void setIningScore(int ining, int score)
    {
	iningScore[ining - 1] = score;
    }


    @Override
    public String toString()
    {
	StringBuilder equipoSB = new StringBuilder();
	equipoSB.append("Nombre: ");
	equipoSB.append(teamName);
	equipoSB.append("\n");

	for(int i = 0; i < inings ; i ++)
	    equipoSB.append((i + 1) + "\t");
	equipoSB.append("\n");
	for(int i = 0; i < inings ; i ++)
	    equipoSB.append((iningScore[i]) + "\t");
	equipoSB.append("\n");	
	return equipoSB.toString();
    }
}
