package ink.bignose.chapter17.observer.lcoalinternetobserver

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 21:43
  */

class WeatherData {
  private var mTemperature: Float = _ //温度
  private var mPressure: Float = _ //气压
  private var mHumidity: Float = _ //湿度
  //天气公告板
  private var mCurrentConditions: CurrentConditions = _

  def this(mCurrentConditions: CurrentConditions) {
    this
    this.mCurrentConditions = mCurrentConditions
  }

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
    mCurrentConditions.update(getTemperature(), getPressure(), getHumidity())
  }

  def setData(mTemperature: Float, mPressure: Float, mHumidity: Float) = {
    this.mTemperature = mTemperature
    this.mPressure = mPressure
    this.mHumidity = mHumidity
    dataChange()
  }


}

