package wwww;
//�ݹ���׳�
//��N�Ľ׳�,��5�Ľ׳�Ϊ��
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
