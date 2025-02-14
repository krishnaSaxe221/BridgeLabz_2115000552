class CircularTour {

    // Function to find the starting petrol pump index
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalPetrol = 0, totalDistance = 0;
        int start = 0, tank = 0;

        for (int i = 0; i < n; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];
            tank += petrol[i] - distance[i];

            // If tank becomes negative, reset start position to next pump
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return (totalPetrol >= totalDistance) ? start : -1;
    }

    // Main function to test the implementation
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = findStartingPoint(petrol, distance);
        System.out.println("Starting petrol pump index: " + startIndex);
    }
}

