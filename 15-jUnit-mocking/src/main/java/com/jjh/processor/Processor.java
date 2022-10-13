package com.jjh.processor;

import com.jjh.domain.Person;

public interface Processor {
	
	boolean hasNext();
	Person next();

}
