package com.todo.resource;

import com.todo.model.Folder;
import com.todo.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Path("/folder")
@Produces(MediaType.APPLICATION_JSON)
public class FolderResource {

    private FolderService folderService;

    @Autowired
    public FolderResource(FolderService folderService) {
        this.folderService = folderService;
    }

    @GET
    public Response getFolderList() {
        return Response.ok(folderService.listFolder()).build();
    }

    @PUT
    public Response updateFolder(Folder folderRequest) {
        return Response.ok(folderService.updateFolder(folderRequest)).build();
    }

    @POST
    public Response createFolder(Folder newFolder) {

        return Response.ok(folderService.createFolder(newFolder)).build();
    }

    @DELETE
    public Response deleteFolder(Folder deleteFolder) {
        folderService.deleteFolder(deleteFolder);
        return Response.ok().build();
    }
}
