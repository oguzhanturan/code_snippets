import java.util.ArrayList;


public class FindStringInArrayListElement{
    
    public static String Solution(ArrayList<String> A,ArrayList<String> B, String P ){
        
        //A isim Listesi
        //B Telefon listesi P telefon listesindeki hangi elemendaysa dön
        ArrayList<String> temp = new ArrayList<String>();
        int c = 0;
        for(String b : B){
            System.out.println(b);
            if (b.contains(P.toString())) {
                System.out.println("temp");
                temp.add(A.get(c).toString());
            }
            c++;
        }
        System.out.println(temp);
        return "test";
    }
    
     public static void main(String []args){
        ArrayList<String> A = new ArrayList<>();
        A.add("adam");
        A.add("eva");
        A.add("leo");
        
        ArrayList<String> B = new ArrayList<>();
        B.add("121212121");
        B.add("111111111");
        B.add("444555666");
        String P = "112";
        
        System.out.println(Solution(A,B,P));

     }
}
