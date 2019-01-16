/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.lounge.api.interfaces;

import io.lounge.models.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-16T12:49:56.829Z")

@Api(value = "friends", description = "the friends API")
public interface FriendsApi {

    @ApiOperation(value = "Add friend to current user", nickname = "addFriend", notes = "", response = Boolean.class, tags={ "friends", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Boolean.class),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/friends/{idCurrentUser}/new/{idNewFriend}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Boolean> addFriend(@ApiParam(value = "", required = true) @PathVariable("idCurrentUser") String idCurrentUser, @ApiParam(value = "", required = true) @PathVariable("idNewFriend") String idNewFriend);


    @ApiOperation(value = "Get friends of user", nickname = "getFriends", notes = "Returns list of friends", response = User.class, responseContainer = "List", tags={ "friends", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/friends/{idCurrentUser}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> getFriends(@ApiParam(value = "", required = true) @PathVariable("idCurrentUser") String idCurrentUser);

}
