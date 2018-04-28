package com.guanghe.routes

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

class EventsRoute {
  val route: Route =
    post {
      pathPrefix("api") {
        pathPrefix("v4") {
          pathEndOrSingleSlash {
            withoutSizeLimit {
              extractRequest {
                request => {
                  complete("owo")
                }
              }
            }
          }
        }
      }
    }
}
