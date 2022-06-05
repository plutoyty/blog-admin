package com.yty.blog.util;

import com.yty.blog.pojo.article.Article;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨腾宇
 * @date 2022/6/2 15:41
 * @description
 */

public class JsoupUtil {
    public static void main(String[] args) throws IOException {
        parseJD("java").forEach(System.out::println);

    }

    public static List<Article> parseJD(String keyword) throws IOException {
        /// 使用前需要联网
        // 请求url
        String url = "https://www.xuexi.cn/lgpage/detail/index.html?id=9807955427375678827";
        // 1.解析网页(jsoup 解析返回的对象是浏览器Document对象)
        Document document = Jsoup.parse(new URL(url), 30000);
        System.out.println(document);
        // 使用document可以使用在js对document的所有操作
        // 2.获取元素（通过id）
        Element j_goodsList = document.getElementById("J_goodsList");
        // 3.获取J_goodsList ul 每一个 li
        Elements lis = j_goodsList.getElementsByTag("p");
        System.out.println(lis);
        // 4.获取li下的 img、price、name
        // list存储所有li下的内容
        List<Article> contents = new ArrayList<Article>();
//        for (Element li : lis) {
//            // 由于网站图片使用懒加载，将src属性替换为data-lazy-img
//            String img = li.getElementsByTag("img").eq(0).attr("data-lazy-img");// 获取li下 第一张图片
//            String name = li.getElementsByClass("p-name").eq(0).text();
//            String price = li.getElementsByClass("p-price").eq(0).text();
//            // 封装为对象
//
//            // 添加到list中
////            contents.add(content);
//        }
//        System.out.println(contents);
        // 5.返回 list
        return contents;
    }
}
