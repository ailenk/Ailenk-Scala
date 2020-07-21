package ink.bignose.chapter17.decorator.mycoffee

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 20:31
  */
//这个是单品 coffee 在装饰着设计模式是concrete
class LongBlock extends Coffee{
  // 使用构造器
  super.setDescription("LongBlock")
  super.setPrice(5.0f)

}
