import java.util.Scanner;
class Main {
public static void main(String args[]){
int rows,columns;//declare variable size
    Scanner scan=new Scanner(System.in); 
    //create a scanner object for input
System.out.print("---Enter the nunber of rows:--- ");
rows=scan.nextInt();
//get input from the user for row
System.out.print("---Enter the nunber of coloumns:--- ");
columns=scan.nextInt();
//get input from the user for coloum
for (int i=1; i<=rows; i++){
    for (int j=1; j<=columns; j++){
    if(i==1||i==rows||j==1||j==columns){
        System.out.print("*");
    }else{
        System.out.print(" ");
    }
    
}
    System.out.print("\n");
}
}
}