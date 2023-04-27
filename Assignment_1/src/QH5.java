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
        int maxRow = 0;
        int maxRowOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowOnes = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    rowOnes++;
                }
            }
            if (rowOnes > maxRowOnes) {
                maxRow = i;
                maxRowOnes = rowOnes;
            }
        }
        System.out.println("Row with the most 1s: " + maxRow);
        int maxCol = 0;
        int maxColOnes = 0;
        for (int j = 0; j < arr[0].length; j++) {
            int colOnes = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] == 1) {
                    colOnes++;
                }
            }
            if (colOnes > maxColOnes) {
                maxCol = j;
                maxColOnes = colOnes;
            }
        }
        System.out.println("Column with the most 1s: " + maxCol);
    }
}
