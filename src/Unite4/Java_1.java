package Unite4;
/* 编程练习1 */
public class Java_1 {
    static int grades[][] = {{77, 68, 86, 73},
                            {96, 87, 89, 81},
                            {70, 90, 86, 81}};
    static int students, exams;
    static String output;
    public static void main(String args[]){
        students = grades.length;
        exams = grades[0].length;
        output += "\n最高分:" + maximum() + "\n";
        for(int i = 0; i < students; i++){
            output += "\n学生的平均分" + i + "组是" + average(grades[i]);
        }
        System.out.println(output);
    }
    public static int maximum(){
        int highGrade = 0;
        for(int i = 0; i < students; i++){
            for(int j = 0; j < exams; j++){
                if(grades[i][j] > highGrade){
                    highGrade = grades[i][j];
                }
            }
        }
        return highGrade;
    }
    public static double average(int setOfGrades[]){
        int total = 0;
        for(int i = 0; i < setOfGrades.length; i++){
            total += setOfGrades[i];
        }
        return (double)total/setOfGrades.length;
    }
}
