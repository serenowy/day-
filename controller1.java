package com.example.assiment3;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/api/v3")
public class controller1 {


        ArrayList<task> t = new ArrayList();

        @GetMapping("/task")

        public ArrayList<task> getUsers() {

            return t;
        }

        @PostMapping("/add")
        public ApiResponse2 addTask(@RequestBody task t1) {
            t.add(t1);
            return new ApiResponse2("task add");
        }

        @PutMapping("/update/{index}")

        public ApiResponse2 updateTask(@PathVariable int index, @PathVariable task t1) {
            t.set(index, t1);
            return new ApiResponse2("task updated");
        }

        @DeleteMapping("/{index}")
        public ApiResponse2 deledtTask(@PathVariable int index) {
            t.remove(index);
            return new ApiResponse2("task added");


        }

        @PutMapping("/change/{index}")
        public ApiResponse2 changeTask(@PathVariable int index, @RequestBody String t1) {
            t.get(index).setStatus(t1);
            return new ApiResponse2("task change");
        }


        @GetMapping("/search")
        public ApiResponse2 searchTask(@RequestBody String t1) {
            for (int i = 0; i < t.size(); i++) {
                if (t.get(i).getTitle().equals(t1)) {
                    return new ApiResponse2("task ");
                }

            }

            return new ApiResponse2("not found");

        }

    }


