public class Test11 {
    public static void main(String[] args) {
        double birthPerYear=365*24*60*60/7.0;
        double deathPerYear=365*24*60*60/13.0;
        double immigrantPerYear=365*24*60*60/45.0;
        double change=birthPerYear+immigrantPerYear-deathPerYear;
        double populationPerYear=312032486;
        for(int i=0;i<5;i++)
        {
            populationPerYear=populationPerYear+change;
            System.out.println("PopulationPerYear"+(i+1)+"="+populationPerYear);
        }

    }
}
