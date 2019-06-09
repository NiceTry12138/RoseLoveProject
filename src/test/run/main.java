package test.run;

import com.Pojo.Usrs;
import com.Service.GetMail;
import com.Service.GetUsrPhoto;
import com.Service.randUsrs;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {

    @Test
    public void main() throws InterruptedException, SQLException, IOException, XMLParserException, InvalidConfigurationException {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("lib/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetMail getMail  = (GetMail) ac.getBean("getMail");
        System.out.println(getMail.getSendEmail("123456@qq.com").toString());
    }

    /**
     * var json = JSON.parse(text);
     * json[0].emailid
     *
     */

    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        randUsrs usrs  = (randUsrs) ac.getBean("randUsrs");
        System.out.println(usrs.getTheUsrByMail("123456@qq.com").toString());
    }

    @Test
    public void test3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUsrPhoto getUsrPhoto  = (GetUsrPhoto) ac.getBean("getUsrPhoto");
        String test = "asdfasdfasdfasdfasdf";

        getUsrPhoto.saveUsrPhoto("123456@qq.com", test.getBytes());
    }

}
