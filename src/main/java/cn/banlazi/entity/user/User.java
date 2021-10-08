package cn.banlazi.entity.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class User {
    @Id
    private int id;
    @Column(columnDefinition = "用户名",length = 255,nullable = false)
    private String username;
    @Column(columnDefinition = "电话号码*",nullable = false)
    private String phone;
    @Column(columnDefinition = "微信号*")
    private String wechat;
    @Column(columnDefinition = "密码*",nullable = false)
    private String passwd;
    @Column(columnDefinition = "qq号*")
    private String qq;
    @Column(columnDefinition = "出生年*",nullable = false)
    private int year;
    @Column(columnDefinition = "出生月",nullable = false)
    private int month;
    @Column(columnDefinition = "出生日",nullable = false)
    private int day;
    @Column(columnDefinition = "性别：0:男;1:女。",nullable = false)
    private int gender;
    @Column(columnDefinition = "学历：0:高中及以下;1:大专;2:本科;3:硕士;4:博士;",nullable = false)
    private int education;
    @Column(columnDefinition = "职业",nullable = false)
    private String occupation;
    @Column(columnDefinition = "头像地址，默认 男/女",length = 255)
    private String avatar;
    @Column(columnDefinition = "爱好")
    private String hobby;
    @Column(columnDefinition = "自我介绍")
    private String selfIntroduction;
    @Column(columnDefinition = "生活照1")
    private String lifePhoto1;
    @Column(columnDefinition = "生活照2")
    private String lifePhoto2;
    @Column(columnDefinition = "生活照3")
    private String lifePhoto3;
}
