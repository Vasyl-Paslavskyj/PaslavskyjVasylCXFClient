package com.epam.lab3;

import com.epam.lab3.factory.FactoryMethodService;
import com.epam.lab3.models.Category;
import com.epam.lab3.models.News;
import com.epam.lab3.ws.NewspaperService;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class NewspaperTest {
    private static final Logger logger = Logger.getLogger(NewspaperTest.class.getName());
    public NewspaperService newspaperService;

    @BeforeClass
    public void setUp() {
        logger.info("Check service SOAP or Rest");
        newspaperService = new FactoryMethodService().getService(Data.REST_SERVICE);
    }

    @Test
    public void testAddNews() {
        News news = new News();
        Category category = new Category();
        category.setId(Data.ID_FOR_CATEGORY);
        category.setName(Data.NAME_FOR_CATEGORY);
        news.setTitle(Data.TITLE_FOR_NEW_NEWS);
        news.setCategory(category);
        news.setDescription(Data.DESCRIPTION_FOR_NEW_NEWS);
        news.setNews(Data.NEWSTEXT_FOR_NEW_NEWS);
        news.setTextLink(Data.TEXTLINK_FOR_NEW_NEWS);

        News addNews = newspaperService.addNews(news);
        Assert.assertNotNull(addNews);
        Assert.assertEquals(addNews, news);
    }

    @Test
    public void testGetNews() {
        News news = newspaperService.getNews(Data.NEWS_ID_FOR_METHOD_GET);
        System.out.println(news);
        Assert.assertNotNull(news);
    }

    @Test
    public void testUpdateNews() {
        boolean result = newspaperService.updateNews(Data.NEWS_ID_FOR_METHOD_UPDATE, Data.NEWSTEXT_FOR_METHOD_UPDATE);
        Assert.assertTrue(result);
        Assert.assertEquals(newspaperService.getNews(Data.NEWS_ID_FOR_METHOD_UPDATE).getNews(), Data.NEWSTEXT_FOR_METHOD_UPDATE);
    }

    @Test
    public void testGetAllNewsByCategory() {
        List<News> list = newspaperService.getAllNewsByCategory(Data.ID_FOR_CATEGORY);
        Assert.assertNotNull(list);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testGetAllCategories() {
        List<Category> list = newspaperService.getAllCategories();
        Assert.assertNotNull(list);
        Assert.assertFalse(list.isEmpty());
    }

    @AfterClass
    public void after() {
        newspaperService = null;
    }
}
