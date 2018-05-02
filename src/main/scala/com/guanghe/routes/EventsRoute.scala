package com.guanghe.routes

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import com.guanghe.controllers.DataProcessing

class EventsRoute extends DataProcessing {

  val route: Route =
    post {
      pathPrefix("api" / "v4" / "events") {
        pathEndOrSingleSlash {
          withoutSizeLimit {
            extractRequest {
              request => {
                dataProcessing(request, "/api/v4/events")
              }
            }
          }
        }
      }
    }
}
