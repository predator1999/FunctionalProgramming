/* 19000669 */

object recursiveActivity extends App {

  /* Question 1 */
  def prime (x:Int,y:Int=2):Boolean= x match{
    case x if x<2 => false
    case x if x==2 => true
    case x if x%y==0 => false
    case x if x<y*y => true
    case _ => prime(x,y+1)
    }

  /* Question 2 */
  def primeSequence(x: Int): Unit = x match {
    case 0 => return
    case _ => { primeSequence (x-1); if (prime(x)) print(x+", ")}
    }

  /* Question 3 */
  def sum(x: Int): Int = x match {
    case 1 => 1
    case _ => x + sum(x - 1)
  }
  

  /* Question 4 */
  def even(x:Int):Boolean= x match{
    case 0 => true
    case x if x<0 => false
    case _ => even(x-2)
    }


  /* Question 5 */
  def evenSum(x: Int): Int = x match {
    case 2 => 2
    case _ => {evenSum(x-1)+ {if (even(x)) x else 0}}
    }

  /* Question 6 */
  def fib(n: Int): Int = n match {
    case 1|0 => n
    case _ => fib(n - 1) + fib(n - 2)
    }


  def fibSequence(n: Int): Unit = {
    if (n > 0) fibSequence(n - 1)
    print(fib(n) + ", ")
  }

}
