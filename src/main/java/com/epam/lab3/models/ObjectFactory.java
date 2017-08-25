
package com.epam.lab3.models;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.lab3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllNewsByCategory_QNAME = new QName("http://ws.lab3.epam.com/", "getAllNewsByCategory");
    private final static QName _AddNewsResponse_QNAME = new QName("http://ws.lab3.epam.com/", "addNewsResponse");
    private final static QName _GetAllCategoriesResponse_QNAME = new QName("http://ws.lab3.epam.com/", "getAllCategoriesResponse");
    private final static QName _Category_QNAME = new QName("http://ws.lab3.epam.com/", "Category");
    private final static QName _GetNewsResponse_QNAME = new QName("http://ws.lab3.epam.com/", "getNewsResponse");
    private final static QName _UpdateNews_QNAME = new QName("http://ws.lab3.epam.com/", "updateNews");
    private final static QName _UpdateNewsResponse_QNAME = new QName("http://ws.lab3.epam.com/", "updateNewsResponse");
    private final static QName _GetAllNewsByCategoryResponse_QNAME = new QName("http://ws.lab3.epam.com/", "getAllNewsByCategoryResponse");
    private final static QName _GetAllCategories_QNAME = new QName("http://ws.lab3.epam.com/", "getAllCategories");
    private final static QName _AddNews_QNAME = new QName("http://ws.lab3.epam.com/", "addNews");
    private final static QName _GetNews_QNAME = new QName("http://ws.lab3.epam.com/", "getNews");
    private final static QName _News_QNAME = new QName("http://ws.lab3.epam.com/", "News");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.lab3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNewsResponse }
     * 
     */
    public AddNewsResponse createAddNewsResponse() {
        return new AddNewsResponse();
    }

    /**
     * Create an instance of {@link GetAllNewsByCategory }
     * 
     */
    public GetAllNewsByCategory createGetAllNewsByCategory() {
        return new GetAllNewsByCategory();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link GetAllCategoriesResponse }
     * 
     */
    public GetAllCategoriesResponse createGetAllCategoriesResponse() {
        return new GetAllCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetNewsResponse }
     * 
     */
    public GetNewsResponse createGetNewsResponse() {
        return new GetNewsResponse();
    }

    /**
     * Create an instance of {@link GetAllNewsByCategoryResponse }
     * 
     */
    public GetAllNewsByCategoryResponse createGetAllNewsByCategoryResponse() {
        return new GetAllNewsByCategoryResponse();
    }

    /**
     * Create an instance of {@link UpdateNewsResponse }
     * 
     */
    public UpdateNewsResponse createUpdateNewsResponse() {
        return new UpdateNewsResponse();
    }

    /**
     * Create an instance of {@link UpdateNews }
     * 
     */
    public UpdateNews createUpdateNews() {
        return new UpdateNews();
    }

    /**
     * Create an instance of {@link GetAllCategories }
     * 
     */
    public GetAllCategories createGetAllCategories() {
        return new GetAllCategories();
    }

    /**
     * Create an instance of {@link GetNews }
     * 
     */
    public GetNews createGetNews() {
        return new GetNews();
    }

    /**
     * Create an instance of {@link AddNews }
     * 
     */
    public AddNews createAddNews() {
        return new AddNews();
    }

    /**
     * Create an instance of {@link News }
     * 
     */
    public News createNews() {
        return new News();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNewsByCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "getAllNewsByCategory")
    public JAXBElement<GetAllNewsByCategory> createGetAllNewsByCategory(GetAllNewsByCategory value) {
        return new JAXBElement<GetAllNewsByCategory>(_GetAllNewsByCategory_QNAME, GetAllNewsByCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "addNewsResponse")
    public JAXBElement<AddNewsResponse> createAddNewsResponse(AddNewsResponse value) {
        return new JAXBElement<AddNewsResponse>(_AddNewsResponse_QNAME, AddNewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "getAllCategoriesResponse")
    public JAXBElement<GetAllCategoriesResponse> createGetAllCategoriesResponse(GetAllCategoriesResponse value) {
        return new JAXBElement<GetAllCategoriesResponse>(_GetAllCategoriesResponse_QNAME, GetAllCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "Category")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "getNewsResponse")
    public JAXBElement<GetNewsResponse> createGetNewsResponse(GetNewsResponse value) {
        return new JAXBElement<GetNewsResponse>(_GetNewsResponse_QNAME, GetNewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "updateNews")
    public JAXBElement<UpdateNews> createUpdateNews(UpdateNews value) {
        return new JAXBElement<UpdateNews>(_UpdateNews_QNAME, UpdateNews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "updateNewsResponse")
    public JAXBElement<UpdateNewsResponse> createUpdateNewsResponse(UpdateNewsResponse value) {
        return new JAXBElement<UpdateNewsResponse>(_UpdateNewsResponse_QNAME, UpdateNewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNewsByCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "getAllNewsByCategoryResponse")
    public JAXBElement<GetAllNewsByCategoryResponse> createGetAllNewsByCategoryResponse(GetAllNewsByCategoryResponse value) {
        return new JAXBElement<GetAllNewsByCategoryResponse>(_GetAllNewsByCategoryResponse_QNAME, GetAllNewsByCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "getAllCategories")
    public JAXBElement<GetAllCategories> createGetAllCategories(GetAllCategories value) {
        return new JAXBElement<GetAllCategories>(_GetAllCategories_QNAME, GetAllCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "addNews")
    public JAXBElement<AddNews> createAddNews(AddNews value) {
        return new JAXBElement<AddNews>(_AddNews_QNAME, AddNews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "getNews")
    public JAXBElement<GetNews> createGetNews(GetNews value) {
        return new JAXBElement<GetNews>(_GetNews_QNAME, GetNews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link News }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lab3.epam.com/", name = "News")
    public JAXBElement<News> createNews(News value) {
        return new JAXBElement<News>(_News_QNAME, News.class, null, value);
    }

}
