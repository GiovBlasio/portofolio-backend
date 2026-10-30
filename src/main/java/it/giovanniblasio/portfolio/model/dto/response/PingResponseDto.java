package it.giovanniblasio.portfolio.model.dto.response;

/**
 * PingResponseDto
 */
public class PingResponseDto {
    private String status;
    private Long timestamp;

    public PingResponseDto() {
    }

    public PingResponseDto(String status, Long timestamp) {
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
