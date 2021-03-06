package com.example.portalback.drools.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 规则的数据结构
 */
@Data
public class RuleDTO {

    private ActivityRule rule;
    private String ruleName;
    private Date beginTime;
    private Date endTime;
    private List<Integer> joinChannel;
    private Double score;

    public ActivityRule getRule() {
        return rule;
    }

    public void setRule(ActivityRule rule) {
        this.rule = rule;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<Integer> getJoinChannel() {
        return joinChannel;
    }

    public void setJoinChannel(List<Integer> joinChannel) {
        this.joinChannel = joinChannel;
    }

    @Override
    public String toString() {
        return "RuleDTO{" +
                "rule=" + rule +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", joinChannel=" + joinChannel +
                '}';
    }
}
