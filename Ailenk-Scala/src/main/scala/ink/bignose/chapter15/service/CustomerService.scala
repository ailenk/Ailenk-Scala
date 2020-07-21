package ink.bignose.chapter15.service

import com.bignose.chapter15.bean.Customer
import ink.bignose.chapter15.bean.Customer

import scala.collection.mutable.ArrayBuffer
import util.control.Breaks._

/**
  * @Author :bignose
  * @Date: 2017/8/11 10:28
  */
class CustomerService {

  var customerNum = 1

  val customers = ArrayBuffer(new Customer(1, "tom", '男', 10, "110", "tom@qq.com"))

  def list(): ArrayBuffer[Customer] = {
    this.customers
  }

  // 添加客户
  def add(customer: Customer): Boolean = {
    //设置id
    customerNum += 1
    customer.id = customerNum
    customers.append(customer)
    true
  }

  def del(id:Int):Boolean={
    val index =findIndexById(id)
    if(index!= -1){
      customers.remove(index)
      true
    }else {
      false


    }

  }


  // 根据id 找到index 索引

  def findIndexById(id: Int) = {
    var index = -1 //如果找到修改对应，如果没有-1
    breakable {
      println(customers.length)
      for (i <- 0 until customers.length) {
        if (customers(i).id == id) {
          index = i
          break()
        }
      }
    }
    index // 返回
  }



}
