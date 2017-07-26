package com.example.demo.service.impl;

import com.example.demo.entity.MatchDay;
import com.example.demo.entity.User;
import com.example.demo.model.MatchDayModel;
import com.example.demo.service.UserService;
import com.example.demo.util.GsonUtils;
import com.example.demo.util.HttpRequestUtils;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ningcs on 2017/7/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Value("${get_user_ip}")
    private String url;

    //返回json格式
    @Override
    public JSONObject getUserInfo(String idNumber) {
        String params = "?" + "player_id_number=" + idNumber;
        JSONObject result = HttpRequestUtils.httpGetJsonObject(url + "/user/getUser.do" + params);
        return result;
    }

    //json格式转对象
    @Override
    public User getUser(String idNumber) {
        String params = "?" + "player_id_number=" + idNumber;
        String str = HttpRequestUtils.httpGet(url + "/apply/getMatchApplyDayList.do" + params);
        User user = GsonUtils.parseJsonWithGson(str, User.class);
        return user;
    }

    //json格式数组
    @Override
    public List<User> getUserList(String idNumber) {
        String params = "?" + "player_id_number=" + idNumber;
        String str = HttpRequestUtils.httpGet(url + "/apply/getMatchApplyDayList.do" + params);
        List<User> userList = GsonUtils.parseJsonArrayWithGson(str, User.class);
        return userList;
    }

//-----------------------------测试----------------------------------------------

    /**
     * 如果有参数参考上面，已测，post方法和get一样，
     * 具体可以参照 get.
     *
     * @param idNumber
     * @return
     */
    //json格式转对象
    @Override
    public MatchDay getMatchDay(String idNumber) {
        String str = HttpRequestUtils.httpGet(url + "/apply/getMatchApplyDay.do");
        MatchDay matchDay = GsonUtils.parseJsonWithGson(str, MatchDay.class);
        return matchDay;
    }

    //json格式数组可以用JsonObject接收
    @Override
    public MatchDayModel getMatchDayList(String idNumber) {
        String str = HttpRequestUtils.httpGet(url + "/apply/getMatchApplyDayListJson.do");
        MatchDayModel matchDayModel = GsonUtils.parseJsonWithGson(str, MatchDayModel.class);
        return matchDayModel;
    }

    //json格式数组可以用JsonArrayt接收
    @Override
    public List<MatchDay> getMatchDayListArray(String idNumber) {
        String str = HttpRequestUtils.httpGet(url + "/apply/getMatchApplyDayListJsonArray.do");
        List<MatchDay> matchDays = GsonUtils.parseJsonArrayWithGson(str, MatchDay.class);
        return matchDays;
    }


}
