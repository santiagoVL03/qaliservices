// src/main/java/com/desproj/qaliservices/services/StorageService.java
package com.dseproj.qaliservices.services;

import java.util.List;

public interface StorageService {
    void store(String document);
    String retrieve(String documentId);
    void delete(String documentId);
    List<String> list();
}
