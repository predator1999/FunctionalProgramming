object cipher extends App {

    def encrypt (str:Char):Char={
        if (str.toInt >= 65 && str.toInt < 90)
            return (str.toInt+1).toChar
        else if (str.toInt == 90) //Case of letter "Z"
            return 'A'
        else    //Case of none uppercase letter
            return str
    }

    def decrypt (str:Char):Char={
        if (str.toInt > 65 && str.toInt <= 90)
            return (str.toInt-1).toChar
        else if (str.toInt == 65) //Case of letter "A"
            return 'A'
        else    //Case of none uppercase letter
            return str
    }

    val str = "ABCDZSFS12SDKFN"
    val ep = str.toCharArray.map(encrypt).mkString("")
    val dp =  str.toCharArray.map(decrypt).mkString("")
    println("encrypt "+ep)
    println("decrypt "+dp)
    
}