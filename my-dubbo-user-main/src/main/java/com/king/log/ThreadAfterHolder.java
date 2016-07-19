package com.king.log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * 后置调用类
 * Created by chendengyu on 15/12/12.
 */
public class ThreadAfterHolder {

    //创建 线程池 使用共享 线程池完成
    private static ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

    private  static ThreadLocal<List<Thread>> threadLocal = new ThreadLocal<>();

    public static void setTraceThread(Thread thread) {
        List<Thread> list = threadLocal.get();
        if(list == null || list.size() == 0)
        {
            list = new ArrayList<>();
        }
        list.add(thread);
        threadLocal.set(list);
    }

    public static void clear() {
        threadLocal.remove();
    }

    public static void executeAfter()
    {
        synchronized (Thread.currentThread())
        {
            List<Thread> list = threadLocal.get();
            threadLocal.remove();
            if(list != null && list.size() != 0)
            {
                for(Thread thread:list)
                {
                    scheduledThreadPool.schedule(thread,0, TimeUnit.SECONDS);
                }
            }
        }

    }
}
