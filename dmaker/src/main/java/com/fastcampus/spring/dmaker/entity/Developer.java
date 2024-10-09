package com.fastcampus.spring.dmaker.entity;

import com.fastcampus.spring.dmaker.type.DeveloperLevel;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Developer {
    // entity는 몇가지 규약에 맞춘 property를 만들어줘야함

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Enumerated(EnumType.STRING)
    private DeveloperLevel developerLevel;

    @Enumerated(EnumType.STRING)
    private DeveloperSkillType developerSkillType;

    private Integer experienceYears;
    private String memberId;
    private String name;
    private Integer age;


}

// builder를 쓰려면, NoArg와 AllArg를 써야지 에러가 덜 발생. 따라서 주로 같이 사용.

