public class QH1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if(a+b==c && a==b-c && a*b==c){
            System.out.println("Yes, the given arithmetic formulas can be applied for the given command line inputs.");
        }
    }
}
