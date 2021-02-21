package com.wangshj.vhr.model;

import java.util.List;

/**
 * @author: wangshj
 * @date: 2021/2/21 13:57
 * @description: 请求返回页面数bean
 */
public class RespPageBean {
    private Long total;
    private List<?> data;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
