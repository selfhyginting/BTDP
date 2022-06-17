import java.util.LinkedList;

public class Latihan_Java {

    public static void main(String[] args) {
        LinkedList<String> buah = new LinkedList<>();
        buah.add("jeruk");
        buah.add("jambu");
        buah.add("apel");
        buah.add("melon");
        buah.add("semangka");
        buah.add("nanas");
        buah.add("sirsak");

        buah.addFirst("Paling Atas");
        buah.addLast("Paling Bawah");

        buah.set(2,"diubah");
        buah.set(5,"diubah");

        System.out.println("Nama Buah: " + buah);
        System.out.println("Jumlah Buah:" + buah.size());
        System.out.println("Data NoIndex 1:" + buah.get(1));

        System.out.println("Data teratas:" + buah.getFirst());
        
        buah.removeFirst();
        System.out.println("Data teratas:" + buah.getFirst());

        
        
        if (buah.isEmpty()){
            System.out.println("Data Kosong");
        }else {
            System.out.println("Data Terisi");
        }

        if (buah.contains("diubah")){
            System.out.println("Barang telah ada yang diubah");
        }else{
            System.out.println("Barang belum ada yang diubah");
        }
    }

}
