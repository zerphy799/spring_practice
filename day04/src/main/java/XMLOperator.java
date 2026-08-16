import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.FactoryBean;

import javax.swing.text.Document;

public class XMLOperator {
    public static Document getDoc (){
        SAXReader saxReader = new SAXReader();
        Document document = null;
        try {
            document = (Document) saxReader.read(XMLOperator.class.getClassLoader().getResourceAsStream("factoryBean.xml"));
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
        return document;
    }
}
