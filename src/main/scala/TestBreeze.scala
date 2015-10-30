/**
 * Created by yosuke on 10/31/15.
 */
object TestBreeze {
  import breeze.linalg._
  val M1 = DenseMatrix((1.0, 2.0), (3.0, 4.0))
  val v4 = DenseVector(1.0, 2.0)

  println(M1)
  println(M1 * v4)
}
