package ink.bignose.chapter08.childGame

object childgame {
  def main(args: Array[String]): Unit = {
    var child = new Child02("child")
    var child2 = new Child02("child2")
    var child3 = new Child02("child3")
    Child02.joinGame(child)
    Child02.joinGame(child2)
    Child02.joinGame(child3)
    Child02.showSum()
  }
}

class Child02(inName: String) {

  var name = inName
}

object Child02 {
  var totalChildNum = 0

  def joinGame(child: Child02): Unit = {
    println("小孩:" + child.name)
    totalChildNum += 1
  }

  def showSum(): Unit = {
    println("小孩总数:" + totalChildNum)

  }
}
