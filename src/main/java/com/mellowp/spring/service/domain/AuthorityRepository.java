package com.mellowp.spring.service.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    // TODO: iBatis/myBatis 에서 DAO 라고 불리는 DB Layer 접근자.
    // TODO: JPA 에서는 Repository 라고 부르며 Interface 로 생성 (@Repository 별도 추가 필요없음)

}
