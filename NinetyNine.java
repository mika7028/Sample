
public class NinetyNine {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=1; i<=9; i++){
	         for(int j=1; j<=9; j++){
	            int val = i * j;
	            if(val<10){
	               System.out.print( " " + val +"|");
	            }else{
	               System.out.print( val +"|" );
	            }
	         }
	         System.out.println("");
	      }

	}

}
