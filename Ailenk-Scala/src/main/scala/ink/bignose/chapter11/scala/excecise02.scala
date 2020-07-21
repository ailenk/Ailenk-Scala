package ink.bignose.chapter11.scala

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * @Author :bignose
  * @Date: 2017/8/9 20:33
  */
object excecise02 {
  def main(args: Array[String]): Unit = {

//    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDD"
//
//    def charCount(map:Map[Char,Int],char:Char): Map[Char,Int] = {
//     map + (char->(map.getOrElse(char,0)+1))
//    }
//    //  map 被打散
//    val map2 = sentence.foldLeft(Map[Char, Int]())(charCount)
//    println(map2)


    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDD"

    def charCount(map:mutable.Map[Char,Int], char:Char): mutable.Map[Char,Int] = {
      map + (char->(map.getOrElse(char,0)+1))
    }
    //  map 被打散
    val map2 = sentence.foldLeft(mutable.Map[Char, Int]())(charCount)
    println(map2)

  }


}
