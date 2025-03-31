package ch16_bean.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PersonLombok {
    @NonNull                    // 필드 레벨의 에너테이션
    private String name;        // 얘는 비울 수 없음을 나타냄
    private int age;

    // 이상의 경우 동일하게 private final String name을 했을 때
    // 오류가 발생했지만, alt + ins 가 아니라 Lombok 을 통해서 해결

    // RequiredArgsConstructor 는 필드의 final 을 감지해서
    //


}
