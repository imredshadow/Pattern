//Jian Acol
//10/39/2025
//brief description
public class Pattern{
    //precondition
    //postcondition
    public static void stars(int rows){
        //code goes here
        int totalRows = rows;
        int currentRow = 1;
        int numStars = 1;
        while (currentRow < totalRows){
            int i = 0;
            while (i < numStars) {
                System.out.print("*");
                i++;
            }
            System.out.println("");
            numStars += 2;
            currentRow++;
        }
        
    }

    public static void triangle(int rows){
        //code goes here
        int totalRows = rows;
        int currentRow = 1;
        while (currentRow < totalRows){
            int i = 0;
            while (i < currentRow) {
                System.out.print(currentRow);
                i++;
            }
            System.out.println("");
            currentRow++;
        }
        
    }
    public static void main(String[] args){
        stars(7);
        triangle(9);
    }
}