package ink.bignose.chapter10.scalaDemo

import scala.collection.mutable.ArrayBuffer


object tobufftoarray {
  def main(args: Array[String]): Unit = {
    //说明  定长与河边数组 相互转换
    val arr2 = ArrayBuffer[Int]()
    // 追加值
    arr2.append(1, 2, 3)
    println(arr2)

    /*
      def toArray[B >: A : ClassTag]: Array[B] = {
    if (isTraversableAgain) {
      val result = new Array[B](size)
      copyToArray(result, 0)
      result
    }
     */
    val newArr = arr2.toArray;
    println(newArr)

    /*
      override def toBuffer[A1 >: A]: mutable.Buffer[A1] = {
    val result = new mutable.ArrayBuffer[A1](size)
    copyToBuffer(result)
    result
  }
     */
    val newArr2 = newArr.toBuffer
    newArr2.append(123)
    println(newArr2)

  }
}
