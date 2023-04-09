package org.springframework.test.recycle.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yangxiaolong
 */
@Component
public class DoCalculate {

	@Autowired
	private Calculate calculate;

	public int doDiv(int i, int j) {
		return i / j;
	}

}
