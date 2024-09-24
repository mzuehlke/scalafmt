package org.scalafmt.community.scala2

import org.scalafmt.community.common.CommunityRepoSuite

import scala.meta._

abstract class CommunityScala2Suite(name: String)
    extends CommunityRepoSuite("https://github.com/scala/scala.git", name)

class CommunityScala2_11Suite extends CommunityScala2Suite("scala-2.11") {

  override protected def builds =
    Seq(getBuild("v2.11.12", dialects.Scala211, 1286))

}

class CommunityScala2_12Suite extends CommunityScala2Suite("scala-2.12") {

  override protected def builds =
    Seq(getBuild("v2.12.20", dialects.Scala212, 1277))

}

class CommunityScala2_13Suite extends CommunityScala2Suite("scala-2.13") {

  override protected def builds =
    Seq(getBuild("v2.13.14", dialects.Scala213, 1287))

}