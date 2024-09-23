public class Student {
    private int studentId;
    private String name;
    private float theoryScore;
    private  float practicalScore;

    public Student(){
        this.studentId = 0;
        this.name = "";
        this.theoryScore = 0.0f;
        this.practicalScore = 0.0f;
    }

    public Student(int studentId, String name, float theoryScore, float practicalScore){
        this.studentId = studentId;
        this.name = name;
        this.theoryScore = theoryScore;
        this.practicalScore = practicalScore;
    }

    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public float getTheoryScore(){
        return theoryScore;
    }
    public void setTheoryScore(float theoryScore){
        this.theoryScore = theoryScore;
    }

    public float getPracticalScore(){
        return practicalScore;
    }
    public void setPracticalScore(float practicalScore){
        this.practicalScore = practicalScore;
    }

    public float calculateAverage(){
        return (theoryScore + practicalScore) / 2;
    }

    @Override
    public String toString() {
        return String.format("Student ID: %d\nName: %s\nTheory Score: %.2f\nPractical Score: %.2f\nAverage Score: %.2f",
                studentId, name, theoryScore, practicalScore, calculateAverage());
    }

}
