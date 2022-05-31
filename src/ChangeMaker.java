
public class ChangeMaker {
	public static void main (String args[]) {
		int nums[] = {3,5,6,23,46,6,3,5};
		int j = Driver.simpleSearch(nums,4);
		System.out.println(j);
	Driver.squareBoard(4);
	Driver.checkerBoard(8);
	Driver.makeChange(20.0, 13.44);
}
}


class Driver {
	//2
	public static int simpleSearch (int[] nums, int value) {
		int x = 0;
		for(int i =0; i< nums.length; i++) {
			if(value  == nums[i]) {
				x = i;
				return x;
			}
		}
		return -1;
			
	}
	
	//3
	public static void squareBoard (int n) {
		for(int i =0; i< n; i++) {
			for(int j =0; j<n; j++) {
				System.out.print("# ");
			}
			System.out.println("");
		}
	}
	
	//4
	public static void checkerBoard (int n ) {
		for(int i =0; i< n; i++) {
			for(int j= 0; j<n; j++) {
				if(i%2 ==0) {
				System.out.print("# ");
				}
				if(i%2 != 0) {
					System.out.print(" #");
					}
			}
			System.out.println(" ");
		}
	}
	
	//5
	public static double convertTemp(double temp, boolean isF){
		double conversion =0.0;
		if(isF==true) {
			conversion = (temp - 32) * (9.0/5); 	
		}
		if(isF!=true) {
			conversion = (temp * (9.0/5)) +32; 	
		}
		
		return conversion;
		
	}
	
	//6
	
	//7
	public static boolean isArmstrong(int num) {
		double sum = 0;
		boolean isArmstrong = false;
		double digit = 0;
		
		
		
			while(digit>0) {
				digit = num%10;
				num=num/10;
				sum = sum + Math.pow(digit, 3.0);
			}
			if(sum == num) {
				isArmstrong = true;
			}
			return isArmstrong;
		
		
	}
	
	
	//8
	
	public static boolean contains(int[]a, int b[]) {
		boolean condition = true;
		int x =0;
		for(int i =0; i<a.length - b.length; i++) {
			for(int j =0; j<b.length; j++) {
				 x =i;
			 if(a[x] != b[j]) {
				condition = false;
			}
			if(condition = false) {
				break;
			}
			x++;
			}
			if(condition == true) {
				break;
			}
		}
		return condition;
	}
	
	
	
	
	
	//ChangeMaker APP
	public static void makeChange(double paid, double cost) {
		double IPayCent = paid *100;
		double CostCent = cost *100;
		double diffCent = IPayCent - CostCent;
	
		int denominations[] = {2000,1000,500,100,25,10,5,1};
		int count [] = new int [denominations.length];
		
		
		while(diffCent != 0) {
			for(int i =0; i<denominations.length; i++) {
				while(diffCent >=denominations[i])
			{diffCent =diffCent -denominations[i];
			count[i]++;}
		}
		}
		System.out.println("$20:    " +count[0]);	
		System.out.println("$10:    " +count[1]);	
		System.out.println("$5:     " +count[2]);	
		System.out.println("$1:     " +count[3]);
		System.out.println();
		System.out.println("25c:    " +count[4]);	
		System.out.println("10c:    " +count[5]);
		System.out.println("5c:     " +count[6]);	
		System.out.println("1c:     " +count[7]);	
	}
	
	
	
}
