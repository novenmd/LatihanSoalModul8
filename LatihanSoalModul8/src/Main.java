class Hewan { 
    String suara = "Suara hewan";

    Hewan() {
        System.out.println("Ini constructor dari kelas Hewan");
    }
}

class Kucing extends Hewan { 
    String suara = "Meong";

    Kucing() {
        super(); 
        System.out.println("Ini constructor dari kelas Kucing");
    }

    void tampilkanSuaraHewan() {
        System.out.println("suara milik kelas Kucing: " + suara);
        System.out.println("suara milik kelas Hewan: " + super.suara);
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.tampilkanSuaraHewan();
    }
}










