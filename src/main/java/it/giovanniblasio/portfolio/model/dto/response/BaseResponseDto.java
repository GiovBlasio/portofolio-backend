package it.giovanniblasio.portfolio.model.dto.response;

public class BaseResponseDto<T> {

    private T data;
    private String message;

    public BaseResponseDto() {
    }

    public BaseResponseDto(T data, String message) {
        this.data = data;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
