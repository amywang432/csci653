package com.imooc.spark.project.domain

/**
  * @param ip
  * @param time
  * @param courseId
  * @param statusCode
  * @param referer
  */
case class ClickLog(ip:String, time:String, courseId:Int, statusCode:Int, referer:String)
