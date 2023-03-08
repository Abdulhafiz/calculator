package com.jenkins.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResult {

    private String result;
    private String error;

    static ApiResult withResult(String resultMessage) {
        ApiResult apiResult = new ApiResult();
        apiResult.result = resultMessage;
        return apiResult;
    }

    static ApiResult withError(String errorMessage) {
        ApiResult apiResult = new ApiResult();
        apiResult.error = errorMessage;
        return apiResult;
    }

}
