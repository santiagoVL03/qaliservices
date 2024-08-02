// src/test/java/com/desproj/qaliservices/DocumentManagementServiceTests.java
package com.dseproj.qaliservices;

import com.dseproj.qaliservices.impl.DocumentManagementServiceImpl;
import com.dseproj.qaliservices.impl.InMemoryStorageService;
import com.dseproj.qaliservices.services.StorageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentManagementServiceTests {

    @Autowired
    private DocumentManagementServiceImpl documentManagementService;

    private StorageService storageService;

    @BeforeEach
    public void setUp() {
        storageService = new InMemoryStorageService();
        documentManagementService = new DocumentManagementServiceImpl(storageService);
    }

    @Test
    public void testUploadAndListDocuments() {
        documentManagementService.uploadDocument("Test Document");
        List<String> result = documentManagementService.listDocuments();

        assertEquals(1, result.size());
        assertEquals("Test Document", result.get(0));
    }

    @Test
    public void testDownloadDocument() {
        documentManagementService.uploadDocument("Test Document");
        String document = documentManagementService.downloadDocument("Test Document");

        assertNotNull(document);
        assertEquals("Test Document", document);
    }

    @Test
    public void testDeleteDocument() {
        documentManagementService.uploadDocument("Test Document");
        documentManagementService.deleteDocument("Test Document");

        List<String> result = documentManagementService.listDocuments();
        assertEquals(0, result.size());
    }
}
