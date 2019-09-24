package com.mellowp.spring.service.domain;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorityRepositoryTest {

    @Autowired
    AuthorityRepository authorityRepository;

    @After
    public void clean(){
        // 테스트 메소드가 끝날 경우, 이 후 테스트 코드에 영향을 끼치지 않기 위해 작성
        authorityRepository.deleteAll();
    }

    @Test
    public void board_data_read_test(){

        // given
        authorityRepository.save(Authority.builder().name("전시관리").code("auth-display-0001").description("전시관리 메뉴권한").build());

        // when
        List<Authority> authorityList = authorityRepository.findAll();

        // then
        Authority authority = authorityList.get(0);
        assertThat(authority.getName(), is("전시관리"));
        assertThat(authority.getCode(), is("auth-display-0001"));

    }


    @Test
    public void board_data_register_test(){

        // given
        LocalDateTime now = LocalDateTime.now();
        authorityRepository.save(Authority.builder().name("상품관리").code("auth-product-0001").description("상품관리 메뉴권한").build());

        // when
        List<Authority> authorityList = authorityRepository.findAll();

        // then
        Authority authority = authorityList.get(0);
        assertTrue(authority.getCreatedDate().isAfter(now));
        assertTrue(authority.getModifiedDate().isAfter(now));

    }








}
