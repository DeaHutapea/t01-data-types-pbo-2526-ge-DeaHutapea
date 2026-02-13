import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) return;

        // Membaca token pertama untuk menentukan soal mana yang dikerjakan
        String task = sc.next();

        if (task.equals("Soal1")) {
            // Soal 1: Integer Overflow Detection
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;

            // Logika deteksi overflow tanpa long/try-catch
            if ((a > 0 && b > 0 && sum < 0) || (a < 0 && b < 0 && sum > 0)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(sum);
            }

        } else if (task.equals("Soal2")) {
            // Soal 2: Float vs Double Precision
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            float fSum = (float) x + (float) y;
            double dSum = x + y;
            double diff = Math.abs(fSum - dSum);

            System.out.printf("%.6f\n", diff);

        } else if (task.equals("Soal3")) {
            // Soal 3: Primitive vs Wrapper
            int n = sc.nextInt();
            Integer a = n; // Autoboxing
            Integer b = a;
            a = a + 1; // Unboxing lalu autoboxing ke objek baru

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        } else if (task.equals("Soal4")) {
            // Soal 4: String Immutability
            String s = sc.next();
            String a = s;
            String b = new String(s);
            a = a + "X"; // String baru karena immutable

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        } else if (task.equals("Soal5")) {
            // Soal 5: Parsing & Type Safety
            int iVal = Integer.parseInt(sc.next());
            double dVal = Double.parseDouble(sc.next());
            boolean bVal = Boolean.parseBoolean(sc.next());

            double result = iVal * dVal;
            if (!bVal) {
                result *= -1;
            }

            System.out.printf("%.2f\n", result);
        }

        sc.close();
    }
}