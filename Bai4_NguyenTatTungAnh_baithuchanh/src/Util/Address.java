package test;

public class Address {
    public static final String CITYNAME = "No CityName";
    public static final String DISTRICTNAME = "No DistrictName";
    public static final String STREETNAME = "No StreetName";
    private String cityName;
    private String districtName;
    private String streetName;
    public Address(){
        this(Address.CITYNAME,Address.DISTRICTNAME,Address.STREETNAME);
    }
    public Address(String cityName, String districtName, String streetName){
        this.cityName = cityName;
        this.districtName = districtName;
        this.streetName = streetName;
    }
    public Address(Address add){
        this(add.getCityName(), add.getDistrictName(), add.getStreetName());
    }
}
