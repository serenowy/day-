package com.example.assiment3;

import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class task {
    private  String title;
    private  String description ;
    private  String status;
    private String deadline;


}
