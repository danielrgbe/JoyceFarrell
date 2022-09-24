public class Poem
{
	private String title;
	private int numberOfLines;

	public Poem(String title, int numberOfLines)
	{
		this.title = title;
		this.numberOfLines = numberOfLines;
	}
	
	public String getTitle()
	{
		return title;
	}

	public int getNumberOfLines()
	{
		return numberOfLines;
	}

	@Override
	public String toString()
	{
		return "title: " + getTitle() + "\nnumber of lines: " + getNumberOfLines()+ "\n";
	}
}
