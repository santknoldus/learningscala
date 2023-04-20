package com.knoldus.learningscala

import scala.annotation.tailrec

case class Node(data: Int, var next: Node)

class LinkedList {

  var head: Node = null

  def addNewNodeAtLast(element: Int): Unit = {
    @tailrec
    def inserting(node: Node): Unit = {
      if (node.next == null) {
        node.next = Node(element, null)
      }
      else inserting(node.next)
    }

    if (head == null) head = Node(element, null)
    else inserting(head)
  }

  def addNewNodeAtBeginning(element: Int): Unit = {
    if (head == null) head = Node(element, null)
    else {
      val temp = head
      head = Node(element, temp)
    }
  }

  def traverse: List[Int] = {
    @tailrec
    def traversing(node: Node, list: List[Int]): List[Int] = {
      if (node.next == null) list :+ node.data
      else traversing(node.next, list :+ node.data)
    }

    if (head == null) throw new IllegalStateException("List is empty")
    else traversing(head, List())
  }

  def deleteLastNode: Node = {
    @tailrec
    def deleting(node: Node): Node = {
      if (node.next.next == null) {
        val temp = node.next.next
        node.next = null
        temp
      }
      else deleting(node.next)
    }

    if (head == null) throw new IllegalStateException("List is Empty")
    else if (head.next == null) {
      val temp = head
      head = null
      temp
    }
    else deleting(head)
  }

  def deleteFirstNode: Node = {
    if (head == null) throw new IllegalStateException("List is Empty")
    else {
      val temp = head.next
      head = temp
      temp
    }
  }

}

object ListOfNode extends App {

  val linkedList = new LinkedList
  linkedList.addNewNodeAtBeginning(1)
  linkedList.addNewNodeAtLast(2)
  linkedList.addNewNodeAtLast(3)
  linkedList.addNewNodeAtLast(4)
  linkedList.addNewNodeAtBeginning(0)
  println(linkedList.traverse)
  linkedList.deleteLastNode
  println(linkedList.traverse)
  linkedList.deleteFirstNode
  println(linkedList.traverse)
}