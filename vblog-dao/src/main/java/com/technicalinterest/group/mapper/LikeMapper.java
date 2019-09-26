package com.technicalinterest.group.mapper;

import com.technicalinterest.group.dto.LikeNoticeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.technicalinterest.group.dao.Like;

@Mapper
public interface LikeMapper {
    Integer insert(@Param("pojo") Like pojo);

    Integer insertSelective(@Param("pojo") Like pojo);

    Integer insertList(@Param("pojos") List<Like> pojo);

    Integer update(@Param("pojo") Like pojo);

    Like queryLike(@Param("pojo") Like pojo);

    Integer del(@Param("id")Long id);


    List<LikeNoticeDTO> queryListLikeNotice(@Param("userName")String userName);

    Integer queryCountLikeNotice(@Param("userName")String userName);
}
