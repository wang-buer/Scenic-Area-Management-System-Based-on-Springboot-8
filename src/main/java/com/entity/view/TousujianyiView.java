package com.entity.view;

import com.entity.TousujianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投诉建议
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
@TableName("tousujianyi")
public class TousujianyiView  extends TousujianyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TousujianyiView(){
	}
 
 	public TousujianyiView(TousujianyiEntity tousujianyiEntity){
 	try {
			BeanUtils.copyProperties(this, tousujianyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
