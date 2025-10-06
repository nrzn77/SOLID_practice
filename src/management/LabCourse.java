package management;

public class LabCourse extends Course {
    private String labNo;
    public LabCourse(String courseID, String name, String LabNo) {
        super(courseID, name);
        this.labNo = LabNo;
    }

    public String getLabNo() {
        return labNo;
    }
    public void setLabNo(String labNo) {
        this.labNo = labNo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLab No.: " + getLabNo();
    }
}
