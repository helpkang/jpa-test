package net.guides.springboot2.springboot2jpacrudexample.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class StringObject implements Serializable{
    
	private static final long serialVersionUID = 1L;

    @Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
    }
    
    // @Override
    // public int hashCode() {
    //     return toString().hashCode();
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     return toString().equals(((StringObject)obj).toString());
    // }

}