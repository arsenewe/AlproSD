public class Movie {
    int id;
    String judul;
    int tahun;
    float rating;

    Movie(int i, String j, int t, float r){
        id = i;
        judul = j;
        tahun = t;
        rating = r;
    }

    // tambahkan algoritma pengurutan dan pencarian yang sesuai

    void tampil(){
        
        System.out.println("ID: "+id+"\nJudul: " +judul+"\n Tahun: "+tahun+"\n Rating: "+rating);
    }
}
