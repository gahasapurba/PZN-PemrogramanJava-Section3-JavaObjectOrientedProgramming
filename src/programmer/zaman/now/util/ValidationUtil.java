package programmer.zaman.now.util;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.BlankException;
import programmer.zaman.now.error.ValidationException;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username Is Null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username Is Blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password Is Null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password Is Blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username Is Null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username Is Blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password Is Null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password Is Blank");
        }
    }

}