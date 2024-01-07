import java.util.ArrayList;

public class sample {
    // public static void main(String[] args) {
    //     Integer a = Integer.valueOf(3);

    // }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        // add elements with index 
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        // for(int i=0;i<l1.size();i++){
        //     System.out.println(l1.get(i));
        // }
        
        // modify an elements
        l1.set(2,7);


        // for removing an element
        l1.remove(Integer.valueOf(3));

        // length of an array 
        int l2=l1.size();
        
        // to check if an element exists or not 

        boolean check=l1.contains(Integer.valueOf(2));

        System.out.println(check);
        System.out.println(l1);
        System.out.println(l2);
    }
}
