package com.file.inspector.boot.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class FileController {
  @RequestMapping(Array("/")) def printMessage = "\nHello World. \nWelcome to File Inspector\n"
}
