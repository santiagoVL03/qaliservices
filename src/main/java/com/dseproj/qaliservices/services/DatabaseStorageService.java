package com.dseproj.qaliservices.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseStorageService implements StorageService {

    @Override
    public void store(String document) {
    }

    @Override
    public String retrieve(String documentId) {
        return null;
    }

    @Override
    public void delete(String documentId) {
    }

    @Override
    public List<String> list() {
        return null;
    }
}