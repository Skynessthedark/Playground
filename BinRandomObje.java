package sortingAlgorithms;
import java.util.Random;

public class BinRandomObje {
	public int BinRandomObje(){
		Random random=new Random();
		int sayi;
		sayi=random.nextInt(1000)+1;
		return sayi;
	}

}
/* Main K�sm�
 * 
 * 
 int[] binDizi=new int[1000];
BinRandomObje rand=new BinRandomObje();
InsertionSort inserts=new InsertionSort();
int i;
System.out.println("---S�ras�z Dizi---");
for(i=0;i<1000;i++){
	if(rand!=null){
		binDizi[i]=rand.BinRandomObje();
		System.out.println(i+". eleman="+binDizi[i]+",");
	}
	else{
		System.out.print("Null Pointer Hatas�!");
	}
}
System.out.println("---S�ral� Dizi---");
inserts.insertion(binDizi, 1000);


	}
*/
