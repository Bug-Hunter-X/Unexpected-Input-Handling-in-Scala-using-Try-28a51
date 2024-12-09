```scala
import scala.util.Try

class MyClass {
  def myMethod(input: String): Int = {
    Try(input.toInt).getOrElse(0) // This is where the potential bug is
  }
}
```