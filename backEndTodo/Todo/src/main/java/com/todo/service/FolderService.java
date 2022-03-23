package com.todo.service;

import com.todo.model.Folder;
import com.todo.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FolderService {

    @Autowired
    private FolderRepository folderRepository;


    public FolderService() {

    }

    public Optional<Folder> getOneFolder(Folder folder)
    {
        return folderRepository.findById(folder.getFolderId());

    }

    public List<Folder> listFolder()
    {
        return (List<Folder>) folderRepository.findAll();
    }

    public void deleteFolder(Folder deleteFolder)
    {
        folderRepository.deleteById(deleteFolder.getFolderId());
    }

    public Folder updateFolder(Folder updatedFolder)
    {
        return folderRepository.save(updatedFolder);
    }

    public Folder createFolder(Folder newFolder)
    {
        return folderRepository.save(newFolder);
    }
}
