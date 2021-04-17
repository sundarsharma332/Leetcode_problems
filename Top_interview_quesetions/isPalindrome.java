import java.util.*;
import java.io.*;

class isPalindrome 
{
	static StringBuilder ab = new StringBuilder();
	static HashSet<Integer> a = new HashSet<Integer>();
	static HashMap<Integer , Integer> hash_map = new HashMap<Integer , Integer>();
	static ArrayList list = new ArrayList();

	static void swap(int a , int b){
		int temp = a;
		b = a;
		a = temp;
	}

	static void printarray(int arr[] ){
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	static void printchar(char arr[] ){
		for(char i : arr){
			System.out.print(i);
		}
		System.out.println();
	}

	static void pstring(String s){
		System.out.println(s);
	}
	static void printinteger(int a){
		System.out.print(a + " ");
	}

	static void ps(int flag){
		if(flag == 1){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}

	static boolean isPalindrome(int num) {
		if(num < 0 && (num % 10 == 0 && num != 0)) return false;
		
		int rev = 0;
		int copy  = num;
		while(num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		return rev == copy;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		if(isPalindrome(n)){
			ps(1);
		}else{
			ps(0);
	}
 }
}