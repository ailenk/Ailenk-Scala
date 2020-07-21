package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 18:56
  */
object Abstactcontroller {
  def main(args: Array[String]): Unit = {
    def myRunInThread(f1: () => Unit) = {
      new Thread {
        override def run(): Unit = {
          f1()
        }
      }.start()
    }

    myRunInThread {
      () =>
        println("干活咯！5秒完成...")
        Thread.sleep(5000)
        println("干完咯！")
    }

    //可以变成

    def myRunInThread2(f1: => Unit): Unit = {
      new Thread {
        override def run(): Unit = {
          f1
        }
      }.start()
    }


    myRunInThread2 { //说明
      println("干活咯！5秒完成...")
      Thread.sleep(5000)
      println("干完咯！")
    }


  }
}
