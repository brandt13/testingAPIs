package pack.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({GeneralException.class})
    public @ResponseBody ExceptionResponse handle404(GeneralException ge) {

        ExceptionResponse er = new ExceptionResponse();
        er.setMessage(ge.getMessage());
        er.setStatus("error");
        er.setResponseCode(HttpStatus.I_AM_A_TEAPOT);
        return er;
    }

    @ExceptionHandler({AuthenticationException.class})
    public @ResponseBody ExceptionResponse handleBadApiKey(AuthenticationException ae) {

        ExceptionResponse er = new ExceptionResponse();
        er.setMessage(ae.getMessage());
        er.setStatus("invalid");
        er.setResponseCode(HttpStatus.I_AM_A_TEAPOT);
        return er;
    }
}
