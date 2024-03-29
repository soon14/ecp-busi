package com.zengshi.ecp.wxbase.message.resp;

import java.util.List;

/**
 * 文本消息
 * @author wangbh
 *
 */
public class NewsMessageRespVO extends BaseMessageRespVO{
	// 图文消息个数，限制为10条以内  
    private int ArticleCount;  
    // 多条图文消息信息，默认第一个item为大图  
    private List<ArticleRespVO> Articles;  
  
    public int getArticleCount() {  
        return ArticleCount;  
    }  
  
    public void setArticleCount(int articleCount) {  
        ArticleCount = articleCount;  
    }  
  
    public List<ArticleRespVO> getArticles() {  
        return Articles;  
    }  
  
    public void setArticles(List<ArticleRespVO> articles) {  
        Articles = articles;  
    }  
}
