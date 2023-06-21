package com.hnu.testProject.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author wrk
 * @email 791354961@qq.com
 * @date 2023-06-20 23:17:47
 */
@Data
@TableName("test_trade")
public class TradeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 交易ID
	 */
	@TableId
	private Integer id;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 日期
	 */
	private Date date;
	/**
	 * 客户姓名
	 */
	private String clientName;
	/**
	 * 客户操作
	 */
	private String clientSide;
	/**
	 * 股票代码
	 */
	private String ticker;
	/**
	 * RIC代码
	 */
	private String ric;
	/**
	 * 交易数量
	 */
	private Integer size;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 名义美元=规模*价格(货币/美元汇率)
	 */
	private BigDecimal notionalUsd;
	/**
	 * 货币
	 */
	private String currency;
	/**
	 * 发行部门
	 */
	private String issueSector;
	/**
	 * 销售员
	 */
	private String salesperson;
	/**
	 * HT/PT
	 */
	private String htPt;
	/**
	 * 创建时间
	 */
	private Date createdAt;

}
