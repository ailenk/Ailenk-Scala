package ink.bignose.chapter17.observer.lcoalinternetobserver

import com.bignose.chapter17.observer.lcoalinternetobserver.CurrentConditions

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 21:50
  */
object InternetWeather {
  def main(args: Array[String]): Unit = {
    //创建 一个气象局的 天气公告板
    val mCurrentConditions = new CurrentConditions
    //天气变化
    val mWeatherData = new WeatherData(mCurrentConditions)
    //设置变化
    mWeatherData.setData(30, 40, 50)

    mWeatherData.setData(40, 40, 40)

  }
}
