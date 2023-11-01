import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Reward reward1 = new Reward("Voucher Belanja", 50);
        Reward reward2 = new Reward("Tiket Bioskop Gratis", 2);

        // Membuat beberapa tantangan
        Tantangan tantangan1 = new Tantangan("Pakai Sepeda ke Kantor", reward1);
        Tantangan tantangan2 = new Tantangan("Kurangi Pemakaian Plastik", reward2);


        // Membuat UserPerson
        ArrayList<CatatanBerkendara> history = new ArrayList<>();
        UserPerson user = new UserPerson("farel", "farel123", "farel@upi.edu", "password", reward1, history);
        user.login("password");
        user.displayUserData();

        // Membuat objek CatatanBerkendara
        CatatanBerkendara catatan = new CatatanBerkendara();

        // Mengatur atribut-atribut
        catatan.setJarak(20); // Set jarak dalam kilometer
        catatan.setJumlahBBM(2); // Set jumlah BBM dalam liter
        catatan.setTipeKendaraan(CatatanBerkendara.TipeKendaraan.Motor);
        catatan.setBahanBakar(CatatanBerkendara.TipeBBM.Bensin);
        catatan.setCC(110); // Set CC kendaraan

        // Menghitung jumlah emisi
        float emisi = catatan.getJumlahEmisi();
        System.out.println(catatan);

        // Menampilkan hasil perhitungan jumlah emisi
        System.out.println("Jumlah Emisi: " + emisi + " kg CO2");

        // Menambahkan catatan berkendara ke history
        user.addEntry(new CatatanBerkendara());

        // Menambahkan tantangan ke user
        user.tambahkanTantangan(tantangan1);
        user.tambahkanTantangan(tantangan2);

        // Menyelesaikan tantangan
        user.selesaikanTantangan("Pakai Sepeda ke Kantor");

        // Menampilkan history
        user.showHistory();

        // Menampilkan reward yang diterima
        System.out.println("Rewards:");
        ArrayList<Reward> rewards = user.getListRewards();
        for (Reward reward : rewards) {
            System.out.println(reward.getNamaReward() + " senilai " + reward.getNilaiReward() + " poin.");
        }
    }
}
