List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(count.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>(){
           @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
                return o2.getValue() - o1.getValue();
            }
        });
