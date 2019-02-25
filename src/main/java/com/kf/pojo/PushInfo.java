package com.kf.pojo;

import com.kf.vo.OtherInfo;
import com.kf.vo.TagValue;
import lombok.Data;

import java.util.List;

/**
 * Created by 18236 on 2017/9/26.
 */

@Data
public class PushInfo extends BaseInfo {

    private static final long serialVersionUID = -5225525583245687832L;
    private List<OtherInfo> otherInfos;

    private List<TagValue> tagValues;


}
