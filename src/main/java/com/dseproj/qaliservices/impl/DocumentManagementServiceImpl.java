// src/main/java/com/desproj/qaliservices/impl/DocumentManagementServiceImpl.java
package com.dseproj.qaliservices.impl;

import com.dseproj.qaliservices.services.DocumentManagementService;
import com.dseproj.qaliservices.services.StorageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentManagementServiceImpl implements DocumentManagementService {

    private final StorageService storageService;

    public DocumentManagementServiceImpl(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public void uploadDocument(String document) {
        storageService.store(document);
    }

    @Override
    public String downloadDocument(String documentId) {
        return storageService.retrieve(documentId);
    }

    @Override
    public List<String> listDocuments() {
        return storageService.list();
    }

    @Override
    public void deleteDocument(String documentId) {
        storageService.delete(documentId);
    }
}
