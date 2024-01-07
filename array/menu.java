public class menu {
    public static int ls(int item[], int key) {
        for (int i = 0; i < item.length; i++) {
            if (item[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int item[]={2,4,5,6,7,88,5,7,5};
        int key=5;

        int index=ls(item, key);
        if(index==-1){
            System.out.println("Not Found");
        }
        System.out.println("key is at the index");
    }
}
