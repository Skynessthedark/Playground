package sortingAlgorithms;

import java.util.Random;

public class SelectionSort {
 public void selection(int[] dizi,int size){
	 int i,j,min,index;
	 for(i=0;i<(size-1);i++){
		 min=dizi[i];
		 index=size-1;
		 for(j=i;j<(size-1);j++){
			 if(dizi[j]<min){
				 min=dizi[j];
				 index=j;
			 }
		 }
		 if(i!=index){
			 dizi[index]=dizi[i];
			 dizi[i]=min;
			 
		 }
	 }
	 for(i=0;i<size;i++){
		 System.out.println(i+". item="+dizi[i]);
	 }
 }
}
/* Main kýsmi
int [] dizi=new int[10];
int i;
Random random=new Random();
for(i=0;i<10;i++){
	dizi[i]=random.nextInt(100)+1;
	System.out.println(i+". unsorted item="+dizi[i]);
}
SelectionSort select=new SelectionSort();
select.selection(dizi, 10);
} */