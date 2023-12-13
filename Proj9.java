/**
 * <Proj9.java>
 * <Preston Rottinghaus/ Thursday 02B 3:30 - 5:30>
 * <Proj9 is the controller of teh MVC.
 * it takes the user inputs and print lines from the view.
 * passes the information into the model called student.
 * and contails the arraylist and hashmap for searching>
 * EXTRA CREDIT PART 1
 */

import java.util.*;

public class Proj9 {// open proj9

   /**
    * main method that handles passing all arguments amoung classes.
    * @param args has no main args
    */
    public static void main(String args[]){// open main
    ArrayList<Student> studGpa = new ArrayList<Student>();// creates ArrayList of students
    HashMap<String,Student> searchbar = new HashMap<String, Student>();
    View viewer = new View();// creates viewing objects
    Student check = new Student();// creates studnet object just for checking values
    String cont = "Y";
    String name;
    String userName;
    String wid;
    String temp;
    double gpa;
    do{
    cont = "N";
    name = viewer.nameEntry();// sets name entry to what user inputs
    while(check.enrtycheck(name) == false){// ehecks name for balnk entry
        viewer.nameError();//prints error messafe
        name = viewer.nameEntry();// gets name renetry
    }
    userName = viewer.userEntry();// gets user entry for username
   //System.out.println("entry is" + userName +"where");
    while(check.enrtycheck(userName) == false){// ehecks name for balnk entry
        viewer.userError();//prints error messafe
        userName = viewer.userEntry();// gets name renetry
    }
    wid = viewer.widEntry();// sets name entry to what user inputs
    while(check.enrtycheck(wid) == false){// ehecks name for balnk entry
        viewer.widError();//prints error messafe
        wid = viewer.widEntry();// gets name renetry
    }
    while(check.digCheck(wid) == false){// check wildcat id for invalid digits
        viewer.widDigEr();// prints error message
        wid = viewer.widEntry();// setes wid entry to userentry
    }
    
    temp = viewer.gpaEntry();// get user gpa entry
    //gpa = Double.parseDouble(temp);// convert to double entry
    while(check.gpaCheck(temp) == false){// checks entry insode 0 - 4
        //THIS ERROR CHECK IS NOT WORKING!!!!!!!!!!!!!!!!!
        viewer.gpaError();// prints error if valid
        temp = viewer.gpaEntry();// gets user reetry
        //gpa = Double.parseDouble(temp);// re convers tp double
    }
    gpa = Double.parseDouble(temp);
Student nes = new Student(name, userName, gpa, wid);// uses vailid data to create a valid student object
 searchbar.put(nes.getWID(),nes);
if(studGpa.size() == 0){
    
    cont = viewer.newStew();

    cont = cont.toUpperCase();
    studGpa.add(nes);
}
else{
   
Iterator<Student> iterator = studGpa.iterator();
   boolean repeat = false;
while(iterator.hasNext()){
    Student wildcat = iterator.next();
    if(nes.equals(wildcat)){
        repeat = true;
        cont = viewer.repeatstew();
        cont = check.uppercase(cont);
        break;
    }
}
    if(!repeat){
    studGpa.add(nes);
    cont = viewer.newStew();
    cont = check.uppercase(cont);
    }
}


    }while(cont.equals("Y" ));
    Iterator<Student> printer = studGpa.iterator();
while(printer.hasNext()){
    Student thisPrint = printer.next();
   viewer.exline();
    viewer.classdisplayprint(thisPrint);
}
    viewer.finisheddip();

boolean exitable = false;
viewer.enterSearch();
while(!exitable){
String userSearch = viewer.actsearch();
if(searchbar.containsKey(userSearch)){
    viewer.searchfound();
    viewer.classdisplayprint(searchbar.get(userSearch));
   
}
else if(userSearch.equalsIgnoreCase("exit")){
exitable = true;
}
else if(userSearch.equals("")){
    viewer.empty();
    
}
else{
    viewer.searchnotfound();
}

}


    }// end of main
}// end of Proj9