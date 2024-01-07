import java.util.*;
public class duplicate {
    public static void dupli(int idx,boolean[] map,String str,) {
        if(idx==str.length()){
            System.out.println(str1);
            return;
        }
        new StringBuilder   str1;
        char currCha=str.charAt(idx);
        if(map[currCha-'a']==true){
            dupli(idx+1, map, str, str1);
        }else{
            map[currCha-'a']=true;
            dupli(idx+1, map, str, str1.append(currCha));
        }
    }
    public static void main(String[] args) {
        String str="aahanahaha";
        dupli(0,new boolean[26], str, new StringBuilder(""));
    }
}
