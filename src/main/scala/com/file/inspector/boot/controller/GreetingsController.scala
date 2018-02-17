package com.file.inspector.boot.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RequestParam, RestController}
import com.file.inspector.boot.dto.Greeting
import io.swagger.annotations.{ApiResponse, ApiResponses}
import net.liftweb.json.DefaultFormats
import net.liftweb.json.Serialization.write

@RestController
class GreetingsController {

  @ApiResponses(Array(
    new ApiResponse(code = 200, message = "successful operation", response = classOf[Greeting]),
    new ApiResponse(code = 404, message = "Greeting not found")))
  @RequestMapping(value = Array("/greeting"),
    produces = Array("application/json"),
    method = Array(RequestMethod.GET))
  def greet(@RequestParam(value = "name") name: String) = {
    val greeting = new Greeting(1, s"Welcome to File Inspector application, $name")
    implicit val formats = DefaultFormats
    write(greeting)
  }
}
