package id.ac.unikom.codelabs.economictrends.data;

import java.util.List;

/**
 * Created by codelabsunikom on 6/14/17.
 */

public class HargaKomoditiDao extends BaseDao{

    private List<DataBeanX> data;

    public HargaKomoditiDao() {
    }

    public List<DataBeanX> getData() {
        return data;
    }

    public void setData(List<DataBeanX> data) {
        this.data = data;
    }

    public static class DataBeanX {
        private String komoditas;
        private String unit;
        private String mangkukna;
        private String kamari;
        private String ayena;
        private List<DataBean> data;

        public String getKomoditas() {
            return komoditas;
        }

        public void setKomoditas(String komoditas) {
            this.komoditas = komoditas;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getMangkukna() {
            return mangkukna;
        }

        public void setMangkukna(String mangkukna) {
            this.mangkukna = mangkukna;
        }

        public String getKamari() {
            return kamari;
        }

        public void setKamari(String kamari) {
            this.kamari = kamari;
        }

        public String getAyena() {
            return ayena;
        }

        public void setAyena(String ayena) {
            this.ayena = ayena;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * tanggal : 1
             * harga : 10,870
             */

            private String tanggal;
            private String harga;

            public String getTanggal() {
                return tanggal;
            }

            public void setTanggal(String tanggal) {
                this.tanggal = tanggal;
            }

            public String getHarga() {
                return harga;
            }

            public void setHarga(String harga) {
                this.harga = harga;
            }
        }
    }
}
