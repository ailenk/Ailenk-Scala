// 包 中不能有方法  不能有定义

package ink.bignose.chapter07.scalapackage.packageImport02

//1.每个包都可以有一个包对象。你需要在父包(ink.bignose)中定义它,且名称与子包一样。
  //2.创建一个包对象  是 ink.bignose.scala 包对象
  //3. 在包对象中可以定义 方法 变量  可以在对应的包中使用

  //原理 生成package 与package$  两个文件
  //调用 .. $  封装成静态对象的name 方法
  package object scala {
    var name = "jack"

    def sayOk(): Unit = {
      println("package object sayOk!")
    }
  }
  class Test {
      def test(): Unit = {
        //这里的name就是包对象scala中声明的name
        println(name)
        sayOk() //这个sayOk 就是包对象scala中声明的sayOk
      }
    }

    object TestObj {
      def main(args: Array[String]): Unit = {
        val t = new Test()
        t.test()
        //因为TestObje和scala这个包对象在同一包，因此也可以使用
        println("name=" + name)
      }
    }
