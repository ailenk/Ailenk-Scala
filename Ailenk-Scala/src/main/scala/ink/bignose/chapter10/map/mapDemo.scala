package ink.bignose.chapter10.map

import scala.collection.mutable


object mapDemo01 {
  def main(args: Array[String]): Unit = {

    //底层是 元祖
    // class Map2[K, +V]    class Map3[K, +V](key1: K, valu
    // 每一对类型可以进行任意 没限制
    //在map 中底层是 Tuple2  内部有序
    val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println(map1) //Map(Alice -> 10, Bob -> 20, Kotlin -> 北京)

    //构建不可变的 map (映射 ) 无序
    val map2 =mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println(map2)//Map(Bob -> 20, Kotlin -> 北京, Alice -> 10)

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
    println(map3)//Map()

    //方式4-对偶元组
    val map4 = mutable.Map( ("A", 1), ("B", 2), ("C", 3),("D", 30) )
    println("map4=" + map4)
    println(map4("A"))

    val map5 = mutable.Map( ("A", 1), ("B", 2), ("C", 3),("D", 30.9) )
    // 方法2 使用containts先判断在取值，可以防止异常，并加入相应的处理逻辑
    //  def contains(key: K): Boolean = get(key).isDefined
    if( map5.contains("F") ) {
      println("key存在 值= " + map5("F"))
    } else {
      println("key不存在")
    }


    var map6 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    //方法3
    println(map6.get("A")) //Some
    println(map6.get("A").get) //得到Some在取出

    //方法 4  返回默认
    /**
      *  def getOrElse[V1 >: V](key: K, default: => V1): V1 = get(key) match {
         case Some(v) => v
         case None => default
  }
      */
    println(map6.getOrElse("F","默认"))

//    如何选择取值方式建议
//    如果我们确定map有这个key ,则应当使用map(key), 速度快
//    如果我们不能确定map是否有key ,而且有不同的业务逻辑，使用map.contains() 先判断在加入逻辑
//      如果只是简单的希望得到一个值，使用map4.getOrElse("ip","127.0.0.1")




  }
}
