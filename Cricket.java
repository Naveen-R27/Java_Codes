package javaprog;

import java.util.Arrays;
import java.util.Scanner;

public class Cricket {
	private int cricketid;
	private String cricketername;
	private int jercyno;
	private String group;
	private String type;
	
	Cricket(int cricketid,String cricketername,int jercyno,String group,String type){
		this.cricketid=cricketid;
		this.cricketername=cricketername;
		this.jercyno=jercyno;
		this.group=group;
		this.type=type;
		
		
	}

	public int getCricketid() {
		return cricketid;
	}

	public void setCricketid(int cricketid) {
		this.cricketid = cricketid;
	}

	public String getCricketername() {
		return cricketername;
	}

	public void setCricketername(String cricketername) {
		this.cricketername = cricketername;
	}

	public int getJercyno() {
		return jercyno;
	}

	public void setJercyno(int jercyno) {
		this.jercyno = jercyno;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public static void findCrickterWithMinjercyNo(Cricket c[],String group,String type) {
		int a[]=new int[2];
		int temp;
		for(int i=0;i<2;i++) {
			if(c[i].getGroup().equals(group)) {
				a[i]=c[i].getJercyno();
			}
			
		}
		for(int i =0;i<2;i++) {
			System.out.println(a[i]);
		}
		if(a[0] != 0 && a[1] != 0) {
			Arrays.sort(a);
			System.out.println("Min val"+a[0]);
		}
		else {
			System.out.println("There is no such player !");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cricket[] c = new Cricket[2];
		for(int i=0;i<2;i++) {
			int cid= sc.nextInt();
			sc.nextLine();
			String cn =sc.nextLine();
			int jc= sc.nextInt();
			sc.nextLine();
			String gp = sc.nextLine();
			String tp = sc.nextLine();
			c[i] = new Cricket(cid,cn,jc,gp,tp);
		}
		String grp = sc.nextLine();
		String typ = sc.nextLine();
		
		findCrickterWithMinjercyNo(c,grp,typ);
	}

}
