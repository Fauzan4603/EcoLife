import java.time.LocalDate;

public class CatatanBerkendara {

    public enum TipeBBM {
        Solar,
        Bensin,
    }

    public enum TipeKendaraan {
        Motor,
        Mobil,
    }

    int jarak;
    int jumlahBBM;
    TipeKendaraan tipeKendaraan;
    TipeBBM bahanBakar;
    int cc;
    LocalDate tanggal;
    // float jumlahEmisi; // Menambahkan atribut untuk menyimpan hasil jumlah emisi

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }

    public void setJumlahBBM(int jumlahBBM) {
        this.jumlahBBM = jumlahBBM;
    }
    public void setCC(int cc) {
        this.cc = cc;
    }

    public float getJumlahEmisi() {
        float faktorEmisi;
        if (this.bahanBakar == TipeBBM.Bensin) {
            faktorEmisi = 2.4f;
        } else {
            faktorEmisi = 2.8f;
        }
        // jumlah bbm/konsumsi bbm * faktor emisi kg/liter * jarak tempuh (km) / 1000
        float jumlahEmisi = (float) this.jumlahBBM / (float)this.getKonsumsiBbm() * faktorEmisi * (float)jarak / 1000;
        return jumlahEmisi;
    }

    //jika motor dan cc dibawah 125 maka konsumsi 1 liter/50 kilometer
    //jika motor dan cc di antara 125 dan 150 maka konsumsi 1 liter/45 kilometer
    //jika motor dan cc diantara 150 dan 250 maka konsumsi 1 liter/37 kilometer
    //jika motor dan cc di atas 250 maka konsumsi bbm 1 liter/30 kilometer
    int getKonsumsiBbm() {

        if (this.tipeKendaraan == TipeKendaraan.Motor) {
            if (this.cc <= 125)
                return 50;
            if (this.cc > 125 && this.cc <= 150)
                return 45;
            if (this.cc > 150 && this.cc <= 250)
                return 37;
            return 30;
        } else {
            if (this.cc <= 1500)
                return 18;
            if (this.cc > 1500 && this.cc <= 2000)
                return 10;
            return 8;
        }
    }


    public TipeKendaraan getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setTipeKendaraan(TipeKendaraan tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public TipeBBM getBahanBakar() {
        return bahanBakar;
    }
    public void setBahanBakar(TipeBBM bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public String toString() {
        return "CatatanBerkendara{" +
                "jarak=" + jarak +
                ", jumlahBBM=" + jumlahBBM +
                ", tipeKendaraan=" + tipeKendaraan +
                ", bahanBakar=" + bahanBakar +
                ", cc=" + cc +
                ", tanggal=" + tanggal +
                '}';
    }
}