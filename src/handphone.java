public class handphone {

    //atribute
    String merek;
    String spesifikasi;
    String warna;
    int harga;
    int tahun;

    public handphone(){ //object

    }

    //behavior
    void video(){
        System.out.println("kamu bisa mengabadikan momen indah bersama orang tersayang dengan membuat video");
        System.out.println("merek handphone adalah : "+merek);
        System.out.println("spesifikasi handphone : "+spesifikasi);
        System.out.println("warna handphone : "+warna);
        System.out.println("harga handphone :"+harga);
        System.out.println("tahun peluncuran handphone ke publik : "+tahun);
        System.out.println();
    }
    void foto(){
        System.out.println("bukan hanya video kamu juga bisa mengabadikan momen indah bersama orang tersayang kamu :)");
        System.out.println("ingat waktu tidak bisa diulang jadi sebelum kamu kehilangan momen tersebut");
        System.out.println();
    }
    void internetan(){
        System.out.println("dengan internet kamu bisa melakukan banyak hal");
        System.out.println("seperti bermain games, bermain sosial media, mencari informasi,");
        System.out.println("dan banyak hal yang bisa kalian lakukan");
    }

}
