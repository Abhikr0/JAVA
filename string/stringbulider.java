public class stringbulider {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abhishek");

        for(char ch='a';ch<='z';ch++){
            sb.append(ch+" ");
        }
        System.out.println(sb);
    }
}
