package szxy.day008;

public class 不及格异常 {
    public static void main(String[] args) {
        Student s1=new Student(50,60,60);
        try{
            System.out.println(s1.getScore());
            if (s1.getScore()<60)
                throw new FailException("你的总评成绩不及格");
        }catch (FailException e){
            System.out.println(e.toString());
        }
    }
}
class Student{
    private double regularGrade;
    private double experimentGrade;
    private double finalGrade;
    Student(double a,double b,double c){
        this.regularGrade=a;
        this.experimentGrade=b;
        this.finalGrade=c;
    }
    double getScore(){
        double score=regularGrade*0.2+experimentGrade*0.2+finalGrade*0.6;
        return score;
    }
}
class FailException extends Exception{
    String message;
    FailException(String message){
        this.message=message;
    }
    public String toString (){
        return message+"本门课程未通过";
    }
}