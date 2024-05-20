package com.String;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountUsinMap {

	public static void main(String[] args) {
		String str="NoorJahan";
		str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(i->i.getValue()>1).forEach(i->{
		System.out.println(i.getKey());
		});
	}

}
