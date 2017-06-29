package cn.e3mall.service.impl;
/*
 * 商品的业务层实现类 
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper itemMapper;
	//根据id查询商品
	@Override
	public TbItem findItemById(Long id) {
		return itemMapper.selectByPrimaryKey(id);
	}

}
