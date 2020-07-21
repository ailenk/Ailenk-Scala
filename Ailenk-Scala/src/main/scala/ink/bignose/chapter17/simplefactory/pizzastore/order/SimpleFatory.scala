package ink.bignose.chapter17.simplefactory.pizzastore.order

import com.bignose.chapter17.simplefactory.pizzastore.pizza.{CheesePizza, GreekPizza, PepperPizza}
import ink.bignose.chapter17.simplefactory.pizzastore.pizza.{CheesePizza, GreekPizza, PepperPizza, Pizza}

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 19:45
  */
object SimpleFatory {
  //提供一个Pizza 的方法 有需要创建爱你Pizza时调用改方法即可
  def  createPizza(t : String ): Pizza ={
    var pizza:Pizza = null
    if (t.equals("greek")) {
      pizza = new GreekPizza
    } else if (t.equals("pepper")) {
      pizza = new PepperPizza
    } else if (t.equals("cheese")) {
      pizza = new CheesePizza
    }
    return pizza
  }

}
