
public class Manusia {
	String nama;
	String jenkel;
	
	Manusia(){
	nama="Unknown";
	jenkel="Unkmown";
	}
	
	Manusia(String param1 , String param2){
		nama =param1;
		jenkel=param2;
	}
	void cetak(){
		System.out.println("Nama  = "+nama);
		System.out.println("Jenis kelamin = "+ jenkel +"\n");
	}

}
