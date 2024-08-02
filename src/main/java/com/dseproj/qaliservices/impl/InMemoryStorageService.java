package com.dseproj.qaliservices.impl;

import com.dseproj.qaliservices.services.StorageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryStorageService implements StorageService {

    private List<String> documents = new ArrayList<>();

    @Override
    public void store(String document) {
        documents.add(document);
    }

    @Override
    public String retrieve(String documentId) {
        // Aquí se añadiría lógica para obtener el documento por su ID
        // Por simplicidad, en este ejemplo se asume que el ID es el mismo que el nombre del documento
        return documents.stream()
                .filter(doc -> doc.equals(documentId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(String documentId) {
        documents.remove(documentId);
    }

    @Override
    public List<String> list() {
        return new ArrayList<>(documents);
    }
}
