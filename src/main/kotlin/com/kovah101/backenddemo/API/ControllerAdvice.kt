package com.kovah101.backenddemo.API

import com.kovah101.backenddemo.ErrorHandling.ErrorMessage
import com.kovah101.backenddemo.ErrorHandling.TaskNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler


@ControllerAdvice
class ControllerAdvice {
    @ExceptionHandler
    fun handleTaskNotFoundException(ex: TaskNotFoundException): ResponseEntity<ErrorMessage> {
        val errorMessage = ErrorMessage(
            ex.message, HttpStatus.NOT_FOUND.toString()
        )
        return ResponseEntity(errorMessage, HttpStatus.NOT_FOUND)
    }
}
