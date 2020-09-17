import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.util.List;

public class myXpath {

    private File file;

    public myXpath(File file) {
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public NodeList getTutorials() {
        FileInputStream fileIS = new FileInputStream(this.getFile());
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory
                                                    .newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document xmlDocument = builder.parse(fileIS);
        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "/Tutorials/Tutorial";

        NodeList nodeList = (NodeList) xPath.compile(expression)
            .evaluate(xmlDocument, XPathConstants.NODESET);

        return nodeList;
    }

    public static void readFile(String fileName) {
        try {
            String actual = Files.readString(Path.of(fileName));
            System.out.println(actual);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String fileName = "test.xml";

        // readFile(fileName);

        myXpath myxpath = new myXpath(new File(fileName));
        NodeList tutorialList = myxpath.getTutorials();
        System.out.println("Tutorials: " + tutorialList);
    }

}
