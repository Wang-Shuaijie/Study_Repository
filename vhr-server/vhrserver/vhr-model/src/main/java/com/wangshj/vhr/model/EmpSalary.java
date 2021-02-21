package com.wangshj.vhr.model;

/**
 * @author: wangshj
 * @date: 2021/2/21 13:57
 * @description: 员工工资关联实体类
 */
public class EmpSalary {
    private Integer id;

    private Integer eid;

    private Integer sid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}