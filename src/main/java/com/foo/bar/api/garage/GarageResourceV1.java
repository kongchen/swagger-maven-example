package com.foo.bar.api.garage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.sun.jersey.api.NotFoundException;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiError;
import com.wordnik.swagger.annotations.ApiErrors;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * Created with IntelliJ IDEA.
 * User: kongchen
 * Date: 5/13/13
 */
@Path("/garage.json")
@Api(value = "/garage", description = "Operations about garages")
@Produces( {"application/json"})
public class GarageResourceV1 {
    @GET
    @Path("/{garageId}")
    @ApiOperation(value = "Find garages by Id", notes = "To get garage info",
            responseClass = "com.foo.bar.model.Garage")
    @ApiErrors(value = {@ApiError(code = 400, reason = "Invalid ID supplied"),
            @ApiError(code = 404, reason = "Garage not found")})
    public Response getGarageById(
            @ApiParam(value = "ID of garage that needs to be fetched", allowableValues = "range[1,100]",
                    required = true) @PathParam("garageId") String garageId)
            throws NotFoundException {
        return Response.noContent().build();
    }
}
