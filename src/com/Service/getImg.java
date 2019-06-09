package com.Service;

import com.Mapper.PhotoMapper;
import com.Mapper.UsrsMapper;
import com.Pojo.Photo;
import com.Pojo.PhotoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class getImg {
    @Autowired
    PhotoMapper photoMapper;
    @Autowired
    UsrsMapper usrsMapper;

    public byte[] getUsrHead(String mail){
        PhotoExample photoExample = new PhotoExample();
        PhotoExample.Criteria criteria = photoExample.createCriteria();
        criteria.andUsremailEqualTo(mail);
        List<Photo> list = photoMapper.selectByExample(photoExample);
        if (list.size() == 0){
            return null;
        }
        return list.get(0).getPhotocontent();
    }

    public byte[] getUsrPhoto(String mail){
        return null;
    }
}
