package patterns;

public class launch {


	public static void main(String[] args){
		int n=14;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1|| i+j<=6 || j-i>=6 ||j==0||j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
		
	}

}
