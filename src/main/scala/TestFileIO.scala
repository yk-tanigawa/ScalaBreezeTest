


/**
 * Created by yosuke on 10/31/15.
 */
object TestFileIO {
  import scala.io.Source


  val s = Source.fromFile("./build.sbt")
  try {
    for (line <- s.getLines) {
      println(line)
    }
  } finally {
    s.close
  }

}
