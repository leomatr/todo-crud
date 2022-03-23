package com.todo.resource;

import com.todo.model.Item;
import com.todo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/item")
@Produces(MediaType.APPLICATION_JSON)
public class ItemResource {

    private ItemService itemService;

    @Autowired
    public ItemResource(ItemService itemService) {
        this.itemService = itemService;
    }

    @GET
    @Path("/{folderId}")
    public Response getItemList(@PathParam("folderId") int folderId) {
        return Response.ok(itemService.listItem(folderId)).build();
    }

    @PUT
    public Response updateItem(Item itemRequest) {
        return Response.ok(itemService.updateItem(itemRequest)).build();
    }

    @POST
    public Response createItem(Item newItem) {

        return Response.ok(itemService.createItem(newItem)).build();
    }

    @DELETE
    public Response deleteItem(Item deleteItem) {
        itemService.deleteItem(deleteItem);
        return Response.ok().build();
    }
}
