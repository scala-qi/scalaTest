package com.qi.scalatest.connector_test

object SortTest {


  private def bubbleSort = {
    val forSort = Array(43, 21, 25, 34, 74, 2, 75)

    for (i <- 0 until forSort.length; j <- 0 until forSort.length - i - 1) {
      if (forSort(j) > forSort(j + 1)) {
        val tmp = forSort(j)
        forSort(j) = forSort(j + 1)
        forSort(j + 1) = tmp
      }
    }

    println("=================================")

    forSort.foreach(x => println(x))
  }

//冒泡排序
  def bubbleSort2(): Unit = {
    var temp = 0
    val arr = Array(4, 3, 7, 2, 9, 5, 0, 6)
    for (i <- 0 to arr.length - 2) {
      for (j <- 0 to arr.length - 2 - i) {
        if (arr(j) > arr(j + 1)) {
          temp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = temp
        }
      }
    }

    arr.foreach(x => println(x))
  }

//选择排序
  def selectSort(): Unit = {
    var temp = 0
    val arr = Array(4, 3, 7, 2, 9, 5, 0, 6)
    for (i <- 0 to arr.length - 2) {
      for (j <- i + 1 to arr.length - 1) {
        if (arr(i) > arr(j)) {
          temp = arr(j)
          arr(j) = arr(i)
          arr(i) = temp
        }
      }
    }
    arr.foreach(x => println(x))
  }

//插入排序
  def insertSort(): Unit ={
    var temp = 0
    val arr = Array(4, 3, 7, 2, 9, 5, 0, 6)
    for(i<- 1 to arr.length-1){
      for(j<-(0 to i).reverse){
        if(j>=1 && arr(j)<arr(j-1)  ){
          temp=arr(j)
          arr(j)=arr(j-1)
          arr(j-1)=temp
        }
      }
    }
    arr.foreach(x => println(x))
  }


  def main(args: Array[String]): Unit = {

    //    bubbleSort

    //    bubbleSort2()

//    selectSort()
    insertSort()
  }


}
