import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(h(1.1));
        double rp, rk, z;
        int n;
        System.out.print("rp = ");rp = scan.nextDouble();
        System.out.print("rk = ");rk = scan.nextDouble();
        System.out.print("n = ");n = scan.nextInt();

        double dr = (rk - rp) / n;

        double r = rp;
        while (r <= rk){
            z = h(r + 1) + Math.pow(h(r * r + 1), 2) + 1;
            System.out.println("z = " + z + ", r = " + r + "; ");
            r += dr;
        }
    }

    static double h(double x) {
        if (Math.abs(x) >= 1) {
            return (Math.cos(x) + 1) / Math.exp(x);
        } else {
            double S = 1;
            int n = 0;
            double a = 1;
            S = S * (1 / (Math.sin(x*x))) * a;
            do {
                n++;
                double R = (Math.pow(x, 4 * n - 2)) / (((2 * n + 1) - 4) * ((2 * n + 1) - 3) * ((2 * n + 1) - 2) * ((2 * n + 1) - 1) * (2 * n + 1));
                a *= R;
                S += a;
            } while (n < 6);
            return S;
        }
    }
}