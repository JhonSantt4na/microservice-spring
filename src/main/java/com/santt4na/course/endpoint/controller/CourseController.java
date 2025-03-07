package com.santt4na.course.endpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santt4na.course.endpoint.service.CourseService;
import com.santt4na.model.Course;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("v1/admin/course")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {
  private final CourseService courseService;

  @GetMapping()
  public ResponseEntity<Iterable<Course>> getMethodName(Pageable pageable) {
    return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
  }

}