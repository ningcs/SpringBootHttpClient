package com.example.demo.service;

import com.example.demo.entity.MatchDay;
import com.example.demo.entity.User;
import com.example.demo.model.MatchDayModel;
import net.sf.json.JSONObject;

import java.util.List;

/**
 * Created by ningcs on 2017/7/26.
 */
public interface UserService {

    public JSONObject getUserInfo(String idNumber);
    public User getUser(String idNumber);
    public List<User> getUserList(String idNumber);

    public MatchDay getMatchDay(String idNumber) ;

    public MatchDayModel getMatchDayList(String idNumber);

    public List<MatchDay> getMatchDayListArray(String idNumber);
}
