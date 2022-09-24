//import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Horse
{
	//static Scanner teclado = new Scanner(System.in);
	String name;
	GregorianCalendar dateOfBirth;
	Color color;


//	public static void main(String[] args)
//	{
//
//		System.out.println("Hola bash");
//
//	}
	public Horse(String name, GregorianCalendar dateOfBirth, Color color)
	{
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.color = color;
	}

	public Horse()
	{
		this("no-name", new GregorianCalendar(), Color.BLACK);		
	}
	//getter and setters
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setDateOfBirth(GregorianCalendar dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	public GregorianCalendar getDateOfBirth()
	{
		return dateOfBirth;
	}
	public void setColor(Color color)
	{	
		this.color = color;
	}
	public Color getColor()
	{
		return color;
	}

	@Override
	public String toString()
	{
		StringBuilder horseSB = new StringBuilder();
		StringBuilder dateSB = new StringBuilder();


		horseSB.append("Name:");
		horseSB.append(name);
		horseSB.append("\n");


		horseSB.append("Date of birth:");
		dateSB.append(dateOfBirth.get(Calendar.DAY_OF_MONTH));
		dateSB.append("/");	
		dateSB.append(dateOfBirth.get(Calendar.MONTH)+1);
		dateSB.append("/");
		dateSB.append(dateOfBirth.get(Calendar.YEAR));
		horseSB.append(dateSB.toString());
		horseSB.append("\n");
		
		horseSB.append("Color:");
		horseSB.append(color.toString());
		horseSB.append("\n");

		


		return horseSB.toString();
	}
}
