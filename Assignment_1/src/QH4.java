public class QH4 {
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] c = new double[a.length][b.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        double[][] a = {{1,2},{3,4}};
        double[][] b = {{1,2},{3,4}};
        double[][] c = addMatrix(a, b);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
