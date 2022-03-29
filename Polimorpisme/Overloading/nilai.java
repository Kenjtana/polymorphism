package Overloading;

public class nilai extends induk {
    public static void main(String[] args) { // <-- ini MAIN CLASS
        nilai output = new nilai(); // buat objek baru

        // isi nilai dari overloading di class induk
        output.nilai(82);
        output.nilai("Tepat waktu", 10);

    }

    // pemanggilan abstrak diluar main class
    public void hasil(){
        System.out.println("Total nilai Anda: 92");
    }
}
