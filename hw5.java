package practice;

public class hw5 {
	public static void main(String[] args) {
	
		int[][] scores = new int[2][3];
		for(int i=0; i<2; i++) {
			for(int k=0; k<3; k++) {
				System.out.println("scores[" + i + "][" + k + "]="
			+scores[i][k]);
				
				
			}
		}
	
	System.out.println();
	int[][] englishscores = new int[2][];
	englishscores[0] = new int[2];
	englishscores[1] = new int[3];
	for(int i=0; i<2; i++) {
		for(int k=0; k<englishscores[i].length; k++) {
			System.out.println("englishscores[" + i + "][" + k + "]="
		+englishscores[i][k]);
			
			
		}
	}
	
	System.out.println();
	
	int[][] javaScores = {{95,80},{92,96,80}};
	
	for(int i=0; i<2; i++) {
		for(int k=0; k<javaScores[i].length; k++) {
			System.out.println("javaScores[" + i + "][" + k + "]="
		+javaScores[i][k]);
			
			
		}
	}
	
	}
}

