// src/main/java/com/desproj/qaliservices/impl/DocumentManagementServiceImpl.java
package com.dseproj.qaliservices.impl;

import com.dseproj.qaliservices.services.DocumentManagementService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocumentManagementServiceImpl implements DocumentManagementService {

    private List<String> documents = new ArrayList<>();

    @Override
    public void uploadDocument(String document) {
        documents.add(document);
    }

    @Override
    public String downloadDocument(String documentId) {
        // Aquí se añadiría lógica para obtener el documento por su ID
        // Por simplicidad, en este ejemplo se asume que el ID es el mismo que el nombre del documento
        return documents.stream()
                .filter(doc -> doc.equals(documentId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<String> listDocuments() {
        return new ArrayList<>(documents);
    }

    @Override
    public void deleteDocument(String documentId) {
        documents.remove(documentId);
    }
}
