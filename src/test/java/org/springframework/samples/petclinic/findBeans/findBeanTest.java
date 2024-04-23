package org.springframework.samples.petclinic.findBeans;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class findBeanTest {

	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();

	@Test
	@DisplayName("부모 타입으로 모두 조회하기 - Object")
	void findAllBeanByObjectType() {
		Map<String, Object> beansOfType = ac.getBeansOfType(Object.class); // 모든 빈들. 진짜 존재하는 모든 빈들. 모든 것이 오브젝트 타입이라서. 모든 객체가 다 나온다.
		for (String key : beansOfType.keySet()) {
			System.out.println("key = " + key + " value=" +
				beansOfType.get(key));
		}
	}

}
