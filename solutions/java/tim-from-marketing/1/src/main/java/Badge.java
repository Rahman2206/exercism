class Badge {
    public String print(Integer id, String name, String department) {

        if (id == null && department != null){
            department = department.toUpperCase();
            String badgesline = "%s - %s";
            String result =  String.format(badgesline,name, department);
            return result;
        }

        else if (department == null && id == null){
            String badgesline = "%s - OWNER";
            String result =  String.format(badgesline, name);
            return result;
        }
        else if (department == null){
            String badgesline = "[%d] - %s - OWNER";
            String result =  String.format(badgesline, id, name);
            return result;
        }
        
        else
        {
            department = department.toUpperCase();
            String badgesline = "[%d] - %s - %s";
            String result =  String.format(badgesline, id, name, department);
            return result;
        }
        
    }
}
