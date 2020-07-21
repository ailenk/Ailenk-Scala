package ink.bignose.chapter17.abstractfactory.pizzastore.order

import com.bignose.chapter17.abstractfactory.pizzastore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}
import ink.bignose.chapter17.abstractfactory.pizzastore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 20:27
  */
// 这是实现了AbsFactory的 子工厂类
// 如果我们希望 订购背景的Pizza 就使用该工厂类
class BJFactory extends AbsFactory {
  override def createPizza(t: String): Pizza = {
    var pizza: Pizza = null
    if (t.equals("BJcheese")) {
      pizza = new BJCheesePizza
    } else if (t.equals("BJpepper")) {
      pizza = new BJPepperPizza
    }
    return pizza
  }
}

