package com.guanghe.controllers

import akka.http.scaladsl.model.{HttpRequest, StatusCodes}
import akka.http.scaladsl.server.Directives._

class DataProcessing {

  def dataProcessing(request: HttpRequest, apiName: String) = {
    entity(as[Array[Byte]]) {
      entityByte => {
        ungzip
      }
    }
  }


}
