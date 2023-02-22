name := """BookstoreApp"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.10"

libraryDependencies += guice
