```scala
import scala.util.{Try, Success, Failure}

class MyClass {
  def myMethod(input: String): Either[String, Int] = {
    Try(input.toInt) match {
      case Success(i) => Right(i)
      case Failure(e) => Left(s"Error converting '$input' to Int: ${e.getMessage}")
    }
  }
}
```