package com.bimerinoel.docker.controller.mongo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

import static com.bimerinoel.docker.controller.mongo.TestingMongoRepository.SNAPSHOTS_COLLECTION;


/**
 * @author Bimeri Noel
 * @date 4/11/2023
 */

@Data
@NoArgsConstructor
@Document(SNAPSHOTS_COLLECTION)
public class Snapshots {
    @Id
    private String id;

    @Indexed
    @NotNull
    private String configuratorVersionedEntityId;

    @NotBlank
    private boolean systemGenerated;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    @CreatedBy
    private AdminUserDto createdBy;
}
