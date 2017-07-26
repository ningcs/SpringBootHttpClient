package com.example.demo.controller;

import com.example.demo.entity.MatchDay;
import com.example.demo.model.MatchDayModel;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ningcs on 2017/7/26.
 *
 */
@RestController
@RequestMapping("apply")
public class HttpProvider {


    /**
     *
     * list 放在对象里面
     *
     * @return
     */
    @RequestMapping(value = "/getMatchApplyDay", method = {RequestMethod.GET,RequestMethod.POST})
    public JSONObject getMatchApplyDay() {

        JSONObject jsonObject =new JSONObject();
        MatchDay matchDay =new MatchDay();
        matchDay.setDayInfo("2016");
        matchDay.setDayInfoDetail("2016-09");
        matchDay.setStatus(1);
        matchDay.setId(1);
        return jsonObject.fromObject(matchDay);
    }


    /**
     *
     * list 放在对象里面
     *
     * @return
     */
    @RequestMapping(value = "/getMatchApplyDayListJson", method = {RequestMethod.GET,RequestMethod.POST})
    public JSONObject getMatchApplyDayListJson() {

        JSONObject jsonObject =new JSONObject();
        MatchDayModel matchDayModel =new MatchDayModel();
        List<MatchDay> matchDays =new ArrayList<>();
        MatchDay matchDay =new MatchDay();
        matchDay.setDayInfo("2016");
        matchDay.setDayInfoDetail("2016-09");
        matchDay.setStatus(1);
        matchDay.setId(1);
        matchDays.add(matchDay);
        matchDayModel.setMatchDays(matchDays);

        return jsonObject.fromObject(matchDayModel);
    }

    /**
     *
     * 用JsonArray返回
     * @return
     */
    @RequestMapping(value = "/getMatchApplyDayListJsonArray", method = {RequestMethod.GET,RequestMethod.POST})
    public JSONArray getMatchApplyDayListJsonArray() {

        JSONArray jsonArray =new JSONArray();
        List<MatchDay> matchDays =new ArrayList<>();
        MatchDay matchDay =new MatchDay();
        matchDay.setDayInfo("2016");
        matchDay.setDayInfoDetail("2016-09");
        matchDay.setStatus(1);
        matchDay.setId(1);
        matchDays.add(matchDay);

        return jsonArray.fromObject(matchDays);
    }


}
