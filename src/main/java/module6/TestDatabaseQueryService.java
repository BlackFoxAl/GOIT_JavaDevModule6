package module6;

import module6.model.*;

import java.util.List;

public class TestDatabaseQueryService {
    public static void main(String[] arg) {
        List<MaxProjectCountClient> maxProjectCountClients = new DatabaseQueryService().findMaxProjectsClient();
        System.out.println("First query Max Project Count Client:");
        System.out.println("Client's name | count projects");
        for (MaxProjectCountClient maxProjectsClient : maxProjectCountClients) {
            System.out.println(maxProjectsClient.getName() + "          " +
                               maxProjectsClient.getProjectCount());
        }

        List<LongestProject> findLongestProjects = new DatabaseQueryService().findLongestProject();
        System.out.println("Second query Find Longest Project:");
        System.out.println("Project's name | count months");
        for (LongestProject longestProject : findLongestProjects) {
            System.out.println(longestProject.getName() + "            " +
                               longestProject.getMonthCount());
        }

        List<MaxSalaryWorker> maxMaxSalaryWorkers = new DatabaseQueryService().findMaxSalaryWorker();
        System.out.println("Third query Max Salary Workers:");
        System.out.println("Worker's name | salary");
        for (MaxSalaryWorker maxMaxSalaryWorker : maxMaxSalaryWorkers) {
            System.out.println(maxMaxSalaryWorker.getName() +
                       "   " + maxMaxSalaryWorker.getSalary());
        }

        List<YoungestEldestWorker> youngestEldestWorkers = new DatabaseQueryService().findYoungestEldestWorkers();
        System.out.println("Fourth query Find Youngest and Eldest Workers:");
        System.out.println("worker's type | worker's name | worker's birthday");
        for (YoungestEldestWorker youngestEldestWorker : youngestEldestWorkers) {
            System.out.println(youngestEldestWorker.getType() + "          " +
                               youngestEldestWorker.getName() + "     " +
                               youngestEldestWorker.getBirthday());
        }

        List<ProjectPrice> projectPrices = new DatabaseQueryService().printProjectPrices();
        System.out.println("Fifth query Print Project's Prices:");
        System.out.println("Project's name | price");
        for (ProjectPrice projectPrice : projectPrices) {
            System.out.println(projectPrice.getName() +
                    "         " + projectPrice.getPrice());
        }
    }
}
