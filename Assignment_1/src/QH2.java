import java.util.Scanner;

public class QH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = new String[5];
   
        int numLines = 0;
        while (numLines < lines.length) {
            String line = sc.nextLine();
            lines[numLines] = line;
            numLines++;
        }
        
        for (int i = numLines - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }
        sc.close();
    }
}
