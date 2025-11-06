//Jian Acol
//10/39/2025
//brief description
public class Pattern{
    //precondition: Input a integer number of rows
    //postcondition: Print the said amount of rows increasing by two each row
    public static void stars(int rows){
        int totalRows = rows;
        int currentRow = 1;
        int numStars = 1;
        while (currentRow <= totalRows){
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
    
    //precondition: Input a integer number of rows
    //postcondition: Print the said amount of rows with the said number of that specified row as the number displayed in the row
    public static void triangle(int rows){
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

    //precondition: Input a integer number of rows 
    //postcondition: Print each odd numbered row specified in the input, with the specified row displayed as the number
    public static void odds(int start){
        for (int count = start; count >= 1; count -= 2) {
            for (int times = 0; times < count; times++) {
                System.out.print(count);
            }
            System.out.println("");
        }
    }
    
    //precondition: Input a integer number of rows that it wont go past
    //postcondition: Prints up to the specified number by 1, then decreases back down by 1,switching with O and E, however
    //when inputted an odd number, will start with an E
    public static void eo(int maxE){
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

    //precondition: Input a integer number of rows
    //postcondition: Print the said amount of rows with a odd number, decreasing by two each row, 
    //and adding spaces to the beginning it appear in a pyramid shape, till the last row is one
    public static void pyramids(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
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