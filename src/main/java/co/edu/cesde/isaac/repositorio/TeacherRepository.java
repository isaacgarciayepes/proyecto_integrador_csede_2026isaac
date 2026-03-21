package co.edu.cesde.isaac.repositorio;

import co.edu.cesde.isaac.ga.models.Teacher;

import java.util.List;

public interface TeacherRepository {
    StudentRepository create(Teacher student);

    boolean delete(long studentId);
    boolean update(Teacher studentsUpdate);
    Teacher findBy(long teacherId);
    boolean findDocumentNumber(String documentNumber);
    List<Teacher>  findAll();
    boolean existsById(Long teacherId);


}