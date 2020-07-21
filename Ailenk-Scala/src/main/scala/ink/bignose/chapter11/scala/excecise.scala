package ink.bignose.chapter11.scala

import scala.collection.mutable.ArrayBuffer

/**
  * @Author :bignose
  * @Date: 2017/8/9 20:33
  */
object excecise {
  def main(args: Array[String]): Unit = {
    //打散折叠  递归或 只有一个对象  一个字爽
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val arrayBuff =new ArrayBuffer[Char]()
    sentence.foldLeft(arrayBuff)(putArray)
    println("sentence" +arrayBuff)


  }

  def putArray(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }
}
