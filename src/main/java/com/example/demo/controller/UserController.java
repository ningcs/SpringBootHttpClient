package com.example.demo.controller;

import com.example.demo.entity.MatchDay;
import com.example.demo.model.MatchDayModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ningcs on 2017/7/26.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getMatchDay",method = {RequestMethod.POST,RequestMethod.GET})
    public MatchDay getMatchDay(String idNumber){
        return userService.getMatchDay(idNumber);

    }

    @RequestMapping(value = "/getMatchDayList",method = {RequestMethod.POST,RequestMethod.GET})
    public MatchDayModel getMatchDayList(String idNumber){
        return userService.getMatchDayList(idNumber);

    }
    @RequestMapping(value = "/getMatchDayListArray",method = {RequestMethod.POST,RequestMethod.GET})
    public List<MatchDay> getUserList(String idNumber){
        return userService.getMatchDayListArray(idNumber);
    }

}
