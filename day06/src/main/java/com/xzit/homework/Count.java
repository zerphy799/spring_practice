package com.xzit.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@NoArgsConstructor
public class Count {
    private int id;
    private String account;
    private String password;
    private int coupon;

    public Count(String account, String password, int coupon) {
        this.account = account;
        this.password = password;
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "Count{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", coupon=" + coupon +
                '}';
    }
}
