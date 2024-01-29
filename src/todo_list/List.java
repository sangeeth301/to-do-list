package todo_list;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class List {
	String task="";
	Date date;
		List(){
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter your new task: ");
			task=sc.nextLine();
			System.out.print("Enter Date:");
			String dateInput=sc.next();
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
			try {
				date=dateFormat.parse(dateInput);
				} catch (ParseException e) {
					System.out.println("your date formate is Wrong..");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		void display() {
			System.out.println("Task:"+task+", Date: "+date);
		}

}
