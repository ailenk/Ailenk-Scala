package ink.bignose.chapter17.factory.pizzastore.order

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 19:36
  */

import com.bignose.chapter17.factory.pizzastore.pizza
import com.bignose.chapter17.factory.pizzastore.pizza.Pizza
import ink.bignose.chapter17.factory.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

abstract class OrderPizza {

  breakable {
    var orderType: String = null
    var pizza: Pizza = null
    do {
      println("请输入pizza的类型 工厂方法模式")
      orderType = StdIn.readLine()
      //      if (orderType.equals("greek")) {
      //        //创建pizza
      //        this.pizza = new GreekPizza
      //      } else if (orderType.equals("pepper")) {
      //        //创建pizza
      //        this.pizza = new PepperPizza
      //      } else {
      //        break()
      //      }
      pizza =createPizza(orderType)
      if (pizza == null) {
        break()
      }
      pizza.prepare()
      pizza.bake()
      pizza.cut()
      pizza.box()
    } while (true)
  }
  //抽象的方法 createPizza ,让哥哥子类去实现
  def createPizza(t:String):Pizza
}

