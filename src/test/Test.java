package test;

import java.util.Scanner;

public class Test {
    private int n;
    private int i;
    private int[] a;
    private int[] b;
    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        n = sc.nextInt();
        System.out.print("i = ");
        i = sc.nextInt();
        a = new int[i];
        System.out.println("Import array a : ");
        for (int j = 0; j < i; j++) {
            a[j] = sc.nextInt();
        }
        System.out.print("Array a : ");
        for (int j = 0; j < i; j++) {
            System.out.print(a[j] + " ");
        }

    }
    public void convertB() {
        b = new int[n];
        for (int j = 0; j < n; j++) {
            if (j == 0) {
                b[j] = 0 + a[j] + a[j + 1];
            } else if (j == i - 1) {
                b[j] = a[j - 1] + a[j] + 0;
            } else if (j == i) {
                b[j] = a[j - 1] + 0 + 0;
            } else if (j > i) {
                b[j] = 0;
            } else {
                b[j] = a[j - 1] + a[j] + a[j + 1];
            }

        }
        System.out.println("");
        System.out.print("Array b : ");
        for (int j = 0; j < n; j++) {
            System.out.print(b[j] + " ");
        }
    }

    public static void main(String[] args) {
        Test test = new test.Test();
        test.insert();
        test.convertB();
    }

}
