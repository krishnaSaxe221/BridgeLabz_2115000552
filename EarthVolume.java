public class EarthVolume {
    public static void main(String[] args) {
        // Constants
        final double EARTH_RADIUS_KM = 6378.0; // in kilometers
        final double KM_TO_MILES = 0.621371;   // Conversion factor from km to miles

        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(EARTH_RADIUS_KM, 3);

        // Convert radius to miles and calculate volume in cubic miles
        double radiusMiles = EARTH_RADIUS_KM * KM_TO_MILES;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Print the results
        System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f.%n", volumeKm3, volumeMiles3);
    }

}
