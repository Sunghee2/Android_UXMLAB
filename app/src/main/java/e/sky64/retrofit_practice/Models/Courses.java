package e.sky64.retrofit_practice.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sky64 on 2018-02-18.
 */
// course DB에 저장되어 있는 data들을 가져오기 위해서 사용되는 데이터 관리 클래스
public class Courses {
        @SerializedName("is_my_course")
        @Expose
        private boolean isMyCourse;  // 등록된 강의가 있으면 1 없으면 0
        @SerializedName("my_course")
        @Expose
        private List<Course> myCourse = null; // 내 강의 리스트
        @SerializedName("all_course")
        @Expose
        private List<Course> allCourse = null;  // 내 강의를 제외한 전체 강의 리스트

        public boolean getIsMyCourse() {
            return isMyCourse;
        }

        public List<Course> getMyCourse() {
            return myCourse;
        }

        public void setMyCourse(List<Course> myCourse) {
            this.myCourse = myCourse;
        }

        public List<Course> getAllCourse() {
            return allCourse;
        }

        public void setAllCourse(List<Course> allCourse) {
            this.allCourse = allCourse;
        }

    }
