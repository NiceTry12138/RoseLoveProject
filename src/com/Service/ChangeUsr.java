package com.Service;

import com.Mapper.UsrsMapper;
import com.Pojo.Usrs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Service
public class ChangeUsr {
    @Autowired
    UsrsMapper usrsMapper;

    public void UpdateUsrHeight(String mail, String height){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        usrs.setUsrheight((new Integer(height)).floatValue());
        usrsMapper.updateByPrimaryKey(usrs);
        System.out.println("update height 调用");
    }
    public void UpdateUsrBirth(String mail, String date) throws ParseException {
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simpleDateFormat.parse(date);
        usrs.setUsrbirth(date1);
        usrsMapper.updateByPrimaryKey(usrs);
        System.out.println("update birth 调用");
    }
    public void UpdateUsrIncome(String mail, String Income){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        usrs.setUsrincome(new Integer(Income));
        usrsMapper.updateByPrimaryKey(usrs);
        System.out.println("update income 调用");
    }
    public void UpdateUsrPassword(String mail, String passwd){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        usrs.setUsrspassword(passwd);
        usrsMapper.updateByPrimaryKey(usrs);
        System.out.println("update password 调用");
    }
    public void UpdateUsrOccupation(String mail, String Occupation){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        usrs.setUsroccupation(Occupation);
        usrsMapper.updateByPrimaryKey(usrs);
        System.out.println("update occupation 调用");
    }
    public void UpdateUsrSex(String mail, String sex){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        usrs.setUsrsex(sex);
        usrsMapper.updateByPrimaryKey(usrs);
        System.out.println("update sex 调用 = " + sex);

    }
    public void UpdateUsrEducation(String mail, String education){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        usrs.setUsreducation(education);
        usrsMapper.updateByPrimaryKey(usrs);
        System.out.println("update education 调用 = " + education);
    }
    public void UpdateUsrBrideState(String mail, String state){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        usrs.setUsrmaritalstate(mail);
        usrsMapper.updateByPrimaryKey(usrs);
        System.out.println("update brideState 调用 = " + state);
    }
    public void UpdateUsrSignature(String mail, String signature){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        usrs.setUsrssignature(signature);
        usrsMapper.updateByPrimaryKey(usrs);
        System.out.println("update signature 调用 = " + signature);
    }
    public void UpdateUseConstellation(String mail, String constellation){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        usrs.setUsrconstellation(constellation);
        usrsMapper.updateByPrimaryKey(usrs);
        System.out.println("update constellation 调用 = " + constellation);
    }
    public void UpdateUsrPhotoState(String mail, String photoState){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        usrs.setUsrphotostate(photoState);
        usrsMapper.updateByPrimaryKey(usrs);
        System.out.println("update photoState 调用 = " + photoState );
    }
}
