package com.yunclass.javabase.spi;

/**
 * @author: <a href="http://www.panaihua.com">panaihua</a>
 * @date: 2017年03月22日 17:25
 * @descript:
 * @version: 1.0
 */
public class FileSearch implements  Search{

    @Override
    public String search(String keywords) {
        return "fileSeach";
    }
}
