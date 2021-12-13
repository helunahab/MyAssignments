
public class Assig4Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X[][] = {
				 {1,2,3},
				 {3,4,5},
				 {6,7,8}
		 };
		 int Y[][]= {
				 {4,5,6},
				 {2,4,3},
				 {1,3,5}
		 };
		 
		 int Z[][]=new int[3][3]; ////3 rows and 3 columns  
		 for (int i = 0; i < 3; i++) {  //row
			 for (int j = 0; j < 3; j++) {//col
				 Z[i][j]=0;
				for(int k=0;k<3;k++) {  //k depends on number of col
					Z[i][j]+= X[i][k]*Y[k][j]; 
				}
					System.out.print(Z[i][j] + "");	
					}
				
			             System.out.println();	
				}
	}

}
