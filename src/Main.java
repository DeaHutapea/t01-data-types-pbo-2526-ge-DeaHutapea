import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tipe = sc.next(); // Soal1, Soal2, dst

        switch (tipe) {

            // ================= SOAL 1 =================
            case "Soal1":

                int a = sc.nextInt();
                int b = sc.nextInt();

                int sum = a + b;

                if ((a > 0 && b > 0 && sum < 0) ||
                    (a < 0 && b < 0 && sum > 0)) {
                    System.out.println("OVERFLOW");
                } else {
                    System.out.println(sum);
                }
                break;

            // ================= SOAL 2 =================
            case "Soal2":

                float f1 = sc.nextFloat();
                float f2 = sc.nextFloat();

                double d1 = (double) f1;
                double d2 = (double) f2;

                float floatSum = f1 + f2;
                double doubleSum = d1 + d2;

                double diff = Math.abs(floatSum - doubleSum);

                System.out.printf("%.6f", diff);
                break;

            // ================= SOAL 3 =================
            case "Soal3":

                int n = sc.nextInt();

                Integer objA = Integer.valueOf(n);
                Integer objB = objA;

                objA = objA + 1;

                System.out.println("==: " + (objA == objB));
                System.out.println("equals: " + objA.equals(objB));
                break;

            // ================= SOAL 4 =================
            case "Soal4":

                String s = sc.next();

                String strA = s;
                String strB = new String(s);

                strA = strA + "X";

                System.out.println("==: " + (strA == strB));
                System.out.println("equals: " + strA.equals(strB));
                break;

            // ================= SOAL 5 =================
            case "Soal5":

                int integer = sc.nextInt();
                double dbl = sc.nextDouble();
                boolean bool = sc.nextBoolean();

                double result = integer * dbl;

                if (!bool) {
                    result *= -1;
                }

                System.out.printf("%.2f", result);
                break;
        }

        sc.close();
    }
}
