package Unite9;
/* 编程练习1 */
public class Java_1 {
    public static void main(String args[]){
        String className;
        if(args.length > 0){
            className = args[0];
        }
        else {
            className = "java.lang.Name";
        }
        try {
            Class c = Class.forName(className);
            System.out.println(className+"是Java类库中已有的类.");
        }catch (ClassNotFoundException e){
            System.out.println(className+"不在Java类库中。");
        }
    }

}
