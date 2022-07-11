package ru.matveykenya.service;

import org.springframework.stereotype.Service;
import ru.matveykenya.repository.PostRepository;
import ru.matveykenya.model.*;
import java.util.List;
import ru.matveykenya.exception.*;

@Service
public class PostService {
  private final PostRepository repository;

  public PostService(PostRepository repository) {
    this.repository = repository;
  }

  public List<Post> all() {
    return repository.all();
  }

  public Post getById(long id) {
    return repository.getById(id).orElseThrow(NotFoundException::new);
  }

  public Post save(Post post) {
    return repository.save(post);
  }

  public boolean removeById(long id) {
    return repository.removeById(id);
  }
}

