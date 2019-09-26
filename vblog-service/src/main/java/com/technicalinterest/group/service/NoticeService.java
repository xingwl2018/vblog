package com.technicalinterest.group.service;

import com.technicalinterest.group.dao.PageBase;
import com.technicalinterest.group.service.dto.ReturnClass;

/**
 * @package: com.technicalinterest.group.service
 * @className: NoticeService
 * @description: 通知接口层
 * @author: Shuyu.Wang
 * @date: 2019-08-20 13:02
 * @since: 0.1
 **/
public interface NoticeService {

	
	/**
	 * @Description: 评论通知列表
	 * @author: shuyu.wang
	 * @date: 2019-08-23 12:50
	 * @param userName
	 * @return null
	*/
	ReturnClass queryCommentNotice(String userName, PageBase pageBase);

	/**
	 * @Description:查看评论，标记为已经查看
	 * @author: shuyu.wang
	 * @date: 2019/8/20 22:56
	 * @param id
	 * @return null
	 */
	ReturnClass viewComment(Long id);


	
	/**
	 * @Description: 点赞通知列表
	 * @author: shuyu.wang
	 * @date: 2019-08-23 12:50
	 * @param userName
	 * @return null
	*/
	ReturnClass queryLikeNotice(String userName, PageBase pageBase);

	/**
	 * @Description:查看评论，标记为已经查看
	 * @author: shuyu.wang
	 * @date: 2019/8/20 22:56
	 * @param id
	 * @return null
	 */
	ReturnClass viewLike(Long id);
}
