package JAVASE.DAY04.P2;

import java.util.HashMap;

public class Demo08 {
    public static void main(String[] args) {
        System.out.println("---------- testInsertAPIs -----------");
        StringBuilder sbuilder = new StringBuilder();
// 在位置0处插入字符数组
        sbuilder.insert(0, new char[]{'a', 'b', 'c', 'd', 'e'});
// 在位置0处插入字符数组。0表示字符数组起始位置，3表示长度
        sbuilder.insert(0, new char[]{'A', 'B', 'C', 'D', 'E'}, 0, 3);
// 在位置0处插入float
        sbuilder.insert(0, 1.414f);
// 在位置0处插入double
        sbuilder.insert(0, 3.14159d);
// 在位置0处插入boolean
        sbuilder.insert(0, true);
// 在位置0处插入char
        sbuilder.insert(0, '\n');
// 在位置0处插入int
        sbuilder.insert(0, 100);
// 在位置0处插入long
        sbuilder.insert(0, 12345L);
// 在位置0处插入StringBuilder对象
        sbuilder.insert(0, new StringBuilder("StringBuilder"));
// 在位置0处插入StringBuilder对象。6表示被在位置0处插入对象的起始位置(包括)，13是
        //结束位置(不包括)
        sbuilder.insert(0, new StringBuilder("STRINGBUILDER"), 6, 13);
// 在位置0处插入StringBuffer对象。
        sbuilder.insert(0, new StringBuffer("StringBuffer"));
// 在位置0处插入StringBuffer对象。6表示被在位置0处插入对象的起始位置(包括)，12是结
        //束位置(不包括)
        sbuilder.insert(0, new StringBuffer("STRINGBUFFER"), 6, 12);
// 在位置0处插入String对象。
        sbuilder.insert(0, "String");
        // 在位置0处插入String对象。1表示被在位置0处插入对象的起始位置(包括)，6是结束位置(不
        //包括)
        sbuilder.insert(0, "0123456789", 1, 6);
        sbuilder.insert(0, '\n');
// 在位置0处插入Object对象。此处以HashMap为例
        HashMap map = new HashMap();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        sbuilder.insert(0, map);
        System.out.printf("%s\n\n", sbuilder);
    }
    }

