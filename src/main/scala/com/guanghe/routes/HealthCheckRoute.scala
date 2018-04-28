package com.guanghe.routes

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

class HealthCheckRoute {
  val route: Route =
    pathPrefix("api") {
      pathEndOrSingleSlash {
        get {
          complete("hi diggzhang")
        }
      }
    }
}
