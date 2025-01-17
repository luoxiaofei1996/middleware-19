package com.zoneyet.robot.admin.service.system.statistic;


import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import com.zoneyet.robot.admin.entity.Page;
import com.zoneyet.robot.admin.util.PageData;


/** 
 * 说明： 订单表接口
 * 创建人：FH Q313596790
 * 创建时间：2018-03-14
 * @version
 */
public interface StatisticManager{


	
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	public List<PageData> list(Page page)throws Exception;
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listAll(PageData pd)throws Exception;
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception;
	
	/**获取四个统计量
	 * @param pd
	 * @throws Exception
	 */
	public PageData daysum(PageData pd)throws Exception;
	
	public PageData daycount(PageData pd)throws Exception;
	
	public PageData monthsum(PageData pd)throws Exception;
	
	public PageData monthcount(PageData pd)throws Exception;
	
	public PageData getstartend(PageData pd)throws Exception;
	
	public PageData getstartend2(PageData pd)throws Exception;
	
	/**会员统计表
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> memberstatic(PageData pd)throws Exception;
	
	/**会员统计（付费用户）
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> memberstatic2(PageData pd)throws Exception;
	
	/**时间段内的收入增长
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> incomestatic(PageData pd)throws Exception;
	
	/**首页5个统计量
	 * @param pd
	 * @throws Exception
	 */
	public PageData todaysum(PageData pd) throws Exception;

	public PageData todayordercount(PageData pd) throws Exception;

	public PageData todaynewmemcount(PageData pd) throws Exception;

	public PageData todaycostmemcount(PageData pd) throws Exception;

	public PageData todayusememcount(PageData pd) throws Exception;

	
}

