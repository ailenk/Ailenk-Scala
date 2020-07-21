package ink.bignose.chapter15.bean

/**
  * @Author :bignose
  * @Date: 2017/8/11 9:57
  */
class Customer {

  //属性
  //id
  var id: Int = _
  //名称
  var name: String = _
  //性别
  var gender: Char = _
  //年龄
  var age: Short = _
  // 电话
  var tel: String = _
  // email
  var email: String = _

  // 辅助构造器
  def this(id: Int, name: String, gender: Char, age: Short, tel: String, email: String) {
    this
    this.id = id
    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }


  // 辅助构造器
  def this(name: String, gender: Char, age: Short, tel: String, email: String) {
    this
    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }


  override def toString: String = {
    this.id + "\t\t"+
    this.name + "\t\t"+
    this.gender + "\t\t"+
    this.age + "\t\t"+
    this.tel + "\t\t"+
    this.email
  }


}
