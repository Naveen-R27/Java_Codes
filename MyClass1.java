package javaprog;

import java.util.Scanner;
import java.util.Arrays;

public class MyClass1 {
	private int ticketno;
	private String raisedby;
	private String assignedTo;
	private int priority;
	private String project;

	MyClass1(int ticketno, String raisedby, String assignedTo, int priority, String project) {
		this.ticketno = ticketno;
		this.raisedby = raisedby;
		this.assignedTo = assignedTo;
		this.priority = priority;
		this.project = project;
	}

	public int getTicketno() {
		return ticketno;
	}

	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}

	public String getRaisedby() {
		return raisedby;
	}

	public void setRaisedby(String raisedby) {
		this.raisedby = raisedby;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public static void getHighestPriorityTicket(MyClass1 m[], String nm) {
		int minval = 5;
		int flag = 0;
		for (int j = 0; j < 4; j++) {
			if (m[j].getProject().equals(nm)) {
				if (m[j].getPriority() < minval) {
					minval = m[j].getPriority();
					flag += 1;
				}
			}

		}
		if (flag != 0) {
			for (int i = 0; i < 4; i++) {
				if (m[i].getProject().equals(nm)) {
					if (m[i].getPriority() == minval) {
						System.out.println(m[i].getTicketno());
						System.out.println(m[i].getRaisedby());
						System.out.println(m[i].getAssignedTo());
					}
				}
			}
		} else {
			System.out.println("No such Ticket");
			
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyClass1[] m = new MyClass1[4];

		for (int i = 0; i < 4; i++) {
			int tno = sc.nextInt();
			sc.nextLine();
			String rb = sc.nextLine();
			String at = sc.nextLine();
			int pr = sc.nextInt();
			sc.nextLine();
			String pj = sc.nextLine();
			m[i] = new MyClass1(tno, rb, at, pr, pj);
		}
		String name = sc.nextLine();

		getHighestPriorityTicket(m, name);

	}

}
