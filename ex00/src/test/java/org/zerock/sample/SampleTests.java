package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//테스트코드가 Spring을 실행할 것이라고 알림
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//스프링의 빈으로 등록
@Log4j
//Lombok을 이용, 로그를 기록하는 Logger를 변수로 생성
public class SampleTests {
	
	@Setter(onMethod_ = @Autowired)
	private Restaurant restaurant;
	
	@Test
	//junit에서의 테스트 대상 표시
	public void textExit() {
		assertNotNull(restaurant);
		//restaurant가 null이 아니어야만 테스트 성공
		
		log.info(restaurant);
		log.info("-------------------------------------");
		log.info(restaurant.getChef());
		
	}
}
