package com.ecommerce.project.exceptions;

public class ResourceNotFoundExcepiton extends RuntimeException {
    String resourceName;
    String field;
    String fieldName;
    Long fieldId;

    public ResourceNotFoundExcepiton() {
    }

    public ResourceNotFoundExcepiton(String resourceName, String field, String fieldName) {
        super(String.format("%s not found with %s %s",resourceName,field,fieldName));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldName = fieldName;
    }

    public ResourceNotFoundExcepiton(String resourceName, String field, Long fieldId) {
        super(String.format("%s not found with %s %d",resourceName,field,fieldId));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldId= fieldId;
    }

}
