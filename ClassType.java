package javaprog;

class Userdefined<T>{
	
	private T inp;
	
	public Userdefined(T inp) {
		this.inp=inp;
	}
	
	public T geddata() {
		return this.inp;
	}
	
}

public class ClassType {
	public static void main(String[] args) {
		Userdefined <String> x  = new Userdefined("User---Defined");
		System.out.println(x.geddata());
		
		Userdefined <Double> y  = new Userdefined(7.7787);
		System.out.println(y.geddata());
	}

}
