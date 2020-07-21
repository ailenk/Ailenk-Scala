package ink.bignose.chapter16.wordcount

import scala.collection.mutable

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 18:39
  */
object wordcount {
  def main(args: Array[String]): Unit = {
    val lines = List("bignose han hello ", "bignose han aaa aaa aaa ccc ddd uuu")
    //     使用映射集合，list中，各个单词出现的次数，并按出现次数排序
    //    val mtT = lines.flatMap(_.split(" "))
    //      .map((_, 1))
    //      .groupBy(_._1)
    //      .map(x => (x._1, x._2.size))
    //      .toList.sortBy(_._1).reverse
    //
    //    println(mtT)

    var mapTm = new mutable.HashMap
    val mtmapList = lines.flatMap(_.split(" "))
      .map((_, 1))
    println(mtmapList)
    val size = mtmapList.size
    mtmapList.foreach((x: (String, Int)) => {

    })


    //    val res4 = res3.map((x: (String, List[(String, Int)])) => (x._1, x._2.size))


    //
    //    //分步完成 1.扁平
    //    // var res1 = lines.flatMap((s: String) => s.split(" "))
    //    var res1 = lines.flatMap(_.split(" "))
    //    println("res1=" + res1)
    //    //2.卓成对偶list 才能分组统计
    //    //val res2 = res1.map((s: String) => (s, 1))
    //    val res2 = res1.map((_, 1))
    //    println("res2=" + res2)
    //
    //    //3.分组 把不同的单词 归属到不同的组中
    //    //   val res3= res2.groupBy((x:(String,Int))=>x._1)
    //    val res3 = res2.groupBy(_._1)
    //    println("res3=" + res3)
    //
    //    //4.对上面的各个元祖进行统计大小
    //    //    val res4 = res3.map((x: (String, List[(String, Int)])) => (x._1, x._2.size))
    //    val res4 = res3.map(x => (x._1, x._2.size))
    //    println("res4=" + res4)
    //    //5. 排序
    //    //    val res5 = res4.toList.sortBy((x: (String, Int)) => x._2)
    //    val res5 = res4.toList.sortBy(_._2)
    //    println("res5=" + res5)
    //
    //    // 合并
    //
    //    println("合并::::" + lines.flatMap(_.split(" "))
    //      .map((_, 1))
    //      .groupBy(_._1)
    //      .map(x => (x._1, x._2.size))
    //      .toList.sortBy(_._2).reverse)
    //
  }
}
