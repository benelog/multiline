package org.adrianwalker.multilinestring;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;

import java.lang.reflect.Field;

import org.apache.commons.lang.reflect.FieldUtils;
import org.eclipse.jdt.internal.compiler.apt.dispatch.BatchProcessingEnvImpl;
import org.junit.Test;

import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.util.Context;


public class MultilineProcessorTest {

	MultilineProcessor processor = new MultilineProcessor();
	
	@Test
	public void initInJavacEnv() throws IllegalArgumentException, IllegalAccessException {
		// given 
		JavacProcessingEnvironment env = new JavacProcessingEnvironment(new Context(), null);
		// when
		processor.init(env);

		// then
		String className = extractFieldClassName("delegator");
		assertThat(className,is("org.adrianwalker.multilinestring.JavacMultilineProcessor"));
	}

	@Test
	public void initInEcjEnv() throws IllegalArgumentException, IllegalAccessException {
		// given 
		BatchProcessingEnvImpl env = mock(BatchProcessingEnvImpl.class);

		// when
		processor.init(env);

		// then
		String className = extractFieldClassName("delegator");
		assertThat(className,is("org.adrianwalker.multilinestring.EcjMultilineProcessor"));
	}

	
	private String extractFieldClassName(String fieldName) throws IllegalAccessException {
		Field field = FieldUtils.getField(MultilineProcessor.class, fieldName, true);
		Object fieldInstance = field.get(processor);
		return fieldInstance.getClass().getName();
	}
}
