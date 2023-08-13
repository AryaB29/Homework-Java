import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyCase{
    public int  hasil_kali(List<Integer> list_awal){
        int k =1;
        for(int i : list_awal){
            k = k*i;
        }
        return k;
    }

    public String cek_gage(int nilai){
        String hasil;
        if(nilai%2!=0){
            hasil = "Ganjil"; 
        }
        else{
            hasil = "Genap";
        }

        return hasil;
    }
    public static void main(String[] args) {
        StudyCase nilai = new StudyCase();
        List<Integer> hasil = new ArrayList<>();

       for(String i : args){
            int nilai_list = Integer.parseInt(i);
            hasil.add(nilai_list);
       } 

       int nilai_baru = nilai.hasil_kali(hasil);

       String gage = nilai.cek_gage(nilai_baru);

       System.out.println(nilai_baru +"-"+gage);
       
    }
}