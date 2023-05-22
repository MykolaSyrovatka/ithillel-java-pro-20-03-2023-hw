package ua.ithilell.hw13;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class FileData implements Comparable<FileData> {
    private String name;
    private Long size;
    private String path;

    public FileData(String name, Long size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FileData fileData)) return false;
        return Objects.equals(name, fileData.name) && Objects.equals(size, fileData.size) && Objects.equals(path, fileData.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, path);
    }


    public int compareTo(FileData fileData) {
        if (this.size - fileData.size>0){
           return 1;
        } else if (this.size - fileData.size<0) {
            return -1;
        } else {
            return 0;
        }
    }
}
