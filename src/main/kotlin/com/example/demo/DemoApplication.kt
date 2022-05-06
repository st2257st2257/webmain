package com.example.demo

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.engine.*
import org.springframework.boot.autoconfigure.web.ServerProperties

fun main(args: Array<String>) {
	embeddedServer(ServerProperties.Netty, 8080) {
		routing {
			get("/") {
				call.respondText("Hello, world!", ContentType.Text.Html)
			}
		}
	}.start(wait = true)
}

