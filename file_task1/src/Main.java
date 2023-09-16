import service.management.IManagementService;
import service.management.ManagementService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        ManagementService managementService = new IManagementService();
        managementService.management();
    }
}
