package cn.banlazi.entity.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Role {
    @Id
    private int id;
    @Column(columnDefinition = "用户Id",nullable = false)
    private int userId;
    @Column(columnDefinition = "角色：0:admin,1:vip,2:ordinary,3:guest",nullable = false)
    private int role;
}
