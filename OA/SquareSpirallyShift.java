//amazon OA 2 questions, NO.1; from 1point3acres
public class SquareSpirallyShift {
	public static void main(String[] args) {
		int[][] mat = new int[][]{{1,2},{4,5}};
		int[][] rst = shift(mat, 2);
		if(!isSquare(mat)) {
			System.out.println("ERROR");
		} else {
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.print(rst[i][j]);
				}
			System.out.println();
			}
		}	
	}
		
	public static boolean isSquare(int[][] mat) {
		if(mat.length == mat[0].length) {
			return true;
		}
		return false;
	}
	
	public static int[][] shift(int[][] mat, int m) {
		int tmp = mat[1][0];
		int col = m;
		int row = m;
		int x = 0;
		int y = 0;
		
		while(col > 0 && row > 0) {
			for(int i = 0; i < col-1; i++) { //first row
				int t = tmp;
				tmp = mat[x][y];
				mat[x][y] = t;
				y++;
			}
			
			for(int i = 0; i < row-1; i++) { //most right col
				int t = tmp;
				tmp = mat[x][y];
				mat[x][y] = t;
				x++;
			}
			
			for(int i = 0; i < row - 1; i++) {
				int t = tmp;
				tmp = mat[x][y];
				mat[x][y] = t;
				y--;
			}
			
			for(int i = 0; i < col -1; i++) {
				int t = tmp;
				tmp = mat[x][y];
				mat[x][y] = t;
				x--;
			}
			
			x++;
			y++;
			col -= 2;
			row -= 2;
		}
		return mat;
	}
}