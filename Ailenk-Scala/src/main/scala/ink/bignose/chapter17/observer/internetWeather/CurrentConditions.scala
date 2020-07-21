package ink.bignose.chapter17.observer.internetWeather

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 21:44
  */
// 这个是 气象局提供的核心类
class CurrentConditions extends ObServer{
  private var mTemperature: Float = _ //温度
  private var mPressure: Float = _ //气压
  private var mHumidity: Float = _ //湿度
  def display() = {
    println("***Today mTemperature: " + mTemperature + "***")
    println("***Today mPressure: " + mPressure + "***")
    println("***Today mHumidity: " + mHumidity + "***")
  }

  override  def update(mTemperature: Float, mPressure: Float, mHumidity: Float) = {
    this.mTemperature = mTemperature
    this.mPressure = mPressure
    this.mHumidity = mHumidity
    display()
  }
}

