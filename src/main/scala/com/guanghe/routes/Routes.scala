package com.guanghe.routes

import ch.megard.akka.http.cors.scaladsl.CorsDirectives._
import akka.http.scaladsl.server.Directives._

class Routes {

  private val healthCheckRoute: HealthCheckRoute = new HealthCheckRoute()
  private val eventsRoute: EventsRoute = new EventsRoute()

  val route = cors() {
    eventsRoute.route ~
    healthCheckRoute.route
  }

}
