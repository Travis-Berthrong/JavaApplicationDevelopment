package java8lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    private int id;
    private String name;
    private int age;

    public StreamExamples(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<StreamExamples> students = new ArrayList<StreamExamples>();
        students.add(new StreamExamples(1, "Name1", 10));
        students.add(new StreamExamples(4, "Name4", 40));
        students.add(new StreamExamples(5, "Name5", 50));
        students.add(new StreamExamples(3, "Name3", 30));
        students.add(new StreamExamples(2, "Name2", 20));


        students.stream().filter((student) -> student.age > 30).forEach((student) -> System.out.println(student.name));

        List<String> studentNames = students.stream()
                            .filter((student) -> student.age > 20)
                            .sorted((student1, student2) -> Integer.compare(student1.age, student2.age))
                            .map((student) -> student.name)
                            .collect(Collectors.toList());
    }
    
}
