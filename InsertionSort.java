package sortingAlgorithms;
import java.util.Scanner;

public class InsertionSort {
	public void insertion(int[] unsortedArray,int size){
		
		int i,j,sayi;
		for(i=1;i<size;i++){
			sayi=unsortedArray[i];
			for(j=i-1;j>=0&& sayi<=unsortedArray[j];j--)
				unsortedArray[j+1]=unsortedArray[j];
			unsortedArray[j+1]=sayi;
		}	
		for(i=0;i<size;i++){
			System.out.println(i+".eleman="+unsortedArray[i]+" ");
		};
	}
	public void letterInsertion(String s){
		int size=s.length(),i,j,sayi;
		char c;
		System.out.println(size);
		char[] string=new char[size-1];
		string=s.toCharArray();
		for(i=1;i<size;i++){
			c=string[i];
			for(j=i-1;j>=0 && c<=string[j];j--)
				string[j+1]=string[j];
			string[j+1]=c;
		}
		for(i=0;i<size;i++){
			System.out.print(string[i]);
		};
		
		
	}
}
