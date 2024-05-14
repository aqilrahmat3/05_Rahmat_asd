import java.util.Scanner;

public class ScavengerHunt05 {
    PointGame05 head;

    public ScavengerHunt05() {
        this.head = null;
    }

    public void addPoint(String question, String answer) {
        PointGame05 newPoint = new PointGame05(question, answer);

        if (head == null) {
            head = newPoint;
        } else {
            PointGame05 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }

    public void startHunt() {
        PointGame05 current = head;
        Scanner scanner = new Scanner(System.in);

        while (current != null) {
            System.out.println("Pertanyaan: " + current.question);
            System.out.print("Jawaban anda : ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(current.answer)) {
                System.out.println();
                System.out.println("Benar! Pindah ke titik berikutnya.");
                current = current.next;
                System.out.println("*********************************************");
            } else {
                System.out.println();
                System.out.println("Jawaban salah. Silahkan Coba lagi");
            }
        }
        System.out.println();
        System.out.println("Selamat! Anda telah menemukan harta karunnya!");

        scanner.close();
    }
}