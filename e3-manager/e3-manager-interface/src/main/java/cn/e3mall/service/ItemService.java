package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

/**
 * 商品业务层接口
 * @author lujimeng
 *
 */
public interface ItemService {
	/**
	 * 根据id查询商品
	 */
	public TbItem findItemById(Long id);
}
