package ink.bignose.chapter07.abstactdemo

object accounttest {
  def main(args: Array[String]): Unit = {
    val account = new Account("00001", 390, "111111")
    account.query("111111")
    account.withDraw("111111", 2000)

  }

}

class Account(inAcccount: String, inBalance: Double, inPwd: String) {
  /**
    * 属性：
    * 账号
    * 密码
    * 查询
    * 取款
    * 存款
    */
  val cccountNo = inAcccount
  var balance = inBalance
  var pwd = inPwd

  def query(pwd: String): Unit = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }
    println("余额为" + cccountNo, this.balance)
  }

  def withDraw(pwd: String, money: Double): Any = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }
    if (this.balance < money) {
      println("余额不足")
      return
    }
    this.balance - money
    money
  }

}
