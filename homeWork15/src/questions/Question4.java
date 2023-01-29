package questions;

/*
SORU:
Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin. (ListIterator kullanilacak)

*/
/*
Bu kod parçası, bir ArrayList nesnesi oluşturur ve bu nesnenin içine 1, 2, 3, 4 ve 5 sayılarını ekler. 
Daha sonra, ListIterator nesnesi oluşturur ve bu nesnenin içine list nesnesini atar. Bu iterator nesnesi,
list nesnesinin boyutu kadar ilerler. Daha sonra, iterator nesnesi kullanarak liste elementlerini
sondan başa doğru yazdırır.

*/
import java.util.ArrayList;
import java.util.ListIterator;

public class Question4 {
	
	

	
	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);

	        ListIterator<Integer> iterator = list.listIterator(list.size());

	        while (iterator.hasPrevious()) {
	            System.out.println(iterator.previous());
	        }
	    }
	}

	
	


