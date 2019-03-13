
public class robotbil {
    
	public static int MIN_DISTANCE = 20; // cm
	
	public static int readObstacleDistance() {
        return 0;
    }
	
	public static int readDistanceToLine() {
			return 0;
    }
	
	public static void steer(int distanceToLine) {
	}
	
	public static void stop() {
		
	}
	
	public static void _drive() {
		
	}
	
	public static void main(String[] args) {
		// Starta bilen
		// Mät avstånd hinder
		int distance = readObstacleDistance();
		// Gasa om ok
		if (distance > MIN_DISTANCE) {
			_drive();
		}
		
					
		// Hela tiden: 
		while (true) {
		//     Mät avstånd till linje
			int distanceToLine = readDistanceToLine();
		//     Styr mot linje
			steer(distanceToLine);
		//     Mät avstånd till hinder
			distance = readObstacleDistance();
	    //     Stanna om hinder för nära
		//     Stanna om avståndet är för litet annars kör
			if (distance > MIN_DISTANCE) {
				_drive();
			}
			else {
				stop();
			}
		

	}

}
}