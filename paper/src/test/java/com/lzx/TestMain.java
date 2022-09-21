package com.lzx;

import com.lzx.utils.FileUtils;
import com.lzx.utils.TokenizerUtils;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class TestMain {
    static final String path = "orig.txt";
    static final String outPath = "C:\\lzx\\";

    //首次测试
    @Test
    public void testOne() {
        String path2 = "orig_add.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtils.CountWord(this.path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtils.CountWord(path2);
        Double similarity = TokenizerUtils.CosCount(stringListMap1, stringListMap2);
        FileUtils.writeFile(this.outPath + "result_01.txt", String.valueOf(similarity));
        System.out.println(similarity);
    }

}
