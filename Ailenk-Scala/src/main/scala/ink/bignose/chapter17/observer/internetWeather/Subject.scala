package ink.bignose.chapter17.observer.internetWeather

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 22:19
  */
trait Subject {
  //注册
  def registerObserver(o: ObServer)
  //移除
  def removeObserver(o: ObServer)
  //通知
  def notifyObservers()
}

