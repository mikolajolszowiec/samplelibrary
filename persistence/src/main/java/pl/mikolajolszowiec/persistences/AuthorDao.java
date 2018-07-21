package pl.mikolajolszowiec.persistences;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.mikolajolszowiec.models.Author;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AuthorDao implements IAuthorDao{

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final String AUTHOR_DB_PATH = "./persistence/src/main/resources/database/authors.json";

    public void create(Author author) throws IOException {
        List<Author> authors = getAll(true);
        if(authors.size()>0)
        {
            author.setAuthorID(authors.get(authors.size() - 1).getAuthorID() + 1);
        }
        else
        {
            authors = new ArrayList<>();
            author.setAuthorID(Long.valueOf(1l));
        }
        authors.add(author);
        OBJECT_MAPPER.writeValue(new File(AUTHOR_DB_PATH), authors);
    }

    public void delete(Long authorID) throws IOException {
        List<Author> authors = getAll(true).stream().filter(x->x.getAuthorID().equals(authorID)).collect(Collectors.toList());
        if(authors.size()<1) return;
        authors.stream().forEach(x->x.setDeleted(true));
        OBJECT_MAPPER.writeValue(new File(AUTHOR_DB_PATH), authors);
    }

    public List<Author> getAll() throws IOException {
        return getAll(false);
    }

    public Author get(Long authorID) throws IOException {
        return getAll(false).stream().filter(x->x.getAuthorID().equals(authorID)).findFirst().get();
    }

    public void update(Author author, Long authorID) throws IOException {
        List<Author> authors = getAll(false);

        Author authorFromDB = authors.stream().filter(x->x.getAuthorID().equals(authorID)).findFirst().get();
        authorFromDB.setName(author.getName());
        authorFromDB.setSurname(author.getSurname());
        authorFromDB.setBirthPlace(author.getBirthPlace());
        authorFromDB.setDeleted(author.isDeleted());

        OBJECT_MAPPER.writeValue(new File(AUTHOR_DB_PATH), authors);
    }

    private List<Author> getAll(boolean getAllWithDeleted) throws IOException {
        List<Author> authors = OBJECT_MAPPER.readValue(new File(AUTHOR_DB_PATH), new TypeReference<List<Author>>(){});
        if(getAllWithDeleted)
            return authors;
        else
            return authors.stream().filter(x->!x.isDeleted()).collect(Collectors.toList());
    }


}
