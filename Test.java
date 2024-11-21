public class Test {
    int arr[];
    public static void main(String[] args){
        m();
        m(10,20);
        m(30,60,29);
    }
    // public static void m(int... x){
    //     int total = 0;
    //     for(int i = 0;i < x.length;i++){
    //         total += x[i];
    //     }
    //     System.out.println(total);
    // }
    public static void m(int ...y){
        System.out.println("output");
    }
}
