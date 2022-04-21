package com.example.grpcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.grpclibrary.GrpcLibraryTest
import com.example.grpclibrary.TestLibrary
import com.example.thomas.PingRequest
import com.example.thomas.PingRequestOrBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GrpcLibraryTest.sayHello()
        GrpcLibraryTest.sayPingReq()
      //  PingRequest.newBuilder().setMsg("hihi").build()
        setContentView(R.layout.activity_main)

    }
}