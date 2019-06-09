package com.Service;

import com.Mapper.ActivityMapper;
import com.Pojo.Activity;
import com.Pojo.ActivityExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class ActivityService {

    @Autowired
    ActivityMapper activityMapper;

    public List<Activity> allActivity(){
        ActivityExample activityExample = new ActivityExample();
        activityExample.createCriteria().andActivityifdeletedEqualTo("false"); // false 表示没有被删除
        return activityMapper.selectByExample(activityExample);
    }

    public List<Activity> myActivity(String mail){
        ActivityExample activityExample = new ActivityExample();
        activityExample.createCriteria().andActivityorganizeremailEqualTo(mail).andActivityifdeletedEqualTo("false");
        List<Activity> activities = activityMapper.selectByExample(activityExample);
        return activities;
    }

    public void deleteActivity(Integer id){
        Activity activity = activityMapper.selectByPrimaryKey(id);
        activity.setActivityifdeleted("true");
    }

    public void addActivity(Activity activity){
        activityMapper.insert(activity);
    }

}
