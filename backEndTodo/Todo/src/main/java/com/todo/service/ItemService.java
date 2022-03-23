package com.todo.service;

import com.todo.model.Folder;
import com.todo.model.Item;
import com.todo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public ItemService() {
    }

    public Optional<Item> getOneItem(int itemId)
    {
        return itemRepository.findById(itemId);
    }

    public List<Item> listItem(int folderId)
    {
        Folder folder= new Folder();folder.setFolderId(folderId);
        return (List<Item>) itemRepository.findAllByFolder(folder);
    }

    public void deleteItem(Item item)
    {
        itemRepository.deleteById(item.getItemId());
    }

    public Item updateItem(Item updatedItem)
    {
        return updatedItem;
    }

    public Item createItem(Item newItem)
    {
        return newItem;
    }
}
