package io.nightfish.lnrdatasynchronous

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LnrDataSynchronousApplication

fun main(args: Array<String>) {
	runApplication<LnrDataSynchronousApplication>(*args)
}
