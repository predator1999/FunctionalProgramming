//19000669

object Main extends App {
	class Rational(x:Int, y:Int) {
		private def gcd(a:Int, b:Int) :Int = {
			if(b==0) a else gcd(b, a%b)
		}
		private val g = gcd(x,y)
		def num = x/g;
		def den = y/g;

		def neg() = new Rational(-this.num, this.den)
		def -(r:Rational) = new Rational(this.num*r.den - r.num*this.den, den*r.den)

		override def toString = num + "/" + den;
	}

	val x = new Rational(3,4)
	val y = new Rational(5,8)
	val z = new Rational(2,7)

	val answer = x-y-z
	println(answer.toString)

	class Account(id:String, acc:Int, b:Double) {
		val nic:String = id
		val accNumber:Int = acc
		var balance:Double = b

		def transfer(acc:Account, amt:Double) = {
			this.balance -= amt
			acc.balance += amt
		}

		override def toString = "[" + nic + ":" + accNumber + ":" + balance +"$]"
	}

	var account1 = new Account("1111v", 12, 1200.0)
	var account2 = new Account("1511v", 16, -100.0)
	var account3 = new Account("1121v", 11, 200.0)

	val bank:List[Account] = List(account1, account2, account3)
	
	val totalBalance = (bank:List[Account]) => bank.reduce((acc1, acc2) => new Account("", 0, acc1.balance+acc2.balance)).balance
	val overdraft = (bank: List[Account]) => bank.filter(ac => ac.balance<0)
	val interest = (bank: List[Account]) => bank.map(ac=>if(ac.balance >=0) ac.balance*1.05 else ac.balance*1.1)
	val balanceAfterInterest = (interest: List[Double]) => interest.reduce((balance1, balance2) => balance1 + balance2) 
	
	println("Accounts with negative balance => " + overdraft(bank).toString)
	
    println("Sum of all account balances => " + totalBalance(bank))
	
	println("Final balance of all accounts after apply interest function  => " + balanceAfterInterest(interest(bank)))

}
