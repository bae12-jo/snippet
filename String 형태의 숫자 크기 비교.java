// sort string array with append two string in decreasing order
Arrays.sort(strNumbers, new Comparator<String>(){
    @Override
    public int compare(String o1, String o2){
        return (o2+o1).compareTo(o1+o2);
    }
});
