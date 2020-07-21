package ink.bignose.chapter18.genneric

import SeasonEm.SeasonEm

/**
  * @Author :Ailenk
  * @Date: 2017/7/15 20:17
  */
object GenericUse2 {
  def main(args: Array[String]): Unit = {

    val class1 = new EnglishClass[SeasonEm, String, String](SeasonEm.spring, "001班", "高级班")
    println(class1.classSeason + " " + class1.className + " " + class1.classType)

    val class2 = new EnglishClass[SeasonEm, String, Int](SeasonEm.spring, "002班", 1)
    println(class2.classSeason + " " + class2.className + " " + class2.classType)
  }}
// Scala 枚举类型
object SeasonEm extends Enumeration {
  type SeasonEm = Value //自定义SeasonEm，是Value类型,这样才能使用
  val spring, summer, winter, autumn = Value
}
// 定义一个泛型类
class EnglishClass[A, B, C](val classSeason: A, val className: B, val classType: C)

/*
请设计一个EnglishClass (英语班级类)，在创建EnglishClass的一个实例时，需要指定[ 班级开班季节(spring,autumn,summer,winter)、班级名称、班级类型]
开班季节只能是指定的，班级名称为String, 班级类型是(字符串类型 "高级班", "初级班"..) 或者是 Int 类型(1, 2, 3 等)

 */