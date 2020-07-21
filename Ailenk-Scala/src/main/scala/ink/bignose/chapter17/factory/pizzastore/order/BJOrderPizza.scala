package ink.bignose.chapter17.factory.pizzastore.order

import com.bignose.chapter17.factory.pizzastore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}
import ink.bignose.chapter17.factory.pizzastore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 20:10
  */
class BJOrderPizza extends OrderPizza {
  override def createPizza(t: String): Pizza = {
    println("使用工厂方法模式来编写")
    var pizza: Pizza = null
    if (t.equals("BJcheese")) {
      pizza = new BJCheesePizza
    } else if (t.equals("BJpepper")) {
      pizza = new BJPepperPizza
    }
    pizza
  }}

