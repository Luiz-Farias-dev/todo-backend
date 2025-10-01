package com.todolist.todolist.Repository;

import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository extends JpaRepository<Task, Long>{
}
