package com.te.javaeight.collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainStudent {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
        
		studentList.add(new Student("Paul", 11, "Economics", 78.9));
		studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
		studentList.add(new Student("Harish", 13, "History", 83.7));
		studentList.add(new Student("Xiano", 14, "Literature", 71.5));
		studentList.add(new Student("Soumya", 15, "Economics", 77.5));
		studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
		studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
		studentList.add(new Student("Mitshu", 18, "History", 73.5));
		studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
		studentList.add(new Student("Harry", 20, "History", 71.9));
		
		
		System.err.println("Collecting top 3 performing students into List");
		int a=3;
		List<Student> collect = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(a)
		.collect(Collectors.toList());
		System.out.println(collect);
		
		System.err.println("Collecting subjects offered into Set.");
	Set<String> subjects = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
		System.out.println(subjects);
		
		System.err.println("Collecting name and percentage of each student into a Map");
		Map<String,Double> namePercentage = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
		System.out.println(namePercentage);
		
		System.err.println("Collecting first 3 students into LinkedList");
		LinkedList<Student> students = studentList.stream().limit(a).collect(Collectors.toCollection(LinkedList::new));
		System.out.println(students);
		
		
		System.err.println("");
	}
	
}
