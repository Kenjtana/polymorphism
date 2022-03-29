package Overriding;
public class output {


    public void namaHewan(){
        System.out.println("Hewan ayam");
    }
    
    public void jenisMakanan(){
        System.out.println("Ayam adalah hewan omnivora");
    }

    public void tempatTinggal(){
        System.out.println("Ayam tinggal di darat");
    }


    public static void main(String[] args) {
        output hewan = new output();
        hewan.jenisMakanan();
        hewan.tempatTinggal();
        hewan.namaHewan();

    }
}
