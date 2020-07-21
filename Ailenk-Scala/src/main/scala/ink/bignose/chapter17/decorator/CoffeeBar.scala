package ink.bignose.chapter17.decorator

import java.io.FilterInputStream

import com.bignose.chapter17.decorator.mycoffee.{Espresso, LongBlock}
import com.bignose.chapter17.decorator.mydecorator.Milk
import ink.bignose.chapter17.decorator.mycoffee.LongBlock
import ink.bignose.chapter17.decorator.mydecorator.{Chocolate, Milk}

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 20:44
  */
object CoffeeBar {
  def main(args: Array[String]): Unit = {
//    val order:Drink =new Espresso
//    println("order1 price"+order.cost)
//    println("order1 price"+order.description)


    var order2: Drink = new LongBlock
    order2=new Milk(order2)
    order2=new Chocolate(order2)
    order2=new Chocolate(order2)
    println("order2 price"+order2.cost())
    println("order2 description"+"   "+order2.getDescription())

//    FilterInputStream

  }

}
