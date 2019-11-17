package com.antz.tools.schedule;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author antz-H
 * @description
 * @date 2019/11/14 9:29
 **/
@Slf4j
public class ScheduleServiceTest {

    /**
     * java.util.concurrent.ScheduledThreadPoolExecutor.ScheduledFutureTask#setNextRunTime()
     * ByRate与ByDelay的区别
     * ByRate在初始化时，period是正值，它的逻辑是在上一次的执行的时间上 time + period的值，即下一次的执行时间，可查看{@link ScheduledThreadPoolExecutor}
     * ByDelay在初始化时，period会被赋值成负值，它的逻辑是在 now() + ((delay < (Long.MAX_VALUE >> 1)) ? delay : overflowFree(delay)) ，即下一次的执行时间
     */

    ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(10, new BasicThreadFactory.Builder().namingPattern("test-%d").build());

    public void ScheduleServiceTest() {
        //任务调度器每秒执行调度，并产生任务，放进队列中（调度器不考虑业务的执行时间）；业务执行耗时6秒，所以每次任务执行完，就会去队列中取任务并执行；
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            log.info("scheduleAtFixedRate : Thread id{},execute !!!", Thread.currentThread().getId());
            try {
                Thread.sleep(6000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 10000, 1000, TimeUnit.MILLISECONDS);

        //任务调度器每次待任务执行完后，等delay时间后，产生任务，放进队列中（调度器考虑业务的执行时间）；
        scheduledExecutorService.scheduleWithFixedDelay(() -> {
            log.info("scheduleWithFixedDelay : Thread id{},execute !!!", Thread.currentThread().getId());
            try {
                Thread.sleep(6000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 10000, 1000, TimeUnit.MILLISECONDS);

    }

    public static void main(String[] args) {
        ScheduleServiceTest scheduleServiceTest = new ScheduleServiceTest();
        scheduleServiceTest.ScheduleServiceTest();
    }


}
