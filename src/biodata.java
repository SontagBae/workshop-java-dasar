class datadiri {
    String nama;
    String hobi;
    int umur;

    datadiri(String nama, String hobi, int umur) {
        this.nama = nama;
        this.hobi = hobi;
        this.umur = umur;
    }

    public static int test(){
        return 100;
    }

    //public
    //private
    public static void coba(int a){
        if (a == 7){
            System.out.println("oke");
        }
    }

    void menyapa(){
        System.out.println("Halo saya " + nama );
        System.out.println("Hobi saya " + hobi );
        System.out.println("Umur saya " + umur );
    }
}

public class biodata {
    public static void main(String[] args) {
        datadiri dataSaya = new datadiri("Ucok", "Mancing", 37);

        dataSaya.menyapa();
//        System.out.println(dataSaya.hobi);
//        System.out.println(dataSaya.test());
    }
}
