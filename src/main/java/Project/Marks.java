package Project;

public abstract class Marks {
    //We have to calculate the average of marks obtained in three subjects by
    //student A and by student B. Create class 'Marks' with an abstract method
    //'getPercentage' that will return the average percentage of marks. Provide
    //implementation of abstract methods in classes 'A' and 'B'. The constructor of
    //student A takes the marks in three subjects as its parameters and the marks
    //in four subjects as its parameters for student B. Test your cod
    abstract double getPercentage();
    }

class studentA extends Marks{
    private double mathMark,historyMark,englishMark;
public studentA(double mathMark, double historyMark, double englishMark){
    this.mathMark=mathMark;
    this.historyMark=historyMark;
    this.englishMark=englishMark;
        }
        public double getPercentage(){
    double average=(mathMark+historyMark+englishMark)/3;
            System.out.println("Average mark for student A is: "+average);
    return average;
        }
}
class studentB extends Marks{
    private double mathMark,historyMark,englishMark,geographyMark;

    public studentB(double mathMark, double historyMark, double englishMark, double geographyMark) {
        this.mathMark = mathMark;
        this.historyMark = historyMark;
        this.englishMark = englishMark;
        this.geographyMark = geographyMark;
    }
    public double getPercentage(){
        double average=(mathMark+historyMark+englishMark+geographyMark)/4;
        System.out.println("Average mark for student B is: "+average);
        return average;
    }
}
class Tester{
    public static void main(String[] args) {
        studentA stA=new studentA(98,89,98);
        stA.getPercentage();
        studentB stB=new studentB(89,98,93,99);
        stB.getPercentage();
    }
}
