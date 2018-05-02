package com.guanghe.routes

import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

class ApiLogRoute {
  val route: Route =
    post {
      pathPrefix("api" / "v4" / "httplog") {
        pathEndOrSingleSlash {
          entity(as[String]) {
            json: String => {
              complete(StatusCodes.NoContent)
            }
          }
        }
      } ~
      pathPrefix("api" / "log") {
        pathEndOrSingleSlash {
          extractRequest {
            request =>
              {
                complete(StatusCodes.NoContent)
              }
          }
        }
      }
    }
}
