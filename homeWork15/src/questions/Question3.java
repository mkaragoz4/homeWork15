package questions;
/*
SORU:
Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz … 
(2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23,40]  (Iterator kullanilacak)
*/


/*
Bu kod, bir listeyi (örneğin [2,13,56,23,45,14,40]), belirli bir aralıkta olmayan elemanlarını silmek için kullanılır. 
Öncelikle, lower ve upper değerleri (20 ve 40) tanımlanır ve liste oluşturulur.
Sonra, removeOutOfRange() methodu çağrılır. Bu method, listeyi, lower ve upper değerlerini ve bir iterator'u alır.
 Method içinde, eğer liste null veya boşsa veya lower değeri upper değerinden büyükse, method işlem yapmaz ve geri döner.
Eğer liste geçerliyse, iterator ile liste elemanları tek tek kontrol edilir. Eğer eleman lower veya upper değerleri 
arasında değilse, iterator.remove() methodu ile silinir. Bu, iterator'un silinen elemanı geçtiği için, 
iterator bir sonraki elemana geçer ve bu işlem tekrar eder. Böylece, aralıkta olmayan tüm elemanlar silinmiş olur.
Son olarak, lst listesi ekrana yazdırılır ve sonuç olarak [23, 40] listesi elde edilir.

*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

	
	public class Question3 {
	    public static void main(String[] args) {
	        List<Integer> lst = new ArrayList<>(Arrays.asList(2, 13, 56, 23, 45, 14, 40));
	        int lower = 20;
	        int upper = 40;
	        removeOutOfRange(lst, lower, upper);
	        System.out.println(lst); // (23, 40)
	    }

	    public static void removeOutOfRange(List<Integer> lst, int lower, int upper) {
	        if (lst == null || lst.isEmpty() || lower > upper) {
	            return;
	        }
	        Iterator<Integer> iter = lst.iterator();
	        while (iter.hasNext()) {
	            int num = iter.next();
	            if (num < lower || num > upper) {
	                iter.remove();
	            }
	        }
	    }
	}



	


