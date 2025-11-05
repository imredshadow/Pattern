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

    public static void odds(int start){
        for (int count = start; count >= 1; count -= 2) {
            for (int times = 0; times < count; times++) {
                System.out.print(count);
            }
            System.out.println("");
        }
    }
    
    public static void eo(int maxE){
        //code goes here
        String letter = "E";
        if (maxE%2 == 0)
            letter = "O";

        for (int i = 1; i <= maxE; i++) {
            for (int count = 0; count < i; count++) {
                System.out.print(letter);
            }
            if (letter.equals("E")){
                letter = "O";
            } else {
                letter = "E";
            }
            System.out.println("");
        }
        
        for (int j = (maxE-1); j >= 0; j--) {
            for (int thing = j; thing > 0; thing--) {
                System.out.print(letter);
            }
            if (letter.equals("E")){
                letter = "O";
            } else {
                letter = "E";
            }
            System.out.println("");
        }
    }

    public static void pyramids(int rows){
        for (int i = 1 ; i <= rows; i++) {
            for (int count = 0; count < (rows - i) * 2 + 1; count++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        stars(7);
        triangle(9);
        odds(9);
        eo(6);
        pyramids(5);
    }
}