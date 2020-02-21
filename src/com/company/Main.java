package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ar[][] = new int [n][n];
        int ar_new[][] = new int[n][n];
        // Генерируем
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                ar[i][j] = - n + (int)(Math.random() * (2 * n + 1));
            }
        }
        // Вывод
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Формируем транспонированную матрицу
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                ar_new[i][j] = ar[j][i];
            }
        }
        // Вывод
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(ar_new[i][j] + " ");
            }
            System.out.println();
        }

    }

}