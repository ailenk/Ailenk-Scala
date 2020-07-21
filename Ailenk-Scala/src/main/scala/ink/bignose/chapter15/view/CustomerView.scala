package ink.bignose.chapter15.view

import com.bignose.chapter15.bean.Customer
import ink.bignose.chapter15.bean.Customer
import ink.bignose.chapter15.service.CustomerService

import scala.io.StdIn

/**
  * @Author :bignose
  * @Date: 2017/8/11 10:11
  */
class CustomerView {

  //定义一个循环变量控制是否退出 while
  var loop = true
  // 定义一个key 用以接收用户的选项
  var key = ' '

  val customerService = new CustomerService
  //  println("-----------------客户信息管理软件-----------------")
  //  //  1 添 加 客 户
  //  println("1 添 加 客 户")
  //  //  2 修 改 客 户
  //  println("2 修 改 客 户")
  //  //  3 删 除 客 户
  //  println("3 删 除 客 户")
  //  //  4 客 户 列 表
  //  println("4 客 户 列 表")
  //  //  5 退           出
  //  println("5 退       出")
  //
  //  请选择(1-5)：_

  def mainMun(): Unit = {
    do {

      key = StdIn.readChar()
      key match {
        case '1' => this.add()
        case '2' => println("2 修 改 客 户")
        case '3' => this.del()
        case '4' => this.list()

        case '5' => println("5 退       出")
      }
    } while (loop)
  }

  def list(): Unit = {
    println()
    println("4 客 户 列 表-------------------")
    println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱")
    //for 循环
    //1. 获取customerService 的customer ArrayBuffer
    val customerList = customerService.list()
    for (customer <- customerList) {
      println(customer)
    }
  }

  // 添加用户
  def add(): Unit = {
    println("1.请输入姓名")
    var name = StdIn.readLine()
    println("2.请输入性别")
    var gender = StdIn.readChar()
    println("3.请输入年龄")
    var age = StdIn.readShort()
    println("4.请输入电话号码")
    var tel = StdIn.readLine()
    println("5.请输入email")
    var email = StdIn.readLine()

    val customer = new Customer(name, gender, age, tel, email)
    customerService.add(customer)
    println("添加成功")
  }

  def del(): Unit = {
    println("1删除客户开始")
    val id = StdIn.readInt()
    if (id == -1) {
      println("2删除客户失败")
      return
    }
    println("3是否删除请输入y or n")
    val choice = StdIn.readChar().toLower
    if ('y'==choice) {
      if (customerService.del(id)) {
        println("4删除完成")
      }
      return
    }
    println("5删除未完成")


  }

}
