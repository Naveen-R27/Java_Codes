package javaprog;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TRIAL {
	
	public static void main(String[] args) throws Exception {
		List<Integer> list=new ArrayList<Integer>(); list.add(10); list.add(20); list.stream().map(i -> i*i ).collect(Collectors.toList());System.out.println(list); 	}
}