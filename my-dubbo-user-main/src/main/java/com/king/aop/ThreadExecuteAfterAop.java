package com.king.aop;


import com.king.log.ThreadAfterHolder;

/**
 *
 * 线程 执行完成 后，执行的拦截器
 * Created by chendengyu on 2016/3/15.
 */
public class ThreadExecuteAfterAop {

    public void after()
    {
        System.out.println("---------thread executeAfter--------");
        ThreadAfterHolder.executeAfter();
    }


}
