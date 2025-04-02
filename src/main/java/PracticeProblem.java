public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(towerOfHanoi(4));
	}
static int n = -1;
	public static int towerOfHanoi(int num){
		if(num<3&& n == -1){
return -1;
		}
		n = n+1;
if (num==1){
	return 1;
}
{
return 2*towerOfHanoi(num-1)+1;
}
	}
}