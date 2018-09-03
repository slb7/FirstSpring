package com.whatever.FirstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.*;

@SpringBootApplication
public class FirstSpringApplication {

	public static Map<String,ArrayList<EarningsData>> map = new HashMap <>();
	public static void main(String[] args) {
		ArrayList <EarningsData> al = new ArrayList <>();
		try {
			Scanner s = new Scanner(new File("/tmp/cb.csv"));
			boolean first = true;
			while (s.hasNextLine()) {
				if(first) {
					first = false; //skip heading line
					s.nextLine();
				}
				else {
					Scanner s1 = new Scanner(s.nextLine()).useDelimiter(",");
					ArrayList<String> sal = new ArrayList <>();
					while(s1.hasNext())
						sal.add(s1.next());
					String sa[] = new String[sal.size()];
					sal.toArray(sa);
					al.add(new EarningsData(sa));
					//al.add(s.nextLine());
				}
			}
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		for(EarningsData e : al){
			if(!map.containsKey(e.symbol)){
				map.put(e.symbol,new ArrayList <>());
			}
			map.get(e.symbol).add(e);
		}
		SpringApplication.run(FirstSpringApplication.class, args);
	}
}
