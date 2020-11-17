package odev;

public class HybridArray <T> {
	
	private Node<T> head; // listenin başı
	
	public HybridArray(){  //default constructor
		head = null;
	}
	
	public void addLast(T n) { // n değerini dizinin sonuna ekle
		Node<T> new_node = new Node<T>(n); // Verilen verilerle yeni bir düğüm oluşturun
		if(this.head == null) { // Bağlantılı Liste boşsa
	         // yeni düğümü listenin başı olsun
			this.head = new_node;
			return;
		}
		else { // değilse
			Node<T> last = this.head; // Son düğüme kadar çapraz geçiş
            // yeni düğümü buraya ekleyin
			while(last.next != null) 
				last = last.next;
			last.next = new_node; // Yeni_ düğümü son düğüme ekle
			
		}
		return;
	}
	
	public void addFirst(T n) { //n değerini dizinin başına ekle
		Node<T> new_node = new Node<T>(n); // Verilen verilerle yeni bir düğüm oluşturun
		if(this.head == null) {  //Bağlantılı Liste boşsa
			this.head = new_node; // yeni düğümü listenin başı olsun
			return;
		}else { // değilse
			new_node.next = this.head; // swap işlemi gibi yap 
			head = new_node;
		}
		return;
	}
	
	public void removeFrist() { // dizinin ilk elemanı diziden kaldır
		if(this.head == null) // dizinin boş olursa 
			return;
		this.head = this.head.next; //Array'deki ikinci elemanı dizinin başı yap
		return;
	}
	
	public void removeLast() { //  dizinin son elemanını diziden kaldır
		if(this.head == null || this.head.next == null) // dizi boşsa
			return;
		Node<T> temp = this.head; // geçici düğüm oluştur
		while (temp.next.next != null) // dizinin dizinin sonuncusuna git
			temp = temp.next; 
		temp.next = null;  // boşlatır onu
		return;
	}
	
	public void insert(T n, int index) {
		if(index > this.size()-1  || index < 0) // dizinin kapsite indeksi dışındaysa
			return;
		if(this.head == null || index == 0) { // dizi  boş olursa veya birinci index ise
			this.addFirst(n);
			return;
		}
		if(index == this.size()-1) { // dizinin sonu olursa
			this.addLast(n);
			return;
		}// değil olursa
		// gerekli konuma Düğüm ekleme
		Node<T> temp = this.head;  
		while(index-- !=0) {
			if(index ==0) {
				// Yeni Düğümün gösterilmesini sağlama
				// aynı konumdaki eski Düğüm
				Node<T> new_node = new Node<T>(n);
				new_node.next = temp.next;
				// Akımı yeni Düğümle değiştirme
                // yeni Düğüme işaret etmek için eski Düğüme
				temp.next = new_node;
				break;
			}
			temp = temp.next;
		}
		if(index != 1) // dizinin dışında index
			return;
		
		return;
	}
	
	public void clear() { // tüm verileri siler/kaldırır.
		this.head = null; // dizi boşlatir
	}
	
	private int sizerec(Node<T> node) {
		if (node == null)
			return 0;
		return 1 + sizerec(node.next);
	}
	public int size() {// veri yapısındaki toplam eleman sayısını return eder.
		return this.sizerec(this.head);
	}
	private T getRec(Node<T> temp,int index) {
		if(temp == null || index > this.size() - 1)
			return null;
		if(index == 0)
			return temp.data;
		return getRec(temp.next, index - 1);
	}
	
	public T get(int index) {
		Node<T> temp = this.head;
		return this.getRec(temp, index);
	}
	
	public void removeAt(int index) {
		if(this.head == null)
			return;
		if (index == 0) {
			this.removeFrist();
			return;
		}
		if (index == this.size() -1) {
			this.removeLast();
		}
		Node<T> temp = this.head;
		// Silinecek düğümün önceki düğümünü bulun
	    for(int i = 0;  temp != null && i < index - 1;i++) 
	        temp = temp.next; 
	 // Konum düğüm sayısından fazlaysa 
	    if (temp == null || temp.next == null) 
	        return; 
	    Node<T> Next = temp.next.next;
	    
	    temp.next = Next;
	}
	
	@Override
    public String toString() { // dizideki tüm elemanları aralarına virgül bırakarak ekrana yazar print mothode kullanarak.
		String str = "[";
		Node<T> temp = this.head;
		int i = 0;
		while(temp != null) {
			i += 1;
			str += String.valueOf(temp.data);
			if(i != 0)
				str += ",";
			temp = temp.next;
		}
		if(i !=0 && str != "")
			str = str.substring(0, str.length()-1);
        return str+"]"; 
    } 
}
