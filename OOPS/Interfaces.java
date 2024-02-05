public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface Carnivore {

}
interface Herbivore {

}
// Syntax of the code implements 
class bear implements Carnivore,Herbivore{

}
interface ChessPlayer {
    void moves ();
}

class Queen implements ChessPlayer{
    public void moves (){
        System.out.println("up,down,left,right,diagonal,in all direction ");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left, diagonal - by One step");
    }
}