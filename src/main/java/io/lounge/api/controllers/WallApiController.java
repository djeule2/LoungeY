package io.lounge.api.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.lounge.api.interfaces.WallApi;
import io.lounge.models.Wall;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-16T12:49:56.829Z")

@Controller
public class WallApiController implements WallApi {

    private static final Logger log = LoggerFactory.getLogger(WallApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WallApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Wall>> getWall(@ApiParam(value = "",required=true) @PathVariable("idUser") String idUser) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Wall>>(objectMapper.readValue("[ {  \"yearOfStudy\" : 0.80082819046101150206595775671303272247314453125,  \"posts\" : [ {    \"hashtags\" : [ {      \"name\" : \"name\",      \"postsWithThisHashtag\" : [ 5.63737665663332876420099637471139430999755859375, 5.63737665663332876420099637471139430999755859375 ],      \"conditions\" : {        \"levelValues\" : [ \"levelValues\", \"levelValues\" ],        \"name\" : \"name\",        \"collection\" : \"collection\",        \"operator\" : \"operator\"      }    }, {      \"name\" : \"name\",      \"postsWithThisHashtag\" : [ 5.63737665663332876420099637471139430999755859375, 5.63737665663332876420099637471139430999755859375 ],      \"conditions\" : {        \"levelValues\" : [ \"levelValues\", \"levelValues\" ],        \"name\" : \"name\",        \"collection\" : \"collection\",        \"operator\" : \"operator\"      }    } ],    \"responses\" : [ null, null ],    \"id\" : 6.02745618307040320615897144307382404804229736328125,    \"text\" : \"text\",    \"type\" : 5.962133916683182377482808078639209270477294921875,    \"userId\" : 1.46581298050294517310021547018550336360931396484375,    \"isCorrectAnswer\" : true,    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"  }, {    \"hashtags\" : [ {      \"name\" : \"name\",      \"postsWithThisHashtag\" : [ 5.63737665663332876420099637471139430999755859375, 5.63737665663332876420099637471139430999755859375 ],      \"conditions\" : {        \"levelValues\" : [ \"levelValues\", \"levelValues\" ],        \"name\" : \"name\",        \"collection\" : \"collection\",        \"operator\" : \"operator\"      }    }, {      \"name\" : \"name\",      \"postsWithThisHashtag\" : [ 5.63737665663332876420099637471139430999755859375, 5.63737665663332876420099637471139430999755859375 ],      \"conditions\" : {        \"levelValues\" : [ \"levelValues\", \"levelValues\" ],        \"name\" : \"name\",        \"collection\" : \"collection\",        \"operator\" : \"operator\"      }    } ],    \"responses\" : [ null, null ],    \"id\" : 6.02745618307040320615897144307382404804229736328125,    \"text\" : \"text\",    \"type\" : 5.962133916683182377482808078639209270477294921875,    \"userId\" : 1.46581298050294517310021547018550336360931396484375,    \"isCorrectAnswer\" : true,    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"  } ],  \"username\" : \"username\"}, {  \"yearOfStudy\" : 0.80082819046101150206595775671303272247314453125,  \"posts\" : [ {    \"hashtags\" : [ {      \"name\" : \"name\",      \"postsWithThisHashtag\" : [ 5.63737665663332876420099637471139430999755859375, 5.63737665663332876420099637471139430999755859375 ],      \"conditions\" : {        \"levelValues\" : [ \"levelValues\", \"levelValues\" ],        \"name\" : \"name\",        \"collection\" : \"collection\",        \"operator\" : \"operator\"      }    }, {      \"name\" : \"name\",      \"postsWithThisHashtag\" : [ 5.63737665663332876420099637471139430999755859375, 5.63737665663332876420099637471139430999755859375 ],      \"conditions\" : {        \"levelValues\" : [ \"levelValues\", \"levelValues\" ],        \"name\" : \"name\",        \"collection\" : \"collection\",        \"operator\" : \"operator\"      }    } ],    \"responses\" : [ null, null ],    \"id\" : 6.02745618307040320615897144307382404804229736328125,    \"text\" : \"text\",    \"type\" : 5.962133916683182377482808078639209270477294921875,    \"userId\" : 1.46581298050294517310021547018550336360931396484375,    \"isCorrectAnswer\" : true,    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"  }, {    \"hashtags\" : [ {      \"name\" : \"name\",      \"postsWithThisHashtag\" : [ 5.63737665663332876420099637471139430999755859375, 5.63737665663332876420099637471139430999755859375 ],      \"conditions\" : {        \"levelValues\" : [ \"levelValues\", \"levelValues\" ],        \"name\" : \"name\",        \"collection\" : \"collection\",        \"operator\" : \"operator\"      }    }, {      \"name\" : \"name\",      \"postsWithThisHashtag\" : [ 5.63737665663332876420099637471139430999755859375, 5.63737665663332876420099637471139430999755859375 ],      \"conditions\" : {        \"levelValues\" : [ \"levelValues\", \"levelValues\" ],        \"name\" : \"name\",        \"collection\" : \"collection\",        \"operator\" : \"operator\"      }    } ],    \"responses\" : [ null, null ],    \"id\" : 6.02745618307040320615897144307382404804229736328125,    \"text\" : \"text\",    \"type\" : 5.962133916683182377482808078639209270477294921875,    \"userId\" : 1.46581298050294517310021547018550336360931396484375,    \"isCorrectAnswer\" : true,    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"  } ],  \"username\" : \"username\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Wall>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Wall>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
