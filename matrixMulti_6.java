import java.util.Scanner;

public class matrixMulti_6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Size of first matrix");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] max1 = new int[n][m];

            System.out.println("Enter element of first matrix");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    max1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter Size of second matrix");
            int n2 = sc.nextInt();
            int m2 = sc.nextInt();
            int[][] max2 = new int[n2][m2];

            System.out.println("Enter element of second matrix");
            for(int i=0;i<n2;i++){
                for(int j=0;j<m2;j++){
                    max2[i][j] = sc.nextInt();
                }
            }

            int[][] ans = new int[m][n2];

            if(m != n2){
                System.out.println("Muntiplaction not possible");
            }else{
                for(int i=0;i<n;i++){
                    for(int j=0;j<m2;j++){
                        for(int k=0;k<m;k++){
                            ans[i][j] += max1[i][k] * max2[k][j];
                        }
                    }
                }
   
                for(int i=0;i<m;i++){
                    for(int j=0;j<n2;j++){
                        System.out.print(ans[i][j] +" ");
                    }
                    System.out.println();
                }
            }
        }
       
        
    }
}
