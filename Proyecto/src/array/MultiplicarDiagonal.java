package array;

public class MultiplicarDiagonal {
	public static void main(String[] args) {
		
		int[][] diagonal = {{1,2,3}, {4, 5, 6}, {7,8,9}};
		int acum = 1;
		for(int i =0; i< diagonal.length; i++) {
			acum *= diagonal[i][i];
		}
		
			
			for(int i =0; i<diagonal.length; i++) {
				for(int j =0; j < diagonal[i].length; j++) {
					System.out.print(diagonal[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println(acum);
					
		}
		
	}
