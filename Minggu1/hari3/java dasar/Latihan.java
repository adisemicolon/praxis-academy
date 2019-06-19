import java.util.Scanner;

class Latihan{
	
	public static void main(String[] args) {
		array();
	}

	static void unaryoperator(){
		int x = 10;
        int y = 20;
 
        int result = +x;
 
        System.out.println("+x = " + result);
 
        result = -y;
 
        System.out.println("-y = " + result);
 
        result = x++;
 
        System.out.println("++x = " + result);
 
        result = y--;
 
        System.out.println("--y = " + result);
 
        boolean ok = false;
 
        System.out.println(ok);
 
        System.out.println(!ok);
	}

	static void relational(){
		  int x = 10;
        int y = 20;
 
        boolean result = x == y;
 
        System.out.println("x == y? " + result);
 
        result = x != y;
 
        System.out.println("x != y? " + result);
 
        result = x > y;
 
        System.out.println("x > y? " + result);
 
        result = x >= y;
 
        System.out.println("x >= y? " + result);
 
        result = x < y;
 
        System.out.println("x < y? " + result);
 
        result = x <= y;
 
        System.out.println("x <= y? " + result);
	}

	static void conditional(){
		int x = 10;
        int y = 20;
 
        int result = (x > 10) ? x : y;
 
        System.out.println("result 1 is: " + result);
 
        result = (y > 10) ? x : y;
 
        System.out.println("result 2 is: " + result);
	}

	static void loops(){
		int a = 1;
			for (int i=0; i < 3; i++){
        		System.out.println("Knock");
        		while (a<=3){
					System.out.println("out");
					a++;
				}
			}
			System.out.println("Penny!");
	}

	static void array(){
		int i =0;
		Scanner scan = new Scanner(System.in);
		String [] orang = new String[10];
		for(i = 0 ; i<orang.length;i++){
			orang[i]= scan.nextLine();
		}
	
		for(i=0 ;i<orang.length ; i++){
			System.out.print(orang[i]);
		}
	}
}