package javaprog;

import java.util.Scanner;

public class MyClass {
	
	private int beachid;
	private String beachName;
	private String location;
	private String beachType;
	private int rating;
	private int avgVisitorsPerDay;
	
	MyClass(int beachid,String beachName,String location,String beachType,int rating,int avgVisitorsPerDay){
		this.beachid=beachid;
		this.beachName=beachName;
		this.location=location;
		this.beachType=beachType;
		this.beachType=beachType;
		this.rating=rating;
		this.avgVisitorsPerDay=avgVisitorsPerDay;
	}
	

	public int getBeachid() {
		return beachid;
	}


	public void setBeachid(int beachid) {
		this.beachid = beachid;
	}


	public String getBeachName() {
		return beachName;
	}


	public void setBeachName(String beachName) {
		this.beachName = beachName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getBeachType() {
		return beachType;
	}


	public void setBeachType(String beachType) {
		this.beachType = beachType;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public int getAvgVisitorsPerDay() {
		return avgVisitorsPerDay;
	}


	public void setAvgVisitorsPerDay(int avgVisitorsPerDay) {
		this.avgVisitorsPerDay = avgVisitorsPerDay;
	}
	
	/*@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s",this.beachid,this.beachName,this.location,this.beachType,this.rating,this.avgVisitorsPerDay);
	}
	*/
	
	public static  int getbeach(MyClass c[]) {
		int minval = c[0].getRating();
		for(int i =0;i<4;i++) {
			if(c[i].getRating() < minval) {
				minval= c[i].getRating();
			}
		}
		return minval;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MyClass[] c = new MyClass[4];
		for(int i=0;i<4;i++) {
			int bid = sc.nextInt();
			sc.nextLine();
			String bnm = sc.nextLine();
			String loc = sc.nextLine();
			String bty = sc.nextLine();
			int rt = sc.nextInt();
			int avgc = sc.nextInt();
			c[i] = new MyClass(bid,bnm,loc,bty,rt,avgc);
		}
		
		System.out.println(getbeach(c));
		
	}

}
