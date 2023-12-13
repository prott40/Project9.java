/**
 * <Preston Rottinghaus/ 02B 3:30-5:30 Thursday>
 * The View file holds all of the pritning statemnets for the controller.
 * some prints return user entries to the controller
 * all print staments care contained inisde of this file>
 * EXTRA CREDIT PART 1 
 */
import java.util.*;
public class View {
    private Scanner s;
    /**
     * creates scanner for all methods
     */
    public View(){
        s = new Scanner(System.in);
    }
/**
 * asks user to enter the name of the student
 * @return name of student
 */
    public String nameEntry(){// change all nexts to 
        System.out.print("\nEnter the students name: ");
        return s.nextLine();
       }
       /**
        * outputs erro message for no name
        */
    public void nameError(){
        System.out.println("Name is required (Please re-enter)\n");
    }
    /**
     * asks user to enter user name
     * @return user name of student
     */
    public String userEntry(){
        System.out.print("Enter student's USER name:");
        return s.nextLine();
    }
    /**
     * error message for invalid entry
     */
    public void userError(){
        System.out.println("User name is required (Please re-enter)\n");
    }
    /**
     * asks for WID entry
     * @return enterd WID
     */
    public String widEntry(){
        System.out.print("Enter student's WID #");
        return s.nextLine();
    }
    /**
     * prints error for invaild Wid
     */
    public void widError(){
        System.out.println("User name is required (Please re-enter)\n");
    }
    /**
     * prints error for invilid digits in wid
     */
    public void widDigEr(){
        System.out.println("WID must contain 9-digits - no characters (Please re-enter)\n");
    }
    /**
     * asks for students GPA entry
     * @return students GPA
     */
    public String gpaEntry(){
        System.out.print("Enter student's GPA:");
        return s.nextLine();
    }
    /**
     * prints error in gpa entry
     */
    public void gpaError(){
        System.out.println("GPA must be between 0.0-4.0 (inclusive)\n");
    }
    /**
     * asks if new student want sto be created
     * @return continue value for loop
     */
    public String newStew(){
        System.out.println("Student added to the ArrayList...\n");
        System.out.print("Add another student? ('Y' or 'N'): ");
        return s.nextLine();// next line and convert latetr
    }
    /**
     * if repeat studnet is entered asks if wanting to enter another student
     * @return continiue statement
     */
    public String repeatstew(){
        System.out.println("Student already exists\n");
        System.out.print("Add another student? ('Y' or 'N'): ");
        return s.nextLine();
    }
/**
 * prints out student 
 * @param s stuent to be printed
 */
    public void classdisplayprint(Student s){
        System.out.print(s.toString());
    }
    /**
     * pritns when all students have been displayed
     */
    public void finisheddip(){
        System.out.println("All students displayed\n");
    }
    /**
     * tells usr to search user if they want to search for student
     */
    public void enterSearch(){
        System.out.println("Search for a Student by entering Student's WID number (or enter \"exit\" to exit the program.)");
    }
    /**
     * asks for student ID to search
     * @return studnt id
     */
    public String actsearch(){
        System.out.print("Input Student WID # (or \"exit\"): ");
        return s.nextLine();
    }
    /**
     * if no student is found
     */
    public void searchnotfound(){
        System.out.println("Student not found");
    }
    /**
     * if no entry is put in
     */
    public void empty(){
        System.out.println("Nothing entered");
    }
    /**
     * says that student info is valid
     */
    public void searchfound(){
        System.out.println("\nStudent Info:");
    }
    /**
     * prints an extra line
     */
    public void exline(){
        System.out.print("\n");
    }
}
