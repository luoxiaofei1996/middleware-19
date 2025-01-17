package com.zoneyet.robot.admin.service.system.statistic.impl;



import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zoneyet.robot.admin.dao.DaoSupport;
import com.zoneyet.robot.admin.entity.Page;
import com.zoneyet.robot.admin.service.system.statistic.StatisticManager;
import com.zoneyet.robot.admin.util.PageData;


/** 
 * 说明： 订单表
 * 创建人：FH Q313596790
 * 创建时间：2018-03-14
 * @version
 */
@Service("statisticService")
public class StatisticService implements StatisticManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	


	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("StatisticMapper.datalistPage", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("OrderMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("StatisticMapper.findById", pd);
	}
	
	/**获取四个统计量
	 * @param pd
	 * @throws Exception
	 */
	public PageData daysum(PageData pd)throws Exception{
		return (PageData)dao.findForObject("OrderMapper.daysum", pd);
	}
	
	public PageData daycount(PageData pd)throws Exception{
		return (PageData)dao.findForObject("OrderMapper.daycount", pd);
	}
	
	public PageData monthsum(PageData pd)throws Exception{
		return (PageData)dao.findForObject("OrderMapper.monthsum", pd);
	}
	
	public PageData monthcount(PageData pd)throws Exception{
		return (PageData)dao.findForObject("OrderMapper.monthcount", pd);
	}
	
	
	public PageData getstartend(PageData pd)throws Exception{
		return (PageData)dao.findForObject("OrderMapper.getstartend", pd);
	}
	
	public PageData getstartend2(PageData pd)throws Exception{
		return (PageData)dao.findForObject("OrderMapper.getstartend2", pd);
	}
	/**会员统计表
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> memberstatic(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("OrderMapper.memberstatic", pd);
	}
	
	/**会员统计（付费用户）
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> memberstatic2(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("OrderMapper.memberstatic2", pd);
	}
	
	/**时间段内的收入增长
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> incomestatic(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("OrderMapper.incomestatic", pd);
	}
	
	/**首页5个统计量
	 * @param pd
	 * @throws Exception 
	 */
	@Override
	public PageData todaysum(PageData pd) throws Exception {
		return (PageData)dao.findForObject("OrderMapper.todaysum", pd);
	}

	@Override
	public PageData todayordercount(PageData pd) throws Exception {
		return (PageData)dao.findForObject("OrderMapper.todayordercount", pd);
	}

	@Override
	public PageData todaynewmemcount(PageData pd) throws Exception {
		return (PageData)dao.findForObject("OrderMapper.todaynewmemcount", pd);
	}

	@Override
	public PageData todaycostmemcount(PageData pd) throws Exception {
		return (PageData)dao.findForObject("OrderMapper.todaycostmemcount", pd);
	}

	@Override
	public PageData todayusememcount(PageData pd) throws Exception {
		return (PageData)dao.findForObject("OrderMapper.todayusememcount", pd);
	}
}

