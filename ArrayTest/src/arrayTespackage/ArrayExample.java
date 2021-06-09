package arrayTespackage;

public class ArrayExample {
	public static void main (String[] args) { 
		String [] dataProdi={"Administrasi",
				"Agroteknologi", 
				"Teknik Elektro",
				"Bahasa Arab", 
				"Bahasa Inggris",
				"Teknik Informatika",
				"FIsika", "Kimia", 
				"Biologi", 
				"Manajemen"};
		for (int i = 0; i<dataProdi.length; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(dataProdi[i]);
			
		}
	}
}
