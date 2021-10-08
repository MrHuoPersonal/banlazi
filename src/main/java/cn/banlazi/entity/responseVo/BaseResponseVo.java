package cn.banlazi.entity.responseVo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

@Data
public class BaseResponseVo {
    private int resultCd;
    private String message;
    private JSONObject data;
}
