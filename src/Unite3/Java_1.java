package Unite3;
/* 编程练习1 */
public class Java_1 {
    public static void main(String args[]){
        String output = "";
        nextRow:
            for(int row = 1; row <= 5; row ++) {
                output += "\n";
                for(int column = 1; column <= 10; column++){
                    if(column > row){
                        continue nextRow;
                    }
                    output += "* ";
                }
            }
        System.out.println(output);
    }
}
