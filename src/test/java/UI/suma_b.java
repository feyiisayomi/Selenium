package UI;

public class suma_b extends variables {

    public int sum(){
        int sum= a+b;
        return sum;
    }

    public static void main(String[] args){
        suma_b method_one = new suma_b();
        System.out.println(method_one.sum());
    }

}
