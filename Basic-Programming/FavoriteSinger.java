import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT*/
        Scanner s = new Scanner(System.in);
        int songs = s.nextInt();                 // Reading input from STDIN
        HashMap<Long, Integer> count = new HashMap();
        int max = 0;
        int result = 0;
       
        for(int i=0; i<songs ; i++){
            Long singer = s.nextLong();
           if(count.containsKey(singer)){
               count.put(singer,(count.get(singer)+1));
           }else {
               count.put(singer, 1);
           }
           if(max<count.get(singer)){
               max = count.get(singer);
           }
        }
        for( Long key : count.keySet()){
            if(max==count.get(key)){
                result++;
            }
        }
    System.out.println(result);
    }
}
