package PostTestNo1;

class Bangunan { 
    String nama = "Bangunan Umum";

    Bangunan() {
        System.out.println("Constructor dari kelas Bangunan");
    }
}

class GedungSekolah extends Bangunan { 
    String nama = "Gedung Sekolah ABC";

    GedungSekolah() {
        super(); 
        System.out.println("Constructor dari kelas GedungSekolah");
    }

    void tampilkanInfo() {
        System.out.println("Nama dari subclass: " + nama);
        System.out.println("Nama dari superclass: " + super.nama);
    }
}

public class Main {
    public static void main(String[] args) {
        GedungSekolah sekolah = new GedungSekolah();
        sekolah.tampilkanInfo();
    }
}












