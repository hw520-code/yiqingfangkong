package com.entity.view;

import com.entity.FangyixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 防疫信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
@TableName("fangyixinxi")
public class FangyixinxiView  extends FangyixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangyixinxiView(){
	}
 
 	public FangyixinxiView(FangyixinxiEntity fangyixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fangyixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
