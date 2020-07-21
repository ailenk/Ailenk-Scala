package ink.bignose.chapter17.prpxy.localcandymachine

object TestCanyMachine {
  def main(args: Array[String]): Unit = {
    //创建 一个监控器
    val mMonitor = new Monitor()

    var mCandyMachine = new CandyMachine("北京-海淀区", 6)
    mMonitor.addMachine(mCandyMachine)

    mCandyMachine = new CandyMachine("北京-昌平区~", 4)
    mCandyMachine.insertCoin()
    mCandyMachine.turnCrank()//转动曲柄，出糖
    mMonitor.addMachine(mCandyMachine)



    mCandyMachine = new CandyMachine("北京-朝阳区", 14);
    //状态修改
    mCandyMachine.insertCoin()
    mCandyMachine.turnCrank()//转动曲柄，出糖
    mMonitor.addMachine(mCandyMachine)

    mMonitor.report()
  }
}
