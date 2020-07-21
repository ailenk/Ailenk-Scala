package ink.bignose.chapter17.observer.internetWeather

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 22:20
  */

trait ObServer {
  //   //等待观察者
  def update(mTemperatrue: Float, mPressure: Float, mHumidity: Float)
}

