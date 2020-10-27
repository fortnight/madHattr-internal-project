package io.reflectoring.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-27T10:57:25.142-04:00[America/New_York]")

@Controller
@RequestMapping("${openapi.madHattr.base-path:}")
public class HatsApiController implements HatsApi {

    private final HatsApiDelegate delegate;

    public HatsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) HatsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new HatsApiDelegate() {});
    }

    @Override
    public HatsApiDelegate getDelegate() {
        return delegate;
    }

}
