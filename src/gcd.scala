
//importing scanner class to take user input
import java.util.Scanner
object gcd 
{
  
   //Main method declaration
  def main(args: Array[String]): Unit =
  {    
    println("-------------GCD OF TWO NUMBERS--------------")
    println()

    //Taking two numbers from User    
    println("Enter First Number ")
    var num1 = scala.io.StdIn.readInt()
    
    println("Enter Second Number ")
    var num2 =scala.io.StdIn.readInt()
   
    var i=1;
    var gcd =1;
   //Logic for Calculating GCD
    
   for(i <- 1 to num1 ; i <- 1 to num2)
    {
      //if the number divides both the user input then take it as gcd
      if((num1 % i == 0) && (num2 % i ==0))
      {
        gcd = i 
      } 
    }   
   //Displaying GCD of Two numbers
   println(s"GCD OF $num1 and $num2 is : $gcd")
 }
}
