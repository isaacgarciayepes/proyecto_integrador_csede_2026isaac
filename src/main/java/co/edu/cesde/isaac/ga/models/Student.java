
package co.edu.cesde.isaac.ga.models.;

public class Student extends Person {

    private Long teacherId;

    public Student() {
        super();
    }

    public Student(Long teacherId, Long userId, String documentType, String documentNumber, String firstName, String lastName, String status) {
        super(userId, documentType, documentNumber, firstName, lastName, status);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", userId=" + getUserId() +
                ", documentType='" + getDocumentType() + '\'' +
                ", documentNumber='" + getDocumentNumber() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }

    private String getUserId() {
    }

    private String getLastName() {
    }

    private String getFirstName() {
    }

    private String getDocumentNumber() {
    }

    private String getDocumentType() {
    }

    public void SetFirstName(String carlos) {
    }
}