package com.lzx;

import com.lzx.utils.FileUtils;
import com.lzx.utils.TokenizerUtils;

import java.util.List;
import java.util.Map;

/**
 * @Descrition Main方法
 * @author lzx
 */
public class Main {
    public static void main(String[] args) {
        String file1 = args[0];
        String file2 = args[1];
        Map<String, List<Integer>> stringListOriginMap = TokenizerUtils.CountWord(file1);
        Map<String, List<Integer>> stringListCopyMap = TokenizerUtils.CountWord(file2);
        Double similarity = TokenizerUtils.CosCount(stringListOriginMap, stringListCopyMap);
        System.out.println("文本相似度为 " + similarity);
        FileUtils.writeFile(args[2], String.valueOf(similarity));
    }
}
