package com.Service;

import com.Mapper.UsrsMapper;
import com.Pojo.Usrs;
import com.Pojo.UsrsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class SaveUsr {
    @Autowired
    private UsrsMapper usrsMapper;

    public void saveUsrs(Usrs usrs){
        usrsMapper.insert(usrs);
        System.out.println("用户保存成功");
    }

    public void saveUsrsHeadPhoto(String mail, byte[] inputByte){

    }

    public void saveUsrsOtherePhotos(String mail, byte[] inputByte, int id){

    }

}
