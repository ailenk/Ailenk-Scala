package ink.bignose.chapter17.simplefactory.pizzastore.order

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 19:36
  */

import com.bignose.chapter17.simplefactory.pizzastore.pizza.{GreekPizza, PepperPizza, Pizza}
import ink.bignose.chapter17.simplefactory.pizzastore.pizza.Pizza

import scala.util.control.Breaks._
import scala.io.StdIn
class OrderPizza {
  var orderType:String = _
  var pizza:Pizza = _
  breakable {
    do {
      println("请输入pizza的类型 简单工厂模式")
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
      pizza =SimpleFatory.createPizza(orderType)
      if(pizza ==  null){
        break()
      }
      this.pizza.prepare()
      this.pizza.bake()
      this.pizza.cut()
      this.pizza.box()
    } while (true)
  }}

