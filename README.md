# Password_Encryption_SOAP_WS
SOAP Web Service made with SpringBoot for Encrypting passwords using JWT and some algorihtms that i may create by myself or copy from computerphile (Youtube)


    private static String GetCronFromNormal( String hour, String days, boolean constant ) {
        List<String> baseHour;
        String returnCron;

        if(hour.contains(".")){
            baseHour = Arrays.asList(hour.split(":"));
            String[] baseMinutes = baseHour.get(1).split("\\.");

            if(constant){
                returnCron = baseMinutes[1] + " " + baseMinutes[0]+ "/0 " + baseHour.get(0) + " * * " + days;
            }else{
                returnCron = baseMinutes[1] + " " + baseMinutes[0] + " " + baseHour.get(0) + " * * " + days;
            }

        }else {
            baseHour = Arrays.asList(hour.split(":"));
            if(constant){
                returnCron = "0 " + baseHour.get(1) + "/0 " + baseHour.get(0) + " * * " + days;
            }else{
                returnCron = "0 " + baseHour.get(1) + " " + baseHour.get(0) + " * * " + days;
            }
        }

        return returnCron;
    }
