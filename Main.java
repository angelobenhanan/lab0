import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = scn.nextDouble();

        System.out.print("\nMasukkan berat badan (kg): ");
        double berat = scn.nextDouble();

        double bmi = berat / Math.pow((tinggi / 100), 2);

        String kategori;
        if (bmi < 18.5) {
            kategori = "Underweight";
        } else if (bmi < 25) {
            kategori = "Normal";
        } else if (bmi < 30) {
            kategori = "Overweight";
        } else if (bmi < 41) {
            kategori = "Obese";
        } else {
            kategori = "Extreme obese";
        }

        System.out.println("\nNilai BMI Anda adalah " + bmi);
        System.out.println("Anda termasuk kategori " + kategori);
    }
}
