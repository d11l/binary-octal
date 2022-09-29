import java.util.Scanner;

public class binary_octal {

/**
     * @param args
 * @Abdulrahman 
 */
  public static void main(String[] args) {
        
  Scanner in = new Scanner(System.in); 

  System.out.println("To convert a number from binary to octal, write 1\nTo convert a number from octal to binary, write 2");
  
  System.out.print("Write here: ");
  int Choice = in.nextInt();
  
  System.out.print("Write the number: ");
  int number = in.nextInt();
  
  switch(Choice){
  case 1:
  bin_to_oct(String.valueOf(number)); 
  break;
  case 2:
  oct_to_bin(number); 
  break;
  default:System.out.println("Error!");
  }        
}
 
   
 public static void oct_to_bin(int octal) {
  String binary = "",
  octall=String.valueOf(octal);
  char T =' ';
 
   for(int i =0;i<octall.length();i++){
       T = octall.charAt(i);
        switch(T){
        case '0':
            binary += "000";
            break;
        case '1':
            binary += "1";
            break;
            case '2':
    binary += "010";
    break;
case '3':
    binary += "011";
    break;
case '4':
    binary += "100";
    break;
case '5':
    binary += "101";
    break;
case '6':
    binary += "110";
    break;
case '7':
    binary += "111";
    break;
        }}
     
 System.out.println(binary);
}
 
public static void bin_to_oct(String b) {
    
int d = Integer.parseInt(b,2);
int octal = 0 , c = 1;

    while(d != 0){
   int remainder = d % 8;
   octal += remainder * c;
   c = c * 10;
   d /= 8;
   }     
   System.out.println(octal);
}
 
    
}
