package ink.bignose.chapter01.test

object printdemo {
  def main(args: Array[String]): Unit = {
    var str1 : String = "hello"
    var str2 : String = "word!"
    print(str1+str2)

    //格式化输出
    var name : String= "tom"
    var age : Int = 20
    var sal : Float =10.67f
    var height : Double = 180.15
    printf("名字%s 年龄%d 薪水%.2f 身高%.3f",name,age,sal,height)

    //scala 支出$ 输出u
    println(s"个人信息如下： \n 名字$name \n 年龄$age \n 薪水$sal")
    println(s"个人信息如下： \n 名字$name \n 年龄$age \n 薪水${sal*100}")

  }
}
