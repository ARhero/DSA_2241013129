public class QH5 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int counterrow=1,countercolumn=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                double val = Math.random();
                if (val>0.5) {
                    val = 1;
                }
                arr[i][j] = (int)val;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
            }
        }
    }
}
