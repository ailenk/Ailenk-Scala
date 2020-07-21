package ink.bignose.chapter07

object Q6 extends App {

  import java.util.{HashMap => javaHashMap}
  import collection.mutable.{HashMap => scalaHashMap}

  var scalaMap =new scalaHashMap[Int, String]
  var javaMap = new javaHashMap[Int, String]
  javaMap.put(1, "one")

  //javaMap.keySet().toArray() 这个是转为数组
  //key.asInstanceOf[Int] 转为Int
  //javaMap.get(key) 获取值
  //+(key.asInstanceOf[Int] -> javaMap.get(key)) map
  for (key <- javaMap.keySet().toArray()) {
    scalaMap += (key.asInstanceOf[Int] -> javaMap.get(key))
  }
  println(scalaMap.mkString(" "))
}
