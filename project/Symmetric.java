package project;

import java.util.*;
public class Symmetric
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,i = 0,j = 0;
        System.out.println("Enter the rows and colunmns : ");
        n = sc.nextInt();
        int A[][] = new int[n][n];
        for(i = 0;i < n;i++)
        {
            for(j = 0;j < n;j++)
            {
                System.out.println("Enter the value of first array : ");
                A[i][j] = sc.nextInt();
            }
        }
        int flag = 1;
        for(i = 0;i < n;i++)
        {
            for(j = 0;j < n;j++)
            {
                if(A[i][j] != A[j][i])
                    flag = 0;
            }
        }
        System.out.println("The new matrix : ");
        for(i = 0;i < n;i++)
        {
            for(j = 0;j < n;j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        if(flag == 1)
            System.out.println("Sysmmetric matrix.");
        else
            System.out.println("Not a sysmmetric matrix.");    
    }
}
