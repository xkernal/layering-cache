package com.github.xiaolyuh.domain;

/**
 * @Author lsh
 * @Date 2023/1/9
 * @Description
 */
public class Normal2 <T1, T2>{
    private T1 data1;
    private T2 data2;

    public T1 getData1() {
        return data1;
    }

    public void setData1(T1 data1) {
        this.data1 = data1;
    }

    public T2 getData2() {
        return data2;
    }

    public void setData2(T2 data2) {
        this.data2 = data2;
    }
}
