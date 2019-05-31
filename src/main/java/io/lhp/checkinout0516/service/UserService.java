package io.lhp.checkinout0516.service;

import io.lhp.checkinout0516.exception.ClientException;
import io.lhp.checkinout0516.po.User;
import io.lhp.checkinout0516.po.UserDetail;
import io.lhp.checkinout0516.vo.Position;

public interface UserService {

    void create(User user, UserDetail userDetail);

    void delete(String openid);

    void savePosition(String openId, Position position);

    Position loadPosition(String openid);

    void checkIn(String openid) throws ClientException;

    void checkOut(String openid) throws ClientException;

    User getUserFromWechatMP(String openId) throws ClientException;
}
