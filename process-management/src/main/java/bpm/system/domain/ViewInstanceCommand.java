package bpm.system.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ViewInstanceCommand {

    private UUID instanceId;
}
