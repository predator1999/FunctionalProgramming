//19000669
object Assignment1 extends App {
    def convertToFahrenheit (x:Double)=x*1.8+32

    def volumeOfSphere(r:Double) = (4/3)  * (22/7) * r * r * r

    def totalCost( c:Double) = {
        val priceAfterDiscount =  24.95 * 0.65 * c
        val shippingCost = 3.00

        if(c > 50){
            priceAfterDiscount + shippingCost + (c - 50) * 0.75
        } else {
            priceAfterDiscount + shippingCost
        }
    }
    
    println(convertToFahrenheit(35)+ " Fahrenheit");
    println(volumeOfSphere(5)+ " Units");
    println(totalCost(60)+ " Ruppees");

}