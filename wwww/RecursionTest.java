package wwww;
//递归求阶乘
//求N的阶乘,以5的阶乘为例
// 5*4*3*2*1
public class RecursionTest {

	static int n=5;
	public static void main(String[] args) {
		   System.out.println(m(n));
	}
	public static int m(int n){
		if(n==1){
			return 1;
		}
		return n*m(n-1);
	}

}
