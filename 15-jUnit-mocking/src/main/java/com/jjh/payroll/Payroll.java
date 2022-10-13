package com.jjh.payroll;

import java.util.ArrayList;
import java.util.List;

import com.jjh.domain.Person;
import com.jjh.processor.Processor;

public class Payroll {
	
	private Processor processor;
	
	public Payroll(Processor processor) {
		this.processor = processor;
	}
	
	public List<String> getPeopleToPay() {

		List<String> list = new ArrayList<>();

		while (processor.hasNext()) {
			Person p = processor.next();
			list.add(p.getName());
		}

		return list;
	}

}
