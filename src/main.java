import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args){

        String S = "SMS messages are really short";
        int K = 12;
        System.out.println((count(S,K)));

    }

    public static int count(String S, int K){
        if (S.length() <= K) return 1;
        else {
            String[] S1 = S.split(" ");
            if (S1.length == 1) return -1;
            for (int i = 0; i < S1.length; i++){
                if (S1[i].length() > K) return -1;
            }
            for (int i = 0; i < S1.length - 1; i++){
                if (S1[i].length()+ S1[i+1].length()+1 <= K){
                    S1[i+1] = S1[i] + " " + S1[i+1];
                    S1[i] = "";
                }
            }
            List<String> sms = new ArrayList<>();
            for (int i = 0; i < S1.length; i++)
                if (!S1[i].equals("")) sms.add(S1[i]);
            return sms.toArray().length;
        }
    }



}
