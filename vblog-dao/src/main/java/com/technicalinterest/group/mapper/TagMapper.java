package com.technicalinterest.group.mapper;

import com.technicalinterest.group.dto.TagDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.technicalinterest.group.dao.Tag;

@Mapper
public interface TagMapper {

    Integer insertSelective(@Param("pojo") Tag pojo);

    Integer update(@Param("pojo") Tag pojo);

    List<TagDTO> queryTagListByUser(String userName);

    Tag queryTag(Tag pojo);

    Integer delTag(@Param("id")Long id);

    /**
     * @Description: 查询标签下的文章数
     * @author: shuyu.wang
     * @date: 2019/8/20 22:26
     * @param id
     * @return null
    */
    Integer getArticleCountTag(@Param("id")Long id);

}
