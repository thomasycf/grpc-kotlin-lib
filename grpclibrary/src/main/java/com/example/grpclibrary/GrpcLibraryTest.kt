package com.example.grpclibrary

import com.example.thomas.PingRequest

class GrpcLibraryTest {
    private val tag = "GrpcLibrary GrpcLibraryTest --- "
    companion object{
        private val sTag = "GrpcLibrary GrpcLibraryTest --- "

        fun sayHello(){
            println("$sTag sayHello() called !")
        }

        fun sayPingReq(){
            var pingReq = PingRequest.newBuilder().setMsg("this is pingRequest").build()
            println("$sTag sayPingReq - ${pingReq.msg}")
        }
    }
}