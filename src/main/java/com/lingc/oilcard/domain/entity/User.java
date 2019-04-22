package com.lingc.oilcard.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author wzp
 * @descripton
 * @time 2019/4/22 22:42
 * @modify
 */
@Data
@NoArgsConstructor
public class User implements Serializable {

    private Long userid;

    private String username;

    private String phone;

    private String address;

    private String nickname;

    private String gender;

    private String province;

    private String country;

    private String avatarurl;

    private String openid;

    private String firstime;

    private Double integral;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (!userid.equals(user.userid)) return false;
        if (!username.equals(user.username)) return false;
        if (!phone.equals(user.phone)) return false;
        if (!address.equals(user.address)) return false;
        if (!nickname.equals(user.nickname)) return false;
        if (!gender.equals(user.gender)) return false;
        if (!province.equals(user.province)) return false;
        if (!country.equals(user.country)) return false;
        if (!avatarurl.equals(user.avatarurl)) return false;
        if (!openid.equals(user.openid)) return false;
        if (!firstime.equals(user.firstime)) return false;
        return integral.equals(user.integral);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + userid.hashCode();
        result = 31 * result + username.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + nickname.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + province.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + avatarurl.hashCode();
        result = 31 * result + openid.hashCode();
        result = 31 * result + firstime.hashCode();
        result = 31 * result + integral.hashCode();
        return result;
    }
}