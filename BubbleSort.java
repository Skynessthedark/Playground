package sortingAlgorithms;

public class BubbleSort {

	public int[] bubblesorting(int[] dizi,int size){
		int i,j,temp;
		
		for(i=0;i<(size-1);i++){
			for(j=0;j<(size-1-i);j++){
				if(dizi[j]>dizi[j+1]){
					temp=dizi[j];
					dizi[j]=dizi[j+1];
					dizi[j+1]=temp;
				}
			}
		}
		
		return dizi;
	}
}
/* Main Kýsmi
 * BubbleSort bubble=new BubbleSort();
		int[] dizi=new int[]{3,5,7,2,8,4};
		int i;
		dizi=bubble.bubblesorting(dizi, 6);
		for(i=0;i<6;i++){
			System.out.print(" "+dizi[i]+" ");
		}
		
 */
