package com.example.grpclibrary

import com.example.thomas.PingRequest

class TestLibrary {
    private val tag = "GrpcLibrary TestLibrary --- "
    companion object{
        private val sTag = "GrpcLibrary TestLibrary --- "

        fun sayHello(){
            println("$sTag sayHello() called !")
        }

        fun sayPingReq(){
            var pingReq = PingRequest.newBuilder().setMsg("this is pingRequest").build()
            println("$sTag sayPingReq - ${pingReq.msg}")
        }
    }
}