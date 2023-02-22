package controllers;

import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.Messages;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.books.create;
import views.html.books.edit;
import views.html.books.index;
import views.html.books.show;

import javax.inject.Inject;
import java.util.Set;

public class BooksController extends Controller {

    @Inject
    FormFactory formFactory;
    MessagesApi messagesApi;

    //for all books
    public Result index(){
        Set<Book> books = Book.allbooks();
        return ok(index.render(books));
    }

    //to create books
    public Result create(Http.Request request){
        Form<Book> bookForm = formFactory.form(Book.class);
        return ok(create.render(bookForm,messagesApi.preferred(request)));
    }

    //to save a book
    public Result save(Http.Request request){
        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest(request);
        Book book = bookForm.get();
        Book.add(book);
        return redirect(routes.BooksController.index());
    }

    //to edit books
    public Result edit(Integer id){

        Book book = Book.findById(id);
        if(book==null){
            return notFound("Book not found");
        }
        Form<Book> bookForm = formFactory.form(Book.class).fill(book);
        return ok(edit.render(bookForm, (Messages) update()));
    }

    //to update a book
    public Result update(){

        Form<Book> bookForm = formFactory.form(Book.class);
        Book book = bookForm.get();
        Book oldBook = Book.findById(book.id);
        if (oldBook==null){
            return notFound("Book not found");
        }
        oldBook.title = book.title;
        oldBook.author = book.author;
        oldBook.price = book.price;

        return redirect(routes.BooksController.index());
    }

    //for book details
    public Result show(Integer id){
        Book book = Book.findById(id);
        if(book==null){
            return notFound("Book not found");
        }
        return ok(show.render(book));
    }

    //to delete a book
    public Result destroy(Integer id){
        Book book = Book.findById(id);
        if (book==null){
            return notFound("Book not found");
        }
        Book.remove(book);
        return redirect(routes.BooksController.index());
    }

}