package com.rockthejvm
import com.myCollection

object Playground extends App {
  val mySet = myCollection.Set.empty.add("bob").add("alice")
  println(mySet("jon"))
}

