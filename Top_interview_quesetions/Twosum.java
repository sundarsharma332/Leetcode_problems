import java.util.*;
import java.io.*;

class Twosum 
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

	// returns string
	// tc : 0(n^2) sc : 0(1);
	static int[] TwoSumNaive(int a[] , int target){
		int temp[] = new int[2];
		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] + a[j] == target){
					temp[0] = i;
					temp[1] = j;
				}
			}
		}
		return temp;
	
	}
	// tc : 0(n) sc : 0(1);
	static int[] TwoSumOptimal(int a[] , int target){
		int temp[] = new int[2];
		for(int i = 0 ; i < a.length; i++){
			int c = target - a[i];
			if(hash_map.containsKey(c)) {
				temp[0] = hash_map.get(c);
				temp[1] = i;

			}
			hash_map.put(a[i] , i );
		}
		return temp;

	
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i < a.length; i++){
			a[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		int [] ans1 = TwoSumNaive(a , t);
		int [] ans2 = TwoSumOptimal(a , t);
		printarray(ans1);
		printarray(ans2);
	}
}