package org.zerock.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.service.TxService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TxServiceTests {

	@Setter(onMethod_ = { @Autowired })
	private TxService service;

	@Test
	public void testTx() {
		String str = "진실한 사랑을 할 때만 피어나는 사랑의 장미야아아아야야야ㅑ야야야야야야아아아아아앙 끈질기군 ... 몇개나 넣어야하지 ";		
		service.insertAll(str);
	}

}
