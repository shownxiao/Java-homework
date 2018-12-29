package Unite9;
/* 基础训练2 */
public class MyException extends Exception{
    public String toString(){
        return "异常啦";
    }
    public static void method()throws MyException{
        throw new MyException();
    }
    public static void main(String a[]){
        try{
            method();
            System.out.println("这里执行不到");
        }
        catch (MyException e){
            System.out.println(e);
        }
        System.out.println("这里要执行");
    }
}

