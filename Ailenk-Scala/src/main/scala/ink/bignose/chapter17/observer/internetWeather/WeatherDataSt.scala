package ink.bignose.chapter17.observer.internetWeather

import scala.collection.mutable.ListBuffer

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 22:21
  */
class WeatherDataSt extends Subject { //核心Subject实现类 //写
  private var mTemperature: Float = _
  private var mPressure: Float = _
  private var mHumidity: Float = _
  // 集合，用于管理 所有的观察者
  private val mObservers: ListBuffer[ObServer] = ListBuffer()

  def getTemperature() = {
    mTemperature
  }

  def getPressure() = {
    mPressure
  }

  def getHumidity() = {
    mHumidity
  }

  def dataChange() = {
    notifyObservers();
  }

  def setData(mTemperature: Float, mPressure: Float, mHumidity: Float) = {
    this.mTemperature = mTemperature
    this.mPressure = mPressure
    this.mHumidity = mHumidity
    dataChange()
  }

  override def registerObserver(o: ObServer): Unit = {
    if (!mObservers.contains(o)) {
      mObservers.append(o)
    }
  }

  override def removeObserver(o: ObServer): Unit = {
    if (mObservers.contains(o)) {
      mObservers -= o //移除
    }
  }

  override def notifyObservers(): Unit = {
    for (item <- mObservers) {
      item.update(getTemperature(), getPressure(), getHumidity())
    }
  }
}

