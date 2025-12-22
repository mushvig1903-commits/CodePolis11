package Projects.ManagementAI;

import java.util.Random;
import java.util.Scanner;

public class AIProjectSimulation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("=== AI Project Simulation Started ===");
            System.out.println("Please enter the Team Leader's name to begin the simulation:");

            // Layihə obyektini yaradın
            ProjectState project = new ProjectState();

            // Burada ardıcıl metod çağırışları ilə bütün TASK-ları run edirik
            project.setTeamLeaderName(scanner.nextLine());   // Task 2
            project.randomizeBudget();                       // Task 3
            project.randomizeAccuracy();                     // Task 4
            project.checkAccuracy();                         // Task 5
            project.prepareDataCost();                       // Task 6–8
            project.printInitialState();

            project.runSprintCycle();                        // Task 9–17
            project.runAuditSimulation(scanner);             // Task 18–24
            project.runPrivacyBreachSimulation(scanner);     // Task 25–29
            project.runIntegrationSimulation();              // Task 30–41
            project.runCreditRiskForecast();                 // Task 42–53
            project.runEthicsTransparencyAudit(scanner);     // Task 54–65
            project.runFinalDecisionReport(scanner);         // Task 66–80
        }
    }
