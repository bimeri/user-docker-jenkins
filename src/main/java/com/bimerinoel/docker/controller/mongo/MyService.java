package com.bimerinoel.docker.controller.mongo;

import java.util.List;

/**
 * @author Bimeri Noel
 * @date 4/14/2023
 */


public interface MyService {
 List<Snapshots> getAllBooks();

 Snapshots saveBooks(Snapshots snapshots);

 Snapshots getSnapshotById(String id);

 String deleteSnapshot(String id);

 Snapshots updateSnapshot(Snapshots snapshots);
}
