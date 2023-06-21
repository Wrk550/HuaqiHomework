package com.hnu.testProject.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hnu.testProject.entity.TradeEntity;
import com.hnu.testProject.service.TradeService;
import com.hnu.testProject.utils.PageUtils;
import com.hnu.testProject.utils.R;



/**
 *
 *
 * @author wrk
 * @email 791354961@qq.com
 * @date 2023-06-20 23:17:47
 */
@RestController
@RequestMapping("testProject/trade")
public class TradeController {
    @Autowired
    private TradeService tradeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tradeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TradeEntity trade = tradeService.getById(id);

        return R.ok().put("trade", trade);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TradeEntity trade){
		tradeService.save(trade);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TradeEntity trade){
		tradeService.updateById(trade);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tradeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
