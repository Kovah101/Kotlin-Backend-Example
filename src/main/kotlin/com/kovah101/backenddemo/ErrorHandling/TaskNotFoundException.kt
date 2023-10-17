package com.kovah101.backenddemo.ErrorHandling

class TaskNotFoundException(id: Long) :
        Exception("Task with id:$id not found")
