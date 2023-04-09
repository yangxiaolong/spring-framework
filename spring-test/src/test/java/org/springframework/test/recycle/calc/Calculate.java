package org.springframework.test.recycle.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yangxiaolong
 */
@Component
public class Calculate {

	@Autowired
	private DoCalculate doCalculate;

	public int div(int i, int j) {
		return doCalculate.doDiv(i, j);
	}

}
