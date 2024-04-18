package br.com.rmd.samplesleuth.controller

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("event-log")
class EventLogController {
    companion object {
        private val log = LoggerFactory.getLogger(EventLogController::class.java)
    }

    @GetMapping("test-log")
    fun testLog(): ResponseEntity<*> {
        log.info("log legal")

        return ok(HttpStatus.OK)
    }

}