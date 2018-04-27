package com.guanghe.http

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import ch.megard.akka.http.cors.scaladsl.CorsDirectives._

class HttpRoute {
  val route: Route =
    cors() {
      pathPrefix("api") {
        pathEndOrSingleSlash {
          get {
            complete("OK")
          }
        }
      }
    }
}
