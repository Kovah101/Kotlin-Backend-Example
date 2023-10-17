package com.kovah101.backenddemo.API

import com.kovah101.backenddemo.Database.Task
import com.kovah101.backenddemo.Database.TaskRepository
import com.kovah101.backenddemo.ErrorHandling.TaskNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {
    // API logic here
    @Autowired
    lateinit var taskRepository: TaskRepository

    @GetMapping("/task/{id}")
    fun getTask(@PathVariable id: Long): Task {
        // Fetch task from database
        return taskRepository.findById(id).orElseThrow { TaskNotFoundException(id) }
    }

    @PostMapping("/task")
    fun createTask(@RequestBody task: Task): Task {
        // Save task to database
        return taskRepository.save(task)
    }

    @DeleteMapping("/task/{id}")
    fun deleteTask(@PathVariable id: Long) {
        // Delete task from database
        taskRepository.deleteById(id)
    }
}