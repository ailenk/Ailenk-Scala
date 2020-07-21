package ink.bignose.chapter05.functiondetail

object mysqlcon {
  def main(args: Array[String]): Unit = {
    mysqlCon()
    mysqlCon("127.0.0.1",777)
    //带名参数
    mysqlCon(user = "tom",pwd = "123456")
//    f6("v2" )  // (?) 报错
//    f6(p2="v2") // (?) v1+v2
  }
  def mysqlCon(add:String = "localhost",port : Int = 3306,
               user: String = "root", pwd : String = "root"): Unit = {
    println("add=" + add)
    println("port=" + port)
    println("user=" + user)
    println("pwd=" + pwd)
  }


  def f6 ( p1 : String = "v1", p2 : String ) {
    println(p1 + p2);
  }


}
