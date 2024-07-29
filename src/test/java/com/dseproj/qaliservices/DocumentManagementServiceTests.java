// src/test/java/com/desproj/qaliservices/DocumentManagementServiceTests.java
package com.dseproj.qaliservices;

import com.dseproj.qaliservices.impl.DocumentManagementServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentManagementServiceTests {

    @Test
    public void testUploadAndListDocuments() {
        DocumentManagementServiceImpl service = new DocumentManagementServiceImpl();
        service.uploadDocument("Test Document");
        assertEquals(1, service.listDocuments().size());
    }

    @Test
    public void testDownloadDocument() {
        DocumentManagementServiceImpl service = new DocumentManagementServiceImpl();
        service.uploadDocument("Test Document");
        String document = service.downloadDocument("Test Document");
        assertNotNull(document);
        assertEquals("Test Document", document);
    }

    @Test
    public void testDeleteDocument() {
        DocumentManagementServiceImpl service = new DocumentManagementServiceImpl();
        service.uploadDocument("Test Document");
        service.deleteDocument("Test Document");
        assertEquals(0, service.listDocuments().size());
    }
}
