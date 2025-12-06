package com.my.debug;

import org.springframework.batch.item.ItemWriter;

public class ConsoleItemWriter implements ItemWriter {

    public void write(Object item) throws Exception {
        System.out.println("Writing item: " + item);
    }

    public void clear() throws org.springframework.batch.item.ClearFailedException {
    }
    
    public void flush() throws org.springframework.batch.item.FlushFailedException {
    }
}