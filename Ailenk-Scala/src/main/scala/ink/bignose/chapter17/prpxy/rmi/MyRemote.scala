package ink.bignose.chapter17.prpxy.rmi

import java.rmi.{Remote, RemoteException}

/**
  * @Author :Ailenk
  * @Date: 2017/7/15 19:15
  */
trait MyRemote extends Remote {
  //一个抽象方法
  @throws(classOf[RemoteException])
  def sayHello(): String //throws RemoteException
}

