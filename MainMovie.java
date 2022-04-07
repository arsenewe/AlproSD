import java.util.Scanner;

public class MainMovie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah movie: ");
        int jmlM = sc.nextInt();
        Movie[] movie = new Movie[jmlM];
        
        for(int i=0; i < movie.length; i++){
            
            int id = i + 1;
            System.out.println("===================");
            System.out.println("Data Movie ke-"+id);
            System.out.println("Judul: ");
            String judul = input.nextLine();
            System.out.println("Tahun: ");
            int tahun = sc.nextInt();
            System.out.println("Rating: ");
            float rating = sc.nextFloat();
            // instance movie
        }
        
        System.out.println("\nDATA SEBELUM DIOLAH");
        for(int i=0; i< movie.length; i++){
            movie[i].tampil();
        }

        System.out.println("\nPENGURUTAN DATA");
        // terapkan fungsi pengurutan data

        System.out.println("\nPENCARIAN DATA");
        System.out.println("Cari ....:"); // isi titik-titik sesuai atribut yang diolah
        ... ct = sc.....(); // isi titik-titik sesuai atribut yang diolah
        for(int i=0; i< movie.length; i++){
           
            if(movie[i].... != ct){ // isi titik-titik sesuai atribut yang diolah
                
            } else{
                movie[i].....; // isi titik-titik dengan fungsi pencarian yang sesuai
            }
            
        }
        
    }
}
