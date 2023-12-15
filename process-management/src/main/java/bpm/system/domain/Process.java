package bpm.system.domain;

import bpm.system.ProcessManagementApplication;
import bpm.system.domain.ProcessDefined;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Process_table")
@Data
//<<< DDD / Aggregate Root
public class Process {

    @Id
    private UUID processId;

    private String processName;

    private List<Task> taskList;

    private List<Permission> permissions;

    @PostPersist
    public void onPostPersist() {
        ProcessDefined processDefined = new ProcessDefined(this);
        processDefined.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ProcessRepository repository() {
        ProcessRepository processRepository = ProcessManagementApplication.applicationContext.getBean(
            ProcessRepository.class
        );
        return processRepository;
    }

    //<<< Clean Arch / Port Method
    public void modifyProcess(ModifyProcessCommand modifyProcessCommand) {
        //implement business logic here:

        ProcessModified processModified = new ProcessModified(this);
        processModified.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void reviewProcess(ReviewProcessCommand reviewProcessCommand) {
        //implement business logic here:

        ProcessReviewed processReviewed = new ProcessReviewed(this);
        processReviewed.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
