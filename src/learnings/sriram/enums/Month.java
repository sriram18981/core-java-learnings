package learnings.sriram.enums;

/**
 * Enum representing a Month of a calendar year.
 * @author tansr02
 *
 */
public enum Month implements Comparable<Month>{
	FEB(28, "February"), MAR(31, "March"), APR(30, "April"), MAY(31, "May"), JUN(30, "June"), JAN(31, "January"),
	JUL(31, "July"), AUG(31, "August"), SEP(30, "September"), OCT(31, "October"), NOV(30, "November"), DEC(31, "December");
	
	int days;
	String name;
	
	// default constructor
	Month(){}
	
	// constructor with days as input
	Month(int days, String name){ this.days = days; this.name = name; }
	
	public int getDays() { return days; }
	
	public String getName() { return name; }
	
	@Override
	public String toString() { return name; }
	
	public boolean has30Days() { return days == 30; }
	
	public boolean has31Days() { return days == 31; }
	
	public boolean hasMorethanOrEqualTo30Days() { return days >= 30; }
	

	
	

}
