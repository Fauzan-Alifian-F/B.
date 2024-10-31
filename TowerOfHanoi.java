import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah cakram: ");
        int numDisks = scanner.nextInt();


        solveTowerOfHanoi(numDisks, 'A', 'C', 'B');

        scanner.close();
    }

    // Fungsi rekursif untuk menyelesaikan puzzle Tower of Hanoi
    public static void solveTowerOfHanoi(int numDisks, char source, char destination, char auxiliary) {
        if (numDisks == 1) {
            System.out.println("Pindahkan cakram 1 dari " + source + " ke " + destination);
        } else {
            // Pindahkan n-1 cakram dari sumber ke penolong
            solveTowerOfHanoi(numDisks - 1, source, auxiliary, destination);

            // Pindahkan cakram terbesar dari sumber ke tujuan
            System.out.println("Pindahkan cakram " + numDisks + " dari " + source + " ke " + destination);

            // Pindahkan n-1 cakram dari penolong ke tujuan
            solveTowerOfHanoi(numDisks - 1, auxiliary, destination, source);
        }
    }
}