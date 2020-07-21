package ink.bignose.chapter17.abstractfactory.pizzastore.order

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 19:36
  */

import com.bignose.chapter17.abstractfactory.pizzastore
import ink.bignose.chapter17.abstractfactory.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

// OederPizza ,当我们使用抽象工厂模式后我们订购披萨思想
// 更具不同工厂创建不同pizza
class OrderPizza {
  var absFactory :AbsFactory = _
  def this(absFactory: AbsFactory) {
    this
    //多态
    breakable {
      var orderType: String = null
      var pizza: Pizza = null
      do {
        println("请输入pizza的类型 工厂方法模式")
        orderType = StdIn.readLine()
        pizza = absFactory.createPizza(orderType)
        if (pizza == null) {
          break()
        }
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
      } while (true)
    }
  }
}

