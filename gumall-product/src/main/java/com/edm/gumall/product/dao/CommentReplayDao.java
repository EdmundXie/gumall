package com.edm.gumall.product.dao;

import com.edm.gumall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author Edmund
 * @email 609031809@qq.com
 * @date 2023-03-30 17:13:27
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
