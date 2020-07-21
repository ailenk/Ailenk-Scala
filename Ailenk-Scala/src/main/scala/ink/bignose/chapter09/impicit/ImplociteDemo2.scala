package ink.bignose.chapter09.impicit

object ImplociteDemo2 {
  def main(args: Array[String]): Unit = {
    implicit def addDelete(mysql:MySQL): DB = {
      new DB //
    }
    val mysql = new MySQL
    mysql.insert()
    mysql.delete() //?

  }
}

class MySQL {
  def insert(): Unit = {
    println("insert")
  }
}

class DB {
  def delete(): Unit = {
    println("delete")
  }
}
