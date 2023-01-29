package questions;
/*
SORU:
Node'lari "Ali", "Veli", "Can" ve "Ayse" olan bir LinkedList olusturun.
Kullanicidan bir isim alin.Bu isim LinkedList'de varsa silin ve kullaniciya "Bu isim LinkedList'de 
vardi ve silindi“diye mesaj verin.
Bu isim LinkedList'de yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin.


LinkedList nesnesi oluşturulur ve bu nesnenin içine "Ali", "Veli", "Can" ve "Ayse" isimlerini ekler. 
Daha sonra, kullanıcıdan bir isim almak için Scanner sınıfını kullanır. Kullanıcının girdiği ismi, list nesnesinde
arar ve eğer varsa siler. Eğer list nesnesinde isim yoksa kullanıcıya 
"Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verir.

*/

	import java.util.LinkedList;
	import java.util.Scanner;

public class Question5 {
	
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<String>();

	        list.add("Ali");
	        list.add("Veli");
	        list.add("Can");
	        list.add("Ayse");

	        Scanner scan = new Scanner(System.in);
	        System.out.println("Silmek istediğiniz ismi giriniz:");
	        String name = scan.nextLine();
	        
	        if(list.contains(name)) {
	            list.remove(name);
	            System.out.println("Bu isim LinkedList'de vardi ve silindi");
	        }else {
	            System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
	        }
	    }
	}

	
	


