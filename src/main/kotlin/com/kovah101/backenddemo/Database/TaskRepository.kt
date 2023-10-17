package com.kovah101.backenddemo.Database

import org.springframework.data.repository.CrudRepository

interface TaskRepository : CrudRepository<Task, Long>