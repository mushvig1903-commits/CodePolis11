package Projects.ManagementAI;

import java.util.Random;
import java.util.Scanner;

class ProjectState {
    String teamLeaderName;          // Komanda rəhbərinin adı
    double initialBudget = 50000.0; // İlkin büdcə (AZN)
    int modelAccuracy = 75;         // Model dəqiqliyi (1-100 arası bal)
    int projectPhase = 1;           // Layihə mərhələsi (1-ci mərhələ: Konsepsiya)
    double regulationPenalty = 0.0; // Uyğunsuzluğa görə yığılan cərimə
    boolean applicationStopped = false; // Tətbiqin dayandırılması statusu
    int privacyRisk = 0;            // Məxfiliyin pozulma riski
    int dataQualityScore = 80;      // Məlumat keyfiyyəti balı

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);


    //Task2
    public void setTeamLeaderName(String name) {
        this.teamLeaderName = name;
    }
    //Task3
    public void randomizeBudget() {
        double min = 240000.0;
        double max = 260000.0;
        this.initialBudget = min + Math.random()* (max-min);
    }
    /// Task 4: Model dəqiqliyini random yenidən təyin edilmesi
    public void randomizeAccuracy() {
        this.modelAccuracy = 70 + random.nextInt(11);
    }
    // Task 5: Dəqiqlik yoxlaması
    public void checkAccuracy(){
        if (modelAccuracy < 75 ){
            System.out.println("Warning: Additional Data Analysis Required");
        }
    }
    // Task 6–8: Məlumat hazırlığı xərci
    public void prepareDataCost() {
        double dataPrepCost = initialBudget * 0.10;
        initialBudget -= dataPrepCost;
        dataQualityScore += 5;

    }
    public void printInitialState() {
        System.out.println("\n--- Initial Project State ---");
        System.out.println("Team Leader: " + teamLeaderName);
        System.out.printf("Initial Budget: %.2f AZN%n", initialBudget);
        System.out.println("Model Accuracy: " + modelAccuracy);
        System.out.println("Project Phase: " + projectPhase);
        System.out.printf("Regulation Penalty: %.2f AZN%n", regulationPenalty);
        System.out.println("Application Stopped: " + applicationStopped);
        System.out.println("Privacy Risk: " + privacyRisk);
        System.out.println("Data Quality Score: " + dataQualityScore);
    }
    public void runSprintCycle() {
        System.out.println("\\n--- 2. AI Model Improvement Sprints (5 Iterations) ---");
        int totalSprintCount = 5;
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nSprint " + i + " started...");

            // Task 10: Sprint Cost hesablanması
            double sprinCost = initialBudget * 0.15 * (1 + (projectPhase * 0.02));
            // Task 11: Büdcədən Sprint Cost çıxılır
            initialBudget -= sprinCost;
            // Task 12: Layihə mərhələsi artırılır
            projectPhase++;
            //TASK 13: modelDəqiqliyi dəyərini 1-4 aralığında təsadüfi artırın.
            int accuracyIncrease = 1 + random.nextInt(4);
            // TASK 14: Random istifadə edərək 25% şansla Məlumat Keyfiyyəti Problemi yaradın. Baş verərsə MəlumatKeyfiyyətiBalı-nı 10 vahid azaldın.
            //dataQualityScore
            if (random.nextDouble() < 0.25) {
                dataQualityScore -= 10;
                System.out.println("⚠ Data Quality Issue occurred! -10 points");
            }
            //TASK 15: Random istifadə edərək 10% şansla Məlumat Məxfiliyi Pozulması Riski yaradın. Baş verərsə TənzimləməCəriməsi-ni 5000.0 artırın.
            //privacyRisk
            if (random.nextDouble() < 0.10) {
                privacyRisk++;
                regulationPenalty += 5000.0;
                System.out.println("⚠ Privacy Breach Risk! Penalty +5000");
            }
            //TASK 16: if istifadə edərək, ilkinBüdcə < 50000.0 olarsa, tətbiqDayandırıldı = true edərək döngünü dayandırın (break).
            //initialBudget
            if (initialBudget < 50000.0) {
                applicationStopped = true;
                System.out.println("❌ Budget dropped below 50000. Application stopped!");
                break;
            }

            //TASK 17: if istifadə edərək, modelDəqiqliyi > 90 olarsa, ilkinBüdcə-yə 15000.0 bonus əlavə edin.
            //modelAccuracy
            if (modelAccuracy > 90) {
                initialBudget += 15000.0;
                System.out.println("🎉 Accuracy > 90! Bonus +15000 added to budget");
            }
        }
    }
    //TASK 18: do-while döngüsünü başladın. Döngü MəlumatKeyfiyyətiBalı < 90
    //VƏ TənzimləməCəriməsi > 0 olduğu müddətcə davam etməlidir.
    //dataQualityScore
    public void runAuditSimulation(Scanner scanner){
        if (!applicationStopped){
            System.out.println("\n--- 3. Regulation Audit Simulation ---");

        }
        do {
            System.out.println("Choose Audit Action" );
            System.out.println("1: Legal Analysis, 2: Data Cleaning, 3: Delay ");
            int choice = scanner.nextInt();
            projectPhase++;
            if (choice == 1){
                regulationPenalty -= 7000.0;
                initialBudget -= 4000.0;
                System.out.println("✔ Legal Analysis performed: Penalty -7000, Budget -4000");
            } else if (choice == 2) {
                dataQualityScore += 8;
                initialBudget -= 6000.0;
                System.out.println("✔ Data Cleaning performed: Data Quality +8, Budget -6000");

            } else if (choice == 3) {
                modelAccuracy-=5;
                regulationPenalty+=2000.0;
                System.out.println("⚠ Delay occurred: Accuracy -5, Penalty +2000");

            }else{
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
            if (dataQualityScore>100){
                dataQualityScore = 100;
                System.out.println("✔ Data Quality Score capped at 100. Audit loop stopped.");
                break;
            }
        }while (dataQualityScore<90 && regulationPenalty>0);




    }
    private void printAuditState() {
        System.out.println("\n--- Audit Results ---");
        System.out.printf("Budget: %.2f AZN%n", initialBudget);
        System.out.println("Model Accuracy: " + modelAccuracy);
        System.out.println("Project Phase: " + projectPhase);
        System.out.printf("Regulation Penalty: %.2f AZN%n", regulationPenalty);
        System.out.println("Privacy Risk: " + privacyRisk);
        System.out.println("Data Quality Score: " + dataQualityScore);
    }

    // Task 18: do-while döngüsü başlanır. Şərt: dataQualityScore < 90 && regulationPenalty > 0.
    //• Task 19: Scanner ilə istifadəçidən seçim alınır (1, 2, 3).
    //• Task 20: Layihə mərhələsi hər dəfə +1 artır.
    //• Task 21: Seçim 1 → Penalty -7000, Budget -4000.
    //• Task 22: Seçim 2 → Data Quality +8, Budget -6000.
    //• Task 23: Seçim 3 → Accuracy -5, Penalty +2000.
    //• Task 24: Əgər Data Quality > 100 olarsa, 100-ə bərabərlənir və döngü break ilə dayandırılır.

    public void runPrivacyBreachSimulation(Scanner scanner){
        int choice = scanner.nextInt();
        switch (choice){
            case 1:// Task 27: Conceal → 70% şansla Penalty +50000
                if (random.nextDouble() < 0.70) {
                    regulationPenalty += 50000.0;
                    System.out.println("⚠ Concealment failed! Penalty +50000");
                } else {
                    System.out.println("✔ Concealment successful, no penalty added.");
                }
                break;

            case 2:
                // Task 28: Immediate Disclosure → Accuracy -10, Penalty -15000
                modelAccuracy -= 10;
                regulationPenalty -= 15000.0;
                System.out.println("✔ Immediate Disclosure: Accuracy -10, Penalty -15000");
                break;

            case 3:
                // Task 29: Internal Investigation → Budget -20000, Privacy Risk -1 (min 0)
                initialBudget -= 20000.0;
                if (privacyRisk > 0) {
                    privacyRisk -= 1;
                }
                System.out.println("✔ Internal Investigation: Budget -20000, Privacy Risk -1");
                break;

            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }


    }
    // Privacy nəticələrini çap edən metod
    private void printPrivacyState() {
        System.out.println("\n--- Privacy Breach Results ---");
        System.out.printf("Budget: %.2f AZN%n", initialBudget);
        System.out.println("Model Accuracy: " + modelAccuracy);
        System.out.println("Project Phase: " + projectPhase);
        System.out.printf("Regulation Penalty: %.2f AZN%n", regulationPenalty);
        System.out.println("Privacy Risk: " + privacyRisk);
        System.out.println("Data Quality Score: " + dataQualityScore);
    }

    // Task 25: Scanner ilə istifadəçidən reaksiya strategiyası alınır (1, 2, 3).
    //• Task 26: switch-case blokunda seçimlər yoxlanılır.
    //• Task 27: Case 1 (Conceal) → 70% ehtimal ilə Penalty +50000.
    //• Task 28: Case 2 (Immediate Disclosure) → Accuracy -10, Penalty -15000.
    //• Task 29: Case 3 (Internal Investigation) → Budget -20000, Privacy Risk -1 (minimum 0).

    public void runIntegrationSimulation(){
        if (!applicationStopped){

            System.out.println("\n--- 5. AI Model Integration into Core Credit Systems ---");
            int integrationRiskScore = 1 + random.nextInt(30);
            double expectedLoss = integrationRiskScore * modelAccuracy * 100;
            initialBudget -= expectedLoss * 0.10;
            for (int i =1; i<=6; i++){
                System.out.println("\nIntegration Phase " + i + " started...");
                dataQualityScore++;
                modelAccuracy += 2;
                projectPhase++;
                if (random.nextDouble() <0.10){
                    regulationPenalty += 10000.0;
                    System.out.println("⚠ System Uncertainty: Penalty +10000");
                }
                if (modelAccuracy>95){
                    System.out.println("✔ Accuracy exceeded 95. Integration loop stopped.");
                    break;
                }
            }
            integrationRiskScore -= 5;
            if (integrationRiskScore < 0) integrationRiskScore = 0;

            // Task 40: Application Effectiveness hesablanması
            double applicationEffectiveness = (modelAccuracy / 100.0) * (1 - privacyRisk * 0.1);

            // Task 41: Application Effectiveness çapı
            System.out.printf("Application Effectiveness: %.2f%n", applicationEffectiveness);

            // Nəticələri çap edək
            printIntegrationState(integrationRiskScore, expectedLoss, applicationEffectiveness);
        }
    }

    // Integration nəticələrini çap edən metod
    private void printIntegrationState(int integrationRiskScore, double expectedLoss, double applicationEffectiveness) {
        System.out.println("\n--- Integration Results ---");
        System.out.printf("Budget: %.2f AZN%n", initialBudget);
        System.out.println("Model Accuracy: " + modelAccuracy);
        System.out.println("Project Phase: " + projectPhase);
        System.out.printf("Regulation Penalty: %.2f AZN%n", regulationPenalty);
        System.out.println("Privacy Risk: " + privacyRisk);
        System.out.println("Data Quality Score: " + dataQualityScore);
        System.out.println("Integration Risk Score: " + integrationRiskScore);
        System.out.printf("Expected Loss: %.2f%n", expectedLoss);
        System.out.printf("Application Effectiveness: %.2f%n", applicationEffectiveness);
    }
    public void runCreditRiskForecast() {
        if (!applicationStopped) {
            System.out.println("\n--- 6. Credit Risk Forecast and Monitoring ---");

            // Task 42: Forecasted Default Rate (5–20)
            int forecastedDefaultRate = 5 + random.nextInt(16); // [5,20]

            // Task 43: Net Model Value = Budget - Penalty
            double netModelValue = initialBudget - regulationPenalty;

            // Task 44–46: Şərtlərə görə dəyişikliklər
            if (forecastedDefaultRate < 10) {
                // Task 45: Default Rate < 10 → Budget +50000
                initialBudget += 50000.0;
                System.out.println("✔ Low Default Rate (<10): Budget +50000 (Success Bonus)");
            } else if (forecastedDefaultRate > 15) {
                // Task 46: Default Rate > 15 → Penalty +30000
                regulationPenalty += 30000.0;
                System.out.println("⚠ High Default Rate (>15): Penalty +30000");
            }

            // Task 47: 4 mərhələli monitorinq döngüsü
            for (int i = 1; i <= 4; i++) {
                System.out.println("\nMonitoring Period " + i);

                // Task 48: Accuracy -1 (Wear)
                modelAccuracy--;

                // Task 49: Project Phase +1
                projectPhase++;

                // Task 50: Budget -2000 (Operational Costs)
                initialBudget -= 2000.0;
            }

            // Task 51: do-while döngüsü → Privacy Risk > 0 olduğu müddətcə
            do {
                // Task 52: Privacy Risk -1, Data Quality +5
                if (privacyRisk > 0) {
                    privacyRisk--;
                    dataQualityScore += 5;
                    System.out.println("✔ Privacy Risk reduced by 1, Data Quality +5");
                }
            } while (privacyRisk > 0);

            // Task 53: Döngü dayandırılır (şərt artıq təmin olunmur)

            // Nəticələri çap edək
            printCreditRiskState(forecastedDefaultRate, netModelValue);
        }
    }

    // Kredit Risk nəticələrini çap edən metod
    private void printCreditRiskState(int forecastedDefaultRate, double netModelValue) {
        System.out.println("\n--- Credit Risk Forecast Results ---");
        System.out.printf("Budget: %.2f AZN%n", initialBudget);
        System.out.println("Model Accuracy: " + modelAccuracy);
        System.out.println("Project Phase: " + projectPhase);
        System.out.printf("Regulation Penalty: %.2f AZN%n", regulationPenalty);
        System.out.println("Privacy Risk: " + privacyRisk);
        System.out.println("Data Quality Score: " + dataQualityScore);
        System.out.println("Forecasted Default Rate: " + forecastedDefaultRate);
        System.out.printf("Net Model Value: %.2f%n", netModelValue);
    }
    public void runEthicsTransparencyAudit(Scanner scanner) {
        if (!applicationStopped) {
            System.out.println("\n--- 7. Ethics and Transparency Audit ---");

            // Task 54: Scanner ilə "Transparency Step" alınır
            System.out.println("Choose Transparency Step (1: Full Transparency, 2: Partial Explanation): ");
            int choice = scanner.nextInt();

            // Task 55–57: if-else ilə yoxlama
            if (choice == 1) {
                // Task 56: Full Transparency → Penalty -10000, Accuracy -5
                regulationPenalty -= 10000.0;
                modelAccuracy -= 5;
                System.out.println("✔ Full Transparency: Penalty -10000, Accuracy -5");
            } else if (choice == 2) {
                // Task 57: Partial Explanation → Data Quality +10, Penalty +5000
                dataQualityScore += 10;
                regulationPenalty += 5000.0;
                System.out.println("✔ Partial Explanation: Data Quality +10, Penalty +5000");
            } else {
                System.out.println("Invalid choice. Please select 1 or 2.");
            }

            // Task 58: switch-case ilə Data Quality Score təhlili
            // Task 58–60: Data Quality Score təhlili
            if (dataQualityScore < 80) {
                // Task 60: Əgər <80 → applicationStopped = true
                applicationStopped = true;
                System.out.println("❌ Data Quality below 80. Application stopped!");
            } else if (dataQualityScore >= 80 && dataQualityScore <= 90) {
                System.out.println("ℹ Data Quality between 80–90. No major change.");
            } else {
                // Task 59: Əgər >90 → Project Phase +2
                projectPhase += 2;
                System.out.println("✔ Data Quality above 90: Project Phase +2");
            }

            // Task 61: Ethics Compliance Index hesablanması
            double ethicsComplianceIndex = (dataQualityScore / 100.0) - (privacyRisk * 0.1);

            // Task 62: Ethics Compliance Index çapı
            System.out.printf("Ethics Compliance Index: %.2f%n", ethicsComplianceIndex);

            // Task 63–65: 2 dəfə təkrarlanan döngü
            for (int i = 1; i <= 2; i++) {
                regulationPenalty -= 1000.0;
                initialBudget -= 500.0;
                System.out.println("✔ Audit Adjustment: Penalty -1000, Budget -500");
            }

            // Nəticələri çap edək
            printEthicsState(ethicsComplianceIndex);
        }
    }

    // Ethics nəticələrini çap edən metod
    private void printEthicsState(double ethicsComplianceIndex) {
        System.out.println("\n--- Ethics & Transparency Results ---");
        System.out.printf("Budget: %.2f AZN%n", initialBudget);
        System.out.println("Model Accuracy: " + modelAccuracy);
        System.out.println("Project Phase: " + projectPhase);
        System.out.printf("Regulation Penalty: %.2f AZN%n", regulationPenalty);
        System.out.println("Privacy Risk: " + privacyRisk);
        System.out.println("Data Quality Score: " + dataQualityScore);
        System.out.printf("Ethics Compliance Index: %.2f%n", ethicsComplianceIndex);
    }
    public void runFinalDecisionReport(Scanner scanner) {
        if (!applicationStopped) {
            System.out.println("\n--- 8. Final Project Approval Protocol ---");

            // Task 66: Final Success Score hesablanması
            int finalSuccessScore = modelAccuracy + dataQualityScore - (int)(regulationPenalty / 1000);

            // Task 67: Scanner ilə Director Approval Code alınır
            System.out.println("Enter Director Approval Code (1: Approve, 2: Postpone, 3: Cancel): ");
            int approvalCode = scanner.nextInt();

            // Task 68: switch-case ilə kod yoxlanılır
            switch (approvalCode) {
                case 1:
                    // Task 69: Approve → Budget +100000
                    initialBudget += 100000.0;
                    System.out.println("✔ Project Approved: Budget +100000");
                    break;

                case 2:
                    // Task 70: Postpone → Penalty +20000, Phase -2
                    regulationPenalty += 20000.0;
                    projectPhase -= 2;
                    System.out.println("⚠ Project Postponed: Penalty +20000, Phase -2");
                    break;

                case 3:
                    // Task 71: Cancel → applicationStopped = true, Budget -50000
                    applicationStopped = true;
                    initialBudget -= 50000.0;
                    System.out.println("❌ Project Cancelled: Budget -50000, Application Stopped");
                    break;

                default:
                    System.out.println("Invalid code. Please select 1, 2, or 3.");
            }

            // Task 72: if-else if-else ilə sonluqlar
            if (finalSuccessScore > 180 && !applicationStopped) {
                System.out.println("🎉 Perfect Success: Final Success Score > 180 and Application not stopped.");
            } else if (regulationPenalty < 10000.0 && modelAccuracy > 85) {
                System.out.println("✔ Conditional Approval: Penalty < 10000 and Accuracy > 85.");
            } else if (applicationStopped && privacyRisk > 0) {
                System.out.println("❌ Project Cancelled due to Privacy Risk.");
            }

            // Task 73: Future AI Improvement Budget = Budget * 0.1
            double futureImprovementBudget = initialBudget * 0.1;

            // Task 74–79: Yekun dəyərlərin çapı
            System.out.println("\n--- Final Project Report ---");
            System.out.println("Final Project Phase: " + projectPhase);          // Task 74
            System.out.printf("Final Regulation Penalty: %.2f%n", regulationPenalty); // Task 75
            System.out.printf("Final Budget: %.2f%n", initialBudget);            // Task 76
            System.out.println("Final Model Accuracy: " + modelAccuracy);        // Task 77
            System.out.println("Final Data Quality Score: " + dataQualityScore); // Task 78
            System.out.println("Final Privacy Risk: " + privacyRisk);            // Task 79
            System.out.printf("Future AI Improvement Budget: %.2f%n", futureImprovementBudget);

            // Task 80: Scanner bağlanır
            scanner.close();
        }
    }

}


