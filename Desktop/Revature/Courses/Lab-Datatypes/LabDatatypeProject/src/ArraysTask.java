import java.util.Scanner;
public class ArraysTask {
    /*
    Write a program in java using arrays to compute the average of n grades. 
    Ask the user  how many grades to enter i e 10 grades, 
    then lst the user save the grades, then program to calculate 
    the average grade entered  by user .
    Use a separate method on the class for the program, 
    but use scanner on the main method to get input from user, 
    & call the  program.      
    */
    public static  int averageGrades(int[] grades, int arraySizeNumber){
        int sumResults = 0;
        for (int i = 0; i <  arraySizeNumber; i++) {
            sumResults  +=  grades[i];
        }
        System.out.println("Sum of All Grades entered in Array = " + sumResults);
        return (int) sumResults / arraySizeNumber;
    }
    /**
     *  An irregular array is a "n-dimential array" ( where n is greater than 1)
     *  This kind of 1-D array the last dimension's size is unknown.
     *  so Memory for this one-D array is alloacted with/of different size
     *  When declaring irregular-Array at least one  dimension will not contain
     *  a specfic value.
     */
    // Irregular Arrays Program
    public static void myIrregularArray() {
        //Total number of elements are unknown at this point.
        // This array currently contains six 1-Dimensional Array
        double[][] irregularArrayExample = new double[6][];
        //Let's allocate memory for the array
        for(int m =0; m < 6; m++){
            irregularArrayExample[m] = new double [m * 3 + 2];
        }
        //Let's add some values (0 to 46) to  Irregular Array 
        System.out.println("\t ETF Bench Mark - Irregular Array Style:");
        for (int a = 0; a < irregularArrayExample.length; a++) {
            for (int k = 0; k < irregularArrayExample[a].length; k++) {
               System.out.println(irregularArrayExample[a][k] = a * 6 + k);
            }            
        }
    }
    /**
     *  VarArgs allows us to set an argument to a method 
     * whose size is determined at runtime. 
     * You can only ever have 1 varargs parameter in a method, 
     * and it MUST be the last parameter defined 
     */
    // Variable Argument Methods (varargs)
    public static void variableArgumentsMethod( String ... indexFunds){
        System.out.println("\t\t Vanguard Financial Index Funds:");
        //Loop to print the unknow Funds index location &  name 
        for(int w =0; w < indexFunds.length; w++){
            System.out.println(w + " : " + indexFunds[w]);
        }
    }
     //Program to add Two Matrices together
     public static void addingMatricesMethod(int[][] array1, int[][]array2) {
        // 3-Rows 3-Collumn Array to store the sum of the added matrices
        int[][] sumMatrix = new int[3][3];
        System.out.println("\t\t Adding Up Matrices \n");
        // A Nested loop to add matrices together
        for(int i = 0; i < array1.length; ++i){
            for (int j = 0; j < array2.length; j++) {
                sumMatrix[i][j] = array1[i][j] + array2[i][j];
                System.out.println("\t" + sumMatrix[i][j]);
            }
            System.out.println("------------\n");
        }
    }
    //Program to add Two Matrices together
    public static void multiplyingMatrices(int[][] array1, int[][]array2) {

        // 4-Rows 4-Collumn Array to store the sum of the added matrices
        int[][] multiplyMatrix = new int[3][3];
        System.out.println("\t\t Multiplying Matrices \n");
        // A Nested loop to multiply matrices together
        for(int i = 0; i < array1.length; ++i){
            for (int j = 0; j < array2.length; j++) {
                multiplyMatrix[i][j] = array1[i][j] * array2[i][j];
                System.out.println("\t" + multiplyMatrix[i][j]);
            }
            System.out.println("------------");
        }
    }
    public static void main(String[] args) {
        System.out.println("\n");

        // ------- Average Or Mean Grade Program --------
        //To get user's input
       Scanner scanner = new Scanner (System.in);
       System.out.println("Enter Total Array Elements");
       //To Store desired Array size from user
       int sizeOfArray = scanner.nextInt();
       if ( sizeOfArray >= 1) {
        // Get the Grades or Array elements , loop , & store in grades array
        System.out.println("Please enter desired grades for the array");
       } 
       // Checking for Zero or Negative number inputs
       else if (sizeOfArray  < 0 || sizeOfArray == 0) {
        System.out.println("Negative Numbers or Zero not allowed - last chance ");
        sizeOfArray  = scanner.nextInt();
        scanner.close();
        System.out.println("Two Strikes You out -  Peace !");
        return;
       } 
        //Store User desired size  into a grade array
        int[] gradesArray= new int[sizeOfArray];
       
       for(int i =0; i < sizeOfArray; i++){
           gradesArray[i] = scanner.nextInt();
       }
       System.out.println("AVerage Grages in Array =  " + averageGrades(gradesArray, sizeOfArray));
       scanner.close();

       System.out.println("-----------------------\n");

       //Calling irregular array Method
       myIrregularArray(); 

        //Calling irregular  Variable Arguments MEthod
       variableArgumentsMethod("VTSAX", "VOO", "VTI", "VNQ","VXUS", "VCoin", "VJones", "VTRRKX", "VS&P 500", "VTherium");

       int matrix1[][] = {{15,5,25}, {2,1,2}, {8,9,6}};
       int matrix2[][] = {{35,1,6}, {3,11,3}, {12,21,121}};

       //Calling the Adding Matrices Method(
       addingMatricesMethod(matrix1, matrix2);

        //Calling the Multiplying Matrices Method(
       multiplyingMatrices(matrix1,  matrix2);

    }//main  
}//calss 