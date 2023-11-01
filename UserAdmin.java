public class UserAdmin extends User {
    String rekomendasi;
    String tantangan;

    public UserAdmin (String nama, String userName, String email, String password, String rekomendasi, String tantangan){
        super(nama, userName, email, password);
        this.rekomendasi = rekomendasi;
        this.tantangan = tantangan;

    }
    public String getRekomendasi() {
        return rekomendasi;
    }

    public void setRekomendasi(String rekomendasi) {
        this.rekomendasi = rekomendasi;
    }

    public String getTantangan() {
        return tantangan;
    }

    public void setTantangan(String tantangan) {
        this.tantangan = tantangan;
    }
}


