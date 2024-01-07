import java.util.ArrayList;
import java.util.Collections;
public class reverse {
    public static void reverseList(ArrayList<Integer> list){
        int i=0,j=list.size()-1;

        // swap
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i)) ;
            list.set(i,list.get(j));
            list.set(j,temp);

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(9);
        list.add(6);
        System.out.println(list); 
        Collections.reverse(list);
        // reverseList(list);
        System.out.println("reverse = "+list);
        Collections.sort(list);
        System.out.println("ascending order = " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order = "+ list);
    }

}
