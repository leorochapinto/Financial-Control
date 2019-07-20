import javax.swing.JOptionPane;

public class teste {

    static int firstarr[][] = {{1,2,3},{6,7,8},{9}};
    public static void main(String[] args) {
        display(firstarr);
        }

    public static void display(int x[][]){
        for(int row = 0; row<x.length;row++){
            for(int column=0; column<x[row].length;column++){
                System.out.print(x[row][column]+"\t");
            }
            System.out.println("\n This is a new line");
        }
    }
}