public class Tantangan {
    private String namaTantangan;
    private boolean selesai;
    private Reward reward;

    public Tantangan(String namaTantangan, Reward reward) {
        this.namaTantangan = namaTantangan;
        this.reward = reward;
        this.selesai = false;
    }

    public String getNamaTantangan() {
        return namaTantangan;
    }

    public boolean isSelesai() {
        return selesai;
    }

    public void setSelesai(boolean selesai) {
        this.selesai = selesai;
    }

    public Reward getReward() {
        return reward;
    }
}
