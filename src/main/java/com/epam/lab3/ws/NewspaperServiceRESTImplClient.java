package com.epam.lab3.ws;

import com.epam.lab3.models.Category;
import com.epam.lab3.models.News;

import com.epam.lab3.parsers.JSONCreator;
import org.glassfish.jersey.client.ClientConfig;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import java.net.URI;
import java.util.Collection;
import java.util.List;

public class NewspaperServiceRESTImplClient implements NewspaperService {
    private static JSONCreator parser = new JSONCreator();
    ClientConfig config = new ClientConfig();
    Client client = ClientBuilder.newClient(config);
    WebTarget target = client.target(getBaseURI());

    @Override
    public News addNews(News news) {
        String response = target.path("addNews")
                .request()
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .put(Entity.entity(news, MediaType.APPLICATION_JSON_TYPE), String.class);
        return (News) parser.unmarshall(response, News.class);
    }

    @Override
    public News getNews(int id) {
        String response = target.path("getNews")
                .path(String.valueOf(id))
                .request()
                .get(String.class);
        return (News) parser.unmarshall(response, News.class);
    }

    @Override
    public List<Category> getAllCategories() {
        String result = target.path("getAllCategories")
                .request()
                .get(String.class);
        return (List<Category>) parser.unmarshall(result, Collection.class);
    }

    @Override
    public List<News> getAllNewsByCategory(int id) {
        String result = target.path("getAllNewsByCategory")
                .path(String.valueOf(id))
                .request()
                .get(String.class);
        return (List<News>) parser.unmarshall(result, Collection.class);
    }

    @Override
    public boolean updateNews(int id, String newsText) {
        String result = target.path("updateNews")
                .path(String.valueOf(id))
                .request()
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.entity(newsText, MediaType.APPLICATION_JSON_TYPE), String.class);
        return (boolean) parser.unmarshall(result, Boolean.class);
    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/PaslavskyjVasylCXFService/NewspaperREST").build();
    }
}
