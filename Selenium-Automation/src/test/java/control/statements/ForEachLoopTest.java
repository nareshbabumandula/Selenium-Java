package control.statements;

public class ForEachLoopTest {

    public void forEachExample(){
        int[] Marks ={10,20,30,60,75,55};

        for(int m : Marks){
            System.out.println(m);
            if(m==60) break;
        }
        
        String[] names = {"Suma", "nikhila", "ram", "swetha"};
        for (String name : names) {
			System.out.println(name);
		}

    }

    public static void main(String[] args) {
        ForEachLoopTest flt = new ForEachLoopTest();
        flt.forEachExample();
    }

}
