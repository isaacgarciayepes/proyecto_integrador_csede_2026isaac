package co.edu.cesde.isaac.repositorio.;
import co.edu.cesde.isaac.ga.models.Student;

import java.util.List;

public interface StudentRepository {
    StudentRepository create(Student student);

    boolean delete(long studentId);
    boolean update(Student studentsUpdate);
    Student findBy(long studentsId);
    boolean findDocumentNumber(String documentNumber);
    List<Student>  findAll();
    boolean existsById(Long studentId);


}