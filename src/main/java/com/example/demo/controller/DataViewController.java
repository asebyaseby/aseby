package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class DataViewController {
 @RequestMapping("/taskdemo")
 public ModelAndView itemsList() {
 ModelAndView mav = new ModelAndView("/views/HelloWorld.html");
 return mav;
 }
 @RequestMapping("/bar")
 public ModelAndView itemList() {
        ModelAndView mav = new ModelAndView("/views/BarChart.html");
        return mav;
 }
 @RequestMapping("/radar")
 public ModelAndView radarList() {
        ModelAndView mav = new ModelAndView("/views/RadarChart.html");
        return mav;
    }
    @RequestMapping("/index")
    public ModelAndView indexList() {
        ModelAndView mavi = new ModelAndView("/index.html");
        return mavi;
    }
}