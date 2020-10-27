package io.reflectoring.api;

import io.reflectoring.model.Hat;
import io.reflectoring.model.NewHat;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link HatsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-27T10:57:25.142-04:00[America/New_York]")

public interface HatsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /hats : Create a newHat
     * Creates a new instance of a &#x60;newHat&#x60;.
     *
     * @param body A new &#x60;newHat&#x60; to be created. Ids will be generated and added to allow newHat to become a Hat object. (required)
     * @return Successful response. (status code 201)
     * @see HatsApi#createNewHat
     */
    default ResponseEntity<Void> createNewHat(NewHat body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /hats/{hatId} : Delete a Hat
     * Deletes an existing &#x60;Hat&#x60;.
     *
     * @param hatId A unique identifier for a &#x60;Hat&#x60;. (required)
     * @return Successful response. (status code 204)
     * @see HatsApi#deleteHat
     */
    default ResponseEntity<Void> deleteHat(String hatId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /hats/{hatId} : Get a Hat
     * Gets the details of a single instance of a &#x60;Hat&#x60;.
     *
     * @param hatId A unique identifier for a &#x60;Hat&#x60;. (required)
     * @return Successful response - returns a single &#x60;Hat&#x60;. (status code 200)
     * @see HatsApi#getHat
     */
    default ResponseEntity<Hat> getHat(String hatId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /hats : List All Hats
     * Gets a list of all &#x60;Hat&#x60; entities.
     *
     * @return Successful response - returns an array of &#x60;Hat&#x60; entities. (status code 200)
     * @see HatsApi#getHats
     */
    default ResponseEntity<List<Hat>> getHats() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /hats/{hatId} : Update a Hat
     * Updates an existing &#x60;Hat&#x60;.
     *
     * @param hatId A unique identifier for a &#x60;Hat&#x60;. (required)
     * @param body Updated &#x60;Hat&#x60; information. (required)
     * @return Hat object properly updated. (status code 202)
     * @see HatsApi#updateHat
     */
    default ResponseEntity<Void> updateHat(String hatId,
        Hat body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
