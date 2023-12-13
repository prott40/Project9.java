// Student.java - Starter file given to Students
/**
 * <Stundent.java>
 * <Preston Rottinghaus/ Thursday 02B 3:30 - 5:30>
 * Student is the model containing all methods.
 * does all error checking, object creation and type conversions.
 * uses overlaoded constructs that arent used.
 * CONTAINS EXTRA CREDIT PART 1
 */
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class Student {//
	private String name;
	private String userName;
	private double gpa;
	private String wid;
	/**
	 * Student object constructor
	 * @param n is the name of a student
	 * @param u is the username the student has
	 * @param g is the gpa of the student
	 * @param w is the wildcat id of studnet
	 */
	public Student(String n, String u, double g, String w) {
		name = n;
		userName = u;
		gpa = g;
		wid =w;
	}
	/**
	 * is the empty constructor of a student
	 */
	public Student(){
		name =  "not initialized";
		userName = "not initialized";
		gpa = -1;
		wid =  "not initialized";
	}
	/**
	 * sets the GPA of a student
	 * @param grade grade of a student object
	 */
	public void setGPA(double grade){
		this.gpa = grade;
	}
	/**
	 * sets the gpa of a student as a string
	 * @param grade gpa of a student object
	 */
	public void setGPA(String grade){
		double ng = Double.parseDouble(grade);
		this.gpa = ng;
	}
	/**
	 * comapres two studnt objects WID
	 * @param s is a studnet object being comapred
	 * @return true if studets are equal false if not
	 */
	public boolean equals(Student s){
		if(this.wid.equals(s.wid)){
			//System.out.println("equals comes out true");
			return true;
		}
		else{
			//System.out.println("equals comes out false");
		return false;
		}
	}
	/**
	 * returns email of student from username
	 * @return restursn completed email
	 */
	public String getEmail() {
		return userName + "@ksu.edu";
	}
	/**
	 * gets the name of studnt object
	 * @return returns the students name
	 */
	public String getName() {
		return name;
	}
	/**
	 * gets the WID of teh student
	 * @return returns the wildcate ID
	 */
	public String getWID() {
		return wid;
	}	
	/**
	 * gets teh GPA of a studnet objedt
	 * @return the gpa of studetn
	 */
	public double getGPA() {
		return gpa;
	}	
	/**
	 * checks for a repeadet entry of studnet into class
	 * @param name stuent ID number
	 * @return false if repeated true of not
	 */
	public boolean enrtycheck(String name){
		if(name.equals("")){
		return false;
		}
	else
		return true;
		
	}
	/**
	 * checks if wid contains charaters outside of 0-9
	 * @param wid WId of studnet being checked
	 * @return true if leght of ID is 9 and contains only dig 0-9 false if not
	 */
	public boolean digCheck(String wid){
int length = wid.length();
if(length == 9){
	for(int i = 0; i < length; ++i){
		char dig = wid.charAt(i);
		int nd = (int)dig;
		if(!(nd>= 48 && nd<=57)){
			return false;
		}
		
	}
	return true;
}
	else
		return false;

	}
	/**
	 * check gpa to see if inviald charaters where entered
	 * @param temp the srign entry of a gpa so it can be checked for charaters outside 0-9 and .
	 * @return true if gpa is inside 0.0 and 4.0 with no charaters
	 */
public boolean gpaCheck(String temp){
	double gpa = 0.0;
	try{
		gpa = Double.parseDouble(temp);
	}catch(NumberFormatException e){
		return false;//WHY DOES THIS LINE NO CAUSE THE ERROR CHECK TO CASUE A REPEAT
	}
	
	if(gpa>= 0.0 && gpa<=4.0){
		return true;
	}
	else
	return false;
	
		

}
/**
 * convers the conting entry to uppercase
 * @param cont the charater of entry by user for contining loop
 * @return the apitalized version of entry
 */
public String uppercase(String cont){
	if(cont.equals("y")||cont.equals("Y")){
		cont = "Y";
	}
	else{
		cont = "N";
	}
	
	return cont;
}
/**
 * converts the objeect into a string 
 * @return printable format of object
 */
public String toString(){
	DecimalFormat df = new DecimalFormat("0.0");
	return this.name + "\n" + "WID " + this.wid +"\n" + this.getEmail() + "\n" + "GPA: " + df.format(this.gpa) + "\n";
}
}