package com.todo.repository;

import com.todo.model.Folder;
import com.todo.model.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {


    List<Item> findAllByFolder(Folder folderId);
}
