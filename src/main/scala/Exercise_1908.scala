import scala.io.StdIn.readLine

object Exercise_19_08 extends App {
  // write a function to calculate Farenheit from Celsius
  // f = 32 + c*9/5

  def Fareheit(c: Double) = println(s"Farenheit from $c C is ${32 + c * 9 / 5}")

  val f = readLine("Please write an Celsius amount you want to convert to Farenheit").trim.toDouble
  Fareheit(f)
}
