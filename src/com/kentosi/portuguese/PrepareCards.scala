package com.kentosi.portuguese

import scala.io.Source

object PrepareCards extends App {
  if (args.length == 0) {
    println("Expecting filename as arg[0].")
    System.exit(1)
  }

  def div(s: String) = s"<div>${s}</div>"

  val s1 = Source.fromFile(args(0)).mkString

  val s2 = s1.split("\n\n")
    .map(p => p.replace("\t", "  ").split("\n").toList)
    .map(p => List(div(p(0)) + "\t") ++ List(p.drop(1).map(div(_)).mkString("<div><br/></div>")))
    .map(p => p.mkString).mkString("\n")

  println(s2)
}
