package ink.bignose.chapter10.map

import scala.collection.mutable


object mapDemo02 {
  def main(args: Array[String]): Unit = {

    //底层是 元祖
    // class Map2[K, +V]    class Map3[K, +V](key1: K, valu
    // 每一对类型可以进行任意 没限制
    //在map 中底层是 Tuple2  内部有序
    val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println(map1) //Map(Alice -> 10, Bob -> 20, Kotlin -> 北京)

    //构建不可变的 map (映射 ) 无序
    val map2 = mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println(map2) //Map(Bob -> 20, Kotlin -> 北京, Alice -> 10)

    /*
    说明:
        如果key存在，则返回对应的值
        如果key不存在，则抛出异常[java.util.NoSuchElementException]
        在Java中,如果key不存在则返回null
     */
    val value1 = map2("Alice")
    println(value1)

    //方式3-创建空的映射
    val map3 = new scala.collection.mutable.HashMap[String, Int]
    println(map3) //Map()

    /**
      * map 是可变的，才能修改，否则报错
      * 如果key存在：则修改对应的值,key不存在,等价于添加一个key-val
      */
    val map4 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    //    map4("A") = 20
    //    map4("AA") = 20
    //    println(map4)
    //
    //
    //    map4 += ( "D" -> 4 )
    //    map4 += ( "F" -> 50 )
    //    println(map4)

    val map5 = map4 + ("E" -> 1, "F" -> 3)
    map4 += ("EE" -> 1, "FF" -> 3)
    println("map4:::" + map4)
    println("map5:::" + map5)

    //
    //  def -=(elem: A): this.type
    map4 -= ("A", "B")
    println("map4=" + map4)

    for ((k, v) <- map1) {
      println(k + " is mapped to " + v)
    }
    for (v <- map1.keys){
      println(v)
    }
    for (v <- map1.values){
      println(v)
    }
    //而元组 Tuple2
    for (v <- map1){
      println(v._1+v._2) //v是Tuple?

    }

  }
}
