package com.example.demo.model;

import com.example.demo.entity.MatchDay;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ningcs on 2017/7/26.
 */
public class MatchDayModel implements Serializable {
    private List<MatchDay> matchDays;

    public List<MatchDay> getMatchDays() {
        return matchDays;
    }

    public MatchDayModel setMatchDays(List<MatchDay> matchDays) {
        this.matchDays = matchDays;
        return this;
    }
}
