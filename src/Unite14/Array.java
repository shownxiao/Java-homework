package Unite14;
/* 基础训练1 */
public class Array<T> {
    private T obj[];
    public Array(T obj[]){
        this.obj = obj;
    }
    void output(){
        for(int k = 0; k < obj.length; k++){
            System.out.print(" "+obj[k]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        String a[] = {"good", "bad", "bye", "fine"};
        Array<String> x1 = new Array<String>(a);
        x1.output();
        Integer b[] = {1, 6, 3, 7, 2};
        Array<Integer> x2 = new Array<Integer>(b);
        x2.output();
    }
}
