package com.default1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		//Formula Impl
		
		
		//System.out.println(formula.sqrt(100));
		
		//Lambda Expressions
		
		List<String> names=Arrays.asList("hi","anna","nilesh","mike","kannan");
		Collections.sort(names,( a,  b)->{
			return a.compareTo(b);
		});
		System.out.println(names);
		
		//Formula lambda
		Formula lambdaFormula=Math::sqrt;
		System.out.println(lambdaFormula.calculate(200));
		
		//Constructor Reference
		PersonFactory<Person> person1=Person::new;
		Person person=person1.create("Nagaraju", "Makkena");
		
		
		
	}
}
