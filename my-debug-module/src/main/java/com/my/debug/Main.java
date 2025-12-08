package com.my.debug;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Spring Batch Job...");
        
        // 加载 Spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("job-config.xml");
        
        // 获取 JobLauncher 和 Job bean
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("helloWorldJob");
        
        try {
            // 运行 Job
            jobLauncher.run(job, new JobParameters());
            System.out.println("Job Finished!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



