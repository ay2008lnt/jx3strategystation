package top.yzlin.jx3strategystation.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.yzlin.jx3strategystation.dao.ArticleDAO;
import top.yzlin.jx3strategystation.entity.community.BaseArticle;


@Service
@Transactional(rollbackFor = Exception.class)
public class ArticleService {
    private final ArticleDAO articleDAO;

    public ArticleService(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    public int saveArticle(BaseArticle baseArticle) {
        return articleDAO.saveArticle(baseArticle);
    }

    public BaseArticle findArticleByIdAndUserName(int articleId, String userName) {
        return articleDAO.findArticleByIdAndUserName(articleId, userName);
    }

    public BaseArticle findArticleById(int id) {
        return articleDAO.findArticleById(id);
    }



}