package com.alinesno.student.learn.demo.alinesnostudentdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentManagerController {

    private static final Logger log = LoggerFactory.getLogger(StudentManagerController.class) ;

    /**
     * 添加学生
     * @param name
     * @param pass
     * @return
     */
    @GetMapping("/add")
    public R add(String name , String pass , String address){

        log.debug("name = {} , pass = {}" , name , pass);

        StudentDto dto = new StudentDto() ;
        dto.setName(name);
        dto.setPass(pass);
        dto.setAddress(address);

        StudentDatabase.database.put(UUID.randomUUID().toString() , dto) ;

        return R.ok() ;
    }

    /**
     * 查询所有学生
     * @return
     */
    @GetMapping("/select")
    public R select(){
        return R.ok(StudentDatabase.database) ;
    }

}
