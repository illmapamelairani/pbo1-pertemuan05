public class Main {
    public static void main(String[] args) {
        handphone objek = new handphone();

        objek.merek = "iPhone 11 Pro Max";
        objek.spesifikasi = "tinggi : 158,0 mm, lebar : 77,8 mm, tebal : 8,1 mm, berat : 336 gram";
        objek.warna = "silver";
        objek.harga = 22999000;
        objek.tahun = 2019;

        objek.video();
        objek.foto();
        objek.internetan();
    }
}
