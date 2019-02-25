package com.kf.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 18236 on 2017/9/26.
 */
@Data
public class Tag implements Serializable {
    private static final long serialVersionUID = -2248751998139431176L;
    private List<TagContent> tagContents;

    private String tagName;
    private int tagId;
}
