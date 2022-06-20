package Challange;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class DataRunner {
    
    private SAXParser createSaxParser(){
        
        SAXParser saxParser = null;

        try{  
            SAXParserFactory factory = SAXParserFactory.newInstance();
            saxParser = factory.newSAXParser();
            
            return saxParser;

        }catch (ParserConfigurationException | SAXException ex){
            Logger lgr = Logger.getLogger(DataRunner.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return saxParser;
    }

    public List<Data> parseUsers(){
        
        DataHandler handler = new DataHandler();
        String fileName = "Challange/data.xml";
        File xmlDocument = Paths.get(fileName).toFile();

        try{
            SAXParser parser = createSaxParser();
            parser.parse(xmlDocument, handler);

        }catch (SAXException | IOException ex){
            Logger lgr = Logger.getLogger(DataRunner.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return handler.getUsers();
    }
}
