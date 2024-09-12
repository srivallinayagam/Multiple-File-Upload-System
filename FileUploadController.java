
package com.example.multifileupload;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class FileUploadController {

    @Value("${file.upload-dir}")
    private String uploadDir;

    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(@RequestParam("files") MultipartFile[] files) {
        StringBuilder result = new StringBuilder();

        for (MultipartFile file : files) {
            try {
                // Save file to the filesystem
                Path path = Paths.get(uploadDir, file.getOriginalFilename());
                Files.write(path, file.getBytes());

                result.append("Successfully uploaded ").append(file.getOriginalFilename()).append("\n");
            } catch (IOException e) {
                result.append("Failed to upload ").append(file.getOriginalFilename()).append(": ").append(e.getMessage()).append("\n");
            }
        }

        return ResponseEntity.ok(result.toString());
    }

    @GetMapping("/list")
    public ResponseEntity<List<String>> listUploadedFiles() {
        File folder = new File(uploadDir);
        File[] files = folder.listFiles();

        if (files != null) {
            List<String> fileNames = List.of(files).stream()
                                            .map(File::getName)
                                            .collect(Collectors.toList());
            return ResponseEntity.ok(fileNames);
        } else {
            return ResponseEntity.ok(List.of());
        }
    }
}
