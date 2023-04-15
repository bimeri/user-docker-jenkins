package com.bimerinoel.docker.controller.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Bimeri Noel
 * @date 4/14/2023
 */

@MultiTenantRepository
public interface TestingMongoRepository extends MongoRepository<Snapshots, String> {
 String SNAPSHOTS_COLLECTION = "book";
 List<Snapshots> findAll();
}
