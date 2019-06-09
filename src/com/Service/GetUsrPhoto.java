package com.Service;

import com.Mapper.PhotoMapper;
import com.Mapper.UsrsMapper;
import com.Pojo.Photo;
import com.Pojo.PhotoExample;
import com.Pojo.Usrs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class GetUsrPhoto {

    @Autowired
    UsrsMapper usrsMapper;
    @Autowired
    PhotoMapper photoMapper;

    public List<byte[]> getUsrPhoto(String mail){
        PhotoExample example = new PhotoExample();
        example.createCriteria().andUsremailEqualTo(mail);
        List<Photo> photos = photoMapper.selectByExample(example);
        List<byte[]> bytes = new ArrayList<>();
        for (Photo photo : photos){
            byte[] inbytes = photo.getPhotocontent();
            bytes.add(inbytes);
        }
        return bytes;
    }

    public void saveUsrPhoto(String mail, byte[] input){
        Photo photo = new Photo();
        photo.setPhotocontent(input);
        photo.setUsremail(mail);
        photoMapper.insert(photo);
    }

    public boolean updateUsrHeadPhoto(String mail, byte[] input){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        int id = usrs.getUsrheadsculptureid();
        Photo photo = photoMapper.selectByPrimaryKey(id);
        photo.setPhotocontent(input);
        photoMapper.updateByPrimaryKey(photo);
        return true;
    }

}
