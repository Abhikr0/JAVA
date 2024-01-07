public class shortest {
    public static float dir(String dirt) {
    int x=0,y=0;
    for(int i=0;i<dirt.length();i++){
        char let=dirt.charAt(i);

        if(let=='N'){
            y++;
        }
        else if(let=='S'){
            y--;
        }
        else if(let=='E'){
            x++;
        }
        else{ 
            x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String dirt="WENSENSESSNE";
        System.out.println(dir(dirt));
    }
}
