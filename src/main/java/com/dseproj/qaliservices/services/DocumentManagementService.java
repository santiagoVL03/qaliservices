// src/main/java/com/desproj/qaliservices/services/DocumentManagementService.java
package com.dseproj.qaliservices.services;

import java.util.List;

public interface DocumentManagementService {
    void uploadDocument(String document);
    String downloadDocument(String documentId);
    List<String> listDocuments();
    void deleteDocument(String documentId);
}
