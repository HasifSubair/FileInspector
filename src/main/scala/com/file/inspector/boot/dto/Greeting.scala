package com.file.inspector.boot.dto

import io.swagger.annotations.{ApiModel, ApiModelProperty}

import scala.annotation.meta.field

@ApiModel
class Greeting(@(ApiModelProperty@field)(position = 1, value = "id") val id: Int,
               @(ApiModelProperty@field)(position = 2, value = "message") val message: String)
