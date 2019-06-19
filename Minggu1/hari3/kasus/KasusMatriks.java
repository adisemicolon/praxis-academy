import java.util.Scanner;

class KasusMatriks{
	static void noInput(){
		int matrix1[][] = new int[2][2];
        matrix1[0][0] = 5;
        matrix1[0][1] = 1;
        matrix1[1][0] = 2;
        matrix1[1][1] = 6;

        int matrix2[][] = new int[2][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 4;
        matrix2[1][1] = 2;

        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int elem = matrix1[i][j] + matrix2[i][j]; 
                System.out.print( elem + " ");
            }       
            System.out.println();
        }
	}
	static void input(){
	  int baris, kolom, i, j;
      Scanner in = new Scanner(System.in);

      System.out.print("Masukkan Jumlah Baris :"); baris = in.nextInt();
      System.out.print("Masukkan Jumlah Kolom :");kolom  = in.nextInt();
 
      int   A[][] = new int[baris][kolom];
      int   B[][] = new int[baris][kolom];
      int sum[][] = new int[baris][kolom];
 
      System.out.println("\nMasukkan elemen untuk Matriks A");
      System.out.println("=======================");
      for (  i = 0 ; i < baris ; i++ )
      {
        for ( j = 0 ; j < kolom ; j++ )
        {
         System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
         A[i][j] = in.nextInt(); 
        }
            
      }
         
      System.out.println("\nMasukkan elemen untuk Matriks B");
      System.out.println("=======================");
      for ( i = 0 ; i < baris ; i++ )
      {
       for (j = 0 ; j < kolom ; j++ )
       {
         System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
         B[i][j] = in.nextInt(); 
       }
           
       
      }
         
      for ( i = 0 ; i < baris ; i++ )
      {
        for ( j = 0 ; j < kolom ; j++ )
        {
         sum[i][j] = A[i][j] + B[i][j];  
           }  
      }
        
 
      System.out.println("\nHasil Penjumlahan Matriks");
      System.out.println("=======================");
      for ( i = 0 ; i < baris ; i++ )
      {
         for ( j = 0 ; j < kolom ; j++ )
         {
             System.out.print(sum[i][j]+"\t");
         }
            
         System.out.println();
      }
	}
	public static void main(String[] args) {
		System.out.println("noInput");
		noInput();
		System.out.println("Input");
		input();
	}
}