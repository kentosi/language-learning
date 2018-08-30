val s1 =
  """|Card1
     |Phonetic1
     |Meaning1
     |
     |Card2
     |Phonetic2
     |Meaning2
     |
     |Card3
     |Phonetic3
     |Meaning3
|""".stripMargin

def div(s: String) = s"<div>${s}</div>"

val s2 = s1.split("\n\n")
  .map(p => p.split("\n").toList)
  .map(p => List(div(p(0)) + "\t") ++ List(p.drop(1).map(div(_)).mkString("<div><br/></div>")))
  .map(p => p.mkString).mkString("\n")