name := "FileInspector"

version := "0.1"

scalaVersion := "2.12.4"

sbtVersion := "1.1.1"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "1.5.10.RELEASE",
  "org.webjars" % "bootstrap" % "4.0.0",
  "org.webjars" % "jquery" % "2.1.0-2",
  "org.thymeleaf" % "thymeleaf-spring4" % "3.0.9.RELEASE",
  "io.springfox" % "springfox-swagger2" % "2.7.0",
  "io.springfox" % "springfox-swagger-ui" % "2.7.0",
  "net.liftweb" %% "lift-json" % "3.2.0"
)