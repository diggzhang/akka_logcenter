package com.guanghe.controllers

import akka.http.scaladsl.model.{HttpRequest, StatusCodes}
import akka.http.scaladsl.server.Directives._

class DataProcessing {

  def dataProcessing(request: HttpRequest, apiName: String) = {
    val timeStart: Long = System.currentTimeMillis()
    val mergeIpUaJsonRaw = extractUaIpInReqHeader(request)

    entity(as[Array[Byte]]) {
      entityByte => {
        complete(StatusCodes.NoContent)
      }
    }
  }

}
