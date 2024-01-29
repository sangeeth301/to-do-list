package todo_list;
import java.util.*;
import java.util.ArrayList;

public class To_Do_list {
	
	static ArrayList<List> lists=new ArrayList();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operation you want to perform");
		int choose;
		do {
			System.out.println();
			System.out.println("1.Add list\n2.remove list\n3.display\n4.exit");
			choose=sc.nextInt();
			switch(choose) {
			case 1:
				add();
				break;
			case 2:
				remove();
				break;
			case 3:
				display();
				break;
			case 4:
				System.out.println("exit");
				break;
				default:
					System.out.println("invalid choose 1-4");
			}
		}while(choose!=4);
	}

	private static void remove() {
		try {
		if(lists.isEmpty()) {
			System.out.println("Task lists are empty you can't delete anything");
		}
		else {
		Scanner sc=new Scanner(System.in);
		int i=1;
		for(List b:lists) {
			System.out.print(i+" ");
			b.display();
			i++;
		}
		System.out.println("Enter order number you want to delete task: ");
		int delete=sc.nextInt();
		lists.remove(delete-1);
		System.out.println("task deleted");
		}
	}catch(Exception e) {
		System.out.println("enter coreect order number");
	}
	}

	private static void display() {
		for(List b:lists)
		b.display();
	}

	public static void add() {
		int y=1;
		Scanner sc=new Scanner(System.in);
		while(y==1) {
		List li=new List();
		lists.add(li);
		System.out.print("Add another task enter 1 no need enter 2:");
		y=sc.nextInt();
		}
	}

}
