package ink.bignose.chapter17.observer.internetWeather

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 22:29
  */
object InternetWeather { //测试
  def main(args: Array[String]): Unit = {
    val mWeatherDataSt = new WeatherDataSt()
    val mCurrentConditions = new CurrentConditions()
    val mForcastConditions = new CurrentConditions()
    mWeatherDataSt.registerObserver(mCurrentConditions)
    mWeatherDataSt.registerObserver(mForcastConditions)
    mWeatherDataSt.setData(30, 150, 40)
    println("+++++++++++")
    mWeatherDataSt.removeObserver(mCurrentConditions)
    mWeatherDataSt.setData(40, 250, 50)

  }}

