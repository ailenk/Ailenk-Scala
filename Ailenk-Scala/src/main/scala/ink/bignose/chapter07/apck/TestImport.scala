package ink.bignose.chapter07.apck

import scala.beans._ //—— 代表引入素有的包
import scala.beans.{BeanProperty,BeanDescription}//{} 选择器 选择引入包中的内容
import java.util.{ HashMap=>JavaHashMap, List}//==> 可以重命名 将javaUtil 重命名为JavaHashMap
import java.util.{ HashMap=>_, _} // 含义为 引入java.util包的所有类，但是忽略 HahsMap类.




object TestImport {
  def main(args: Array[String]): Unit = {

  }
}

class User {

  @BeanProperty var name: String = _
}

class User2 {

  @BeanProperty var name: String = _
}