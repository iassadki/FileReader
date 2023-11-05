package modele;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class JsonFileReader extends TextFileReader { 

    private String fileName;

    public JsonFileReader(String fileName) {
        super(fileName);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
    
}
