// src/main/java/com/desproj/qaliservices/controller/DocumentManagementController.java
package com.dseproj.qaliservices.controller;

import com.dseproj.qaliservices.services.DocumentManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentManagementController {

    @Autowired
    private DocumentManagementService documentManagementService;

    @PostMapping("/upload")
    public void uploadDocument(@RequestParam String document) {
        documentManagementService.uploadDocument(document);
    }

    @GetMapping("/download/{id}")
    public String downloadDocument(@PathVariable String id) {
        return documentManagementService.downloadDocument(id);
    }

    @GetMapping("/list")
    public List<String> listDocuments() {
        return documentManagementService.listDocuments();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDocument(@PathVariable String id) {
        documentManagementService.deleteDocument(id);
    }
}
