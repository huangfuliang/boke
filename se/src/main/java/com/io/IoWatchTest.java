package com.io;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

/**
 * Created by huangfuliang on 2017/9/6.
 */
public class IoWatchTest {
    public static void main(String[] args) throws Exception {
        WatchService ws = FileSystems.getDefault().newWatchService();
        Path dir = FileSystems.getDefault().getPath("/Users/huangfuliang/Documents/test");
        WatchKey key = dir.register(ws, ENTRY_MODIFY);
        while (true) {
            key = ws.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                if (event.kind() == ENTRY_MODIFY) {
                    System.out.println("dir is  changed");
                }
            }
            key.reset();
        }

    }
}
