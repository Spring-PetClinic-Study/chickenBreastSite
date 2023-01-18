package kr.co.chikenbreastsite.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCodeType{

    UNKNOWN(400, "COMMON_001", "UNKNOWN"),
    USER_UNAUTHORIZED(400, "COMMON_002", "이 기능을 사용할 수 없는 사용자입니다."),
    //Users
    USER_NOT_FOUND(400, "MEMBER_001", "해당 회원을 찾을 수 없습니다."),
    WRONG_PASSWORD(400, "MEMBER_002", "비밀번호가 일치하지 않습니다."),
    NEW_PASSWORD(400, "MEMBER_003", "기존 비밀번호와 새로운 비밀번호가 일치합니다."),
    WRONG_CHECK_PASSWORD(400, "MEMBER_004", "새로운 비밀번호와 확인 비밀번호가 일치하지 않습니다."),
    DUPLICATION_ID(400,"MEMBER_005", "중복된 아이디 입니다."),
    DUPLICATION_CELLPHONE(400,"MEMBER_006", "중복된 전화번호 입니다."),
    REQUIRED_NOT_INPUT(400, "MEMBER_007", "필수 입력 사항을 입력하지 않았습니다."),

    //Product
    DUPLICATION_PRODUCT_NAME(400,"PRODUCT_002", "중복된 상품 이름 입니다."),
    PRODUCT_NOT_FOUND(400,"PRODUCT_003", "해당 상품을 찾을 수 없습니다."),
    PRODUCT_DOES_NOT_ALREADY_EXIST(400,"PRODUCT_004", "해당 상품은 이미 존재하지 않습니다."),

    INPUT_VALUE_INVALID(400, "COMMON_003", "입력값이 올바르지 않습니다.");

    private int status;
    private String code;
    private String message;
}
