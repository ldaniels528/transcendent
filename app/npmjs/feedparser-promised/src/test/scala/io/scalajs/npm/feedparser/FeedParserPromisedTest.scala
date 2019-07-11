package io.scalajs.npm.feedparser

import io.scalajs.util.PromiseHelper.Implicits._
import org.scalatest.funspec.AnyFunSpec

import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue

/**
  * FeedParser-Promised Tests
  * @author lawrence.daniels@gmail.com
  */
class FeedParserPromisedTest extends AnyFunSpec {

  describe("FeedParserPromised") {
    val url = "http://feeds.feedwrench.com/JavaScriptJabber.rss"

    it("supports reading RSS feeds") {
      for {
        items <- FeedParserPromised.parse(url)
      } {
        items.foreach(item => info(s"title: ${item.title}"))
      }
    }

  }

}
