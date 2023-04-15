package com.bimerinoel.docker.controller.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Bimeri Noel
 * @date 4/14/2023
 */

@RestController
public class MongoController {

    @Autowired
    private MyService myService;

    @GetMapping(path = "get/books")
    public ResponseEntity<List<Snapshots>> getAllBooks(){
        return ResponseEntity.ok(myService.getAllBooks());
    }

    @PostMapping(path = "add/books")
    public ResponseEntity<Snapshots> addBooks(@RequestBody Snapshots snapshots){
        System.out.println("data body: " + snapshots);
        return ResponseEntity.ok(myService.saveBooks(snapshots));
    }

    @GetMapping(path = "findOne/{id}")
    public ResponseEntity<Snapshots> getSnapshotById(@PathVariable String id) {
        return ResponseEntity.ok(myService.getSnapshotById(id));
    }

    @PutMapping(path = "update")
    public ResponseEntity<Snapshots> getSnapshotById(@RequestBody Snapshots snapshots) {
        return ResponseEntity.ok(myService.updateSnapshot(snapshots));
    }

    @DeleteMapping(path = "delete/{id}")
    public ResponseEntity<String> deleteSnapshot(@PathVariable String id) {
        return ResponseEntity.ok(myService.deleteSnapshot(id));
    }

}

