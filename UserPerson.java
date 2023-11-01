import java.util.ArrayList;
public class UserPerson extends User {
    private Reward point;
    private ArrayList<CatatanBerkendara> history;
    private ArrayList<Tantangan> listTantangan = new ArrayList<>();
    private ArrayList<Reward> listRewards = new ArrayList<>();

    public UserPerson (String nama, String userName, String email, String password,
                       Reward point, ArrayList<CatatanBerkendara> history){
        super(nama, userName, email, password);
        this.point = point;
        this.history = history;
    }

    public void addEntry(CatatanBerkendara catatanBerkendara) {
        history.add(catatanBerkendara);
    }

    public void showHistory(){
        this.history.forEach((his) -> {
            System.out.println(his.getJumlahEmisi());
        });
    }

    public void tambahkanTantangan(Tantangan tantangan) {
        listTantangan.add(tantangan);
    }

    public ArrayList<Tantangan> getListTantangan() {
        return listTantangan;
    }

    public void selesaikanTantangan(String namaTantangan) {
        for (Tantangan tantangan : listTantangan) {
            if (tantangan.getNamaTantangan().equals(namaTantangan)) {
                tantangan.setSelesai(true);
                Reward hadiah = tantangan.getReward();
                listRewards.add(hadiah);
                System.out.println("Selamat, Anda telah menyelesaikan tantangan " + namaTantangan + "!");
                System.out.println("Anda mendapatkan " + hadiah.getNamaReward() + " senilai " + hadiah.getNilaiReward() + " poin.");
                return;
            }
        }
        System.out.println("Tantangan " + namaTantangan + " tidak ditemukan.");
    }

    public ArrayList<Reward> getListRewards() {
        return listRewards;
    }
}

