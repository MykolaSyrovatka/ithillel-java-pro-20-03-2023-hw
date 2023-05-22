package ua.ithilell.hw13;

import java.io.File;
import java.util.*;

public class FileNavigator {

    private Map<String, Set<FileData>> fileDataMap;

    public FileNavigator() {
        this.fileDataMap = new HashMap<>();
    }

    public void add(File file){
        if (!fileDataMap.containsKey(file.getParent())){
            Set<FileData> fileDataHashSet = new HashSet<>();
            fileDataHashSet.add(new FileData(file.getName(), file.length(), file.getPath()));
            fileDataMap.put(file.getParent(), fileDataHashSet);
        } else {
            Set<FileData> fileDataHashSet = fileDataMap.get(file.getParent());
            fileDataHashSet.add(new FileData(file.getName(), file.length(), file.getPath()));
            fileDataMap.replace(file.getParent(),fileDataHashSet);
        }
    }
    public Set<FileData> find(String path){
        return fileDataMap.get(path);
    }
    public List<FileData> filterBySize(int bites){
        List<FileData> fileDataList = new ArrayList<>();
        Iterator<String> iteratorMap = fileDataMap.keySet().iterator();
        while (iteratorMap.hasNext()){
            Set<FileData> fileDataHashSet = find(iteratorMap.next());
            Iterator<FileData> iteratorSet = fileDataHashSet.iterator();
            while (iteratorSet.hasNext()){
                FileData fileData= iteratorSet.next();
                if(fileData.getSize()<=bites){
                    fileDataList.add(fileData);
                }
            }
        }
        return fileDataList;
    }
    public void remove(String path){
        fileDataMap.remove(path);
    }
    public List<FileData> sortBySize(){
        List<FileData> fileDataList = new ArrayList<>();
        Iterator<String> iteratorMap = fileDataMap.keySet().iterator();
        while (iteratorMap.hasNext()){
            Set<FileData> fileDataHashSet = find(iteratorMap.next());
            Iterator<FileData> iteratorSet = fileDataHashSet.iterator();
            while (iteratorSet.hasNext()){
                FileData fileData= iteratorSet.next();
                fileDataList.add(fileData);
            }
        }
        Collections.sort(fileDataList);
        return fileDataList;
    }
}
