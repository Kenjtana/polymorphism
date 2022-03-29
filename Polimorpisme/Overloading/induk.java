package Overloading;

public abstract class induk {
    
    //  ini overloading
    public void nilai(int nilai){
        System.out.println("Anda mendapatkan nilai "+nilai);
        
    }

    //  ini juga overloading
    public void nilai(String waktu, int tambahan){
        System.out.println("Anda mengumpulkan tugas "+waktu);
        System.out.println("Anda mendapatkan nilai tambahan sebesar "+tambahan);
    }

    // ini abstrak
    public abstract void hasil();

}
