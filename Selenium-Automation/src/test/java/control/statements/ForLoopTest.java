package control.statements;

public class ForLoopTest {

	public void forLoopExample(){
		for (int i=0;i<10;i++){ // i value will become 2
			System.out.println("Iteration is : " + i); //Iteration is 0
		}
	}

	public void sumOfNumbersExample(){
		int sum=0;
		for (int i=0;i<10;i++){
			sum=sum+i;
		}
		System.out.println("Sum of numbers is : " + sum);
	}

	public void evenOddExample(int num){
		for(int i=1; i<=num;i++){
			if (i%2==0){
				System.out.println(i + " : is an even number");
			}else{
				System.out.println(i + " : is an odd number");
			}
		}
	}

	public static void main(String[] args) {
		ForLoopTest flt = new ForLoopTest();
		flt.forLoopExample();
		flt.sumOfNumbersExample();
		flt.evenOddExample(100);
	}
}


