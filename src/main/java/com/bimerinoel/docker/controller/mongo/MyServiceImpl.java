package com.bimerinoel.docker.controller.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Bimeri Noel
 * @date 4/14/2023
 */
@Service
public class MyServiceImpl implements MyService {
 @Autowired
 private TestingMongoRepository testingMongoRepository;
 @Override
 public List<Snapshots> getAllBooks() {
  return testingMongoRepository.findAll();
 }

 @Override
 public Snapshots saveBooks(Snapshots snapshots) {
  return testingMongoRepository.save(snapshots);
 }

 @Override
 public Snapshots getSnapshotById(String id) {
  Optional<Snapshots> snapshots = testingMongoRepository.findById(id);
  return snapshots.orElseGet(null);
 }

 @Override
 public String deleteSnapshot(String id) {
  Optional<Snapshots> snapshots = testingMongoRepository.findById(id);
  if (snapshots.isPresent()) {
   testingMongoRepository.deleteById(id);
   return "deleted successfully";
  }
  return "fail to delete, not present";
 }

 @Override
 public Snapshots updateSnapshot(Snapshots snaps) {
  Optional<Snapshots> snapshots = testingMongoRepository.findById(snaps.getId());
  if (snapshots.isPresent()) {
   Snapshots s = snapshots.get();
   AdminUserDto adminUserDto = new AdminUserDto();
   adminUserDto.setFullName(snaps.getCreatedBy().getFullName());
   adminUserDto.setProfileUrl(snaps.getCreatedBy().getProfileUrl());
   s.setCreatedBy(adminUserDto);
   s.setCreatedAt(s.getCreatedAt());
   s.setSystemGenerated(snaps.isSystemGenerated());
   s.setConfiguratorVersionedEntityId(snaps.getConfiguratorVersionedEntityId());
   testingMongoRepository.save(s);
   return s;
  }
  return null;
 }
}
