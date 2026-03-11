package co.edu.cesde.isaac.app;

import co.edu.cesde.isaac.ga.models.Person;
import co.edu.cesde.isaac.ga.models.Student;
import co.edu.cesde.isaac.ga.models.Teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person.setFirstName("Jose");
        person.getFirstName();
        person2.setFirstName("Maria");
        person2.getFirstName();
        person3.setFirstName("Juan");
        person3.getFirstName();


        Person person4 = new Person(1L, "001", "123456789", "Jose", "Perez","vasquez@gmail.com", true);
        person.getFirstName();

        system.out.println(person.toString());
        system.out.println(person2.toString());
        system.out.println(person3.toString());
        system.out.println(person4.toString());

        Student student = new Student();
        student.setFirstName("Andres");
        student.setBirthDate("01/01/2000");
        System.out.println(student.toString());

        Teacher teacher =  new Teacher();
        teacher.setFirstName("Carlos");
        System.out.println(teacher.toString());

        Student student2 = new Student(2L, "002", "987654321", "Ana", "Gomez", "@gmail.com", true, "02/02/2001");
        System.out.println(student2.toString());

        Teacher teacher2 = new Teacher (3L, "003", "456789123", "Luisa", "Martinez", "@gmail.com", true);
        System.out.println(teacher2.toString());
    }

}

